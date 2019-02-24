class MyDigitButton extends Button implements ActionListener  
{  
    MyCalculator cl;  
    
//////////////////////////////////////////  
    MyDigitButton(int x,int y, int width,int height,String cap, MyCalculator clc)  
    {  
        super(cap);  
        setBounds(x,y,width,height);  
        this.cl=clc;  
        this.cl.add(this);  
        addActionListener(this);  
    }  
////////////////////////////////////////////////  
    static boolean isInString(String s, char ch)  
    {  
        for(int i=0; i<s.length();i++) if(s.charAt(i)==ch) return true;  
        return false;  
    }  
/////////////////////////////////////////////////  
    public void actionPerformed(ActionEvent ev)  
    {  
        String tempText=((MyDigitButton)ev.getSource()).getLabel();  
        
        if(tempText.equals("."))  
        {  
            if(cl.setClear)   
            {cl.displayLabel.setText("0.");cl.setClear=false;}  
            else if(!isInString(cl.displayLabel.getText(),'.'))  
                cl.displayLabel.setText(cl.displayLabel.getText()+".");  
            return;  
        }  
        
        int index=0;  
        try{  
            index=Integer.parseInt(tempText);  
        }catch(NumberFormatException e){return;}  
        
        if (index==0 && cl.displayLabel.getText().equals("0")) return;  
        
        if(cl.setClear)  
        {cl.displayLabel.setText(""+index);cl.setClear=false;}  
        else  
            cl.displayLabel.setText(cl.displayLabel.getText()+index);  
    }//actionPerformed  
}//class defination  

/********************************************/  

class MyOperatorButton extends Button implements ActionListener  
{  
    MyCalculator cl;  
    
    MyOperatorButton(int x,int y, int width,int height,String cap, MyCalculator clc)  
    {  
        super(cap);  
        setBounds(x,y,width,height);  
        this.cl=clc;  
        this.cl.add(this);  
        addActionListener(this);  
    }  
///////////////////////  
    public void actionPerformed(ActionEvent ev)  
    {  
        String opText=((MyOperatorButton)ev.getSource()).getLabel();  
        
        cl.setClear=true;  
        double temp=Double.parseDouble(cl.displayLabel.getText());  
        
        if(opText.equals("1/x"))  
        {  
            try  
            {double tempd=1/(double)temp;  
                cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}  
            catch(ArithmeticException excp)  
            {cl.displayLabel.setText("Divide by 0.");}  
            return;  
        }  
        if(opText.equals("sqrt"))  
        {  
            try  
            {double tempd=Math.sqrt(temp);  
                cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}  
            catch(ArithmeticException excp)  
            {cl.displayLabel.setText("Divide by 0.");}  
            return;  
        }  
        if(!opText.equals("="))  
        {  
            cl.number=temp;  
            cl.op=opText.charAt(0);  
            return;  
        }  
// process = button pressed  
        switch(cl.op)  
        {  
            case '+':  
                temp+=cl.number;break;  
            case '-':  
                temp=cl.number-temp;break;  
            case '*':  
                temp*=cl.number;break;  
            case '%':  
                try{temp=cl.number%temp;}  
                catch(ArithmeticException excp)  
                {cl.displayLabel.setText("Divide by 0."); return;}  
                break;  
            case '/':  
                try{temp=cl.number/temp;}  
                catch(ArithmeticException excp)  
                {cl.displayLabel.setText("Divide by 0."); return;}  
                break;  
        }//switch  
        
        cl.displayLabel.setText(MyCalculator.getFormattedText(temp));  
//cl.number=temp;  
    }//actionPerformed  
}//class  