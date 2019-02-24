class MyMemoryButton extends Button implements ActionListener  
{  
    MyCalculator cl;  
    
/////////////////////////////////  
    MyMemoryButton(int x,int y, int width,int height,String cap, MyCalculator clc)  
    {  
        super(cap);  
        setBounds(x,y,width,height);  
        this.cl=clc;  
        this.cl.add(this);  
        addActionListener(this);  
    }  
////////////////////////////////////////////////  
    public void actionPerformed(ActionEvent ev)  
    {  
        char memop=((MyMemoryButton)ev.getSource()).getLabel().charAt(1);  
        
        cl.setClear=true;  
        double temp=Double.parseDouble(cl.displayLabel.getText());  
        
        switch(memop)  
        {  
            case 'C':   
                cl.memLabel.setText(" ");cl.memValue=0.0;break;  
            case 'R':   
                cl.displayLabel.setText(MyCalculator.getFormattedText(cl.memValue));break;  
            case 'S':  
                cl.memValue=0.0;  
            case '+':   
                cl.memValue+=Double.parseDouble(cl.displayLabel.getText());  
                if(cl.displayLabel.getText().equals("0") || cl.displayLabel.getText().equals("0.0")  )  
                    cl.memLabel.setText(" ");  
                else   
                    cl.memLabel.setText("M");     
                break;  
        }//switch  
    }//actionPerformed  
}//class  

/*****************************************/  

class MySpecialButton extends Button implements ActionListener  
{  
    MyCalculator cl;  
    
    MySpecialButton(int x,int y, int width,int height,String cap, MyCalculator clc)  
    {  
        super(cap);  
        setBounds(x,y,width,height);  
        this.cl=clc;  
        this.cl.add(this);  
        addActionListener(this);  
    }  
//////////////////////  
    static String backSpace(String s)  
    {  
        String Res="";  
        for(int i=0; i<s.length()-1; i++) Res+=s.charAt(i);  
        return Res;  
    }  
    
//////////////////////////////////////////////////////////  
    public void actionPerformed(ActionEvent ev)  
    {  
        String opText=((MySpecialButton)ev.getSource()).getLabel();  
//check for backspace button  
        if(opText.equals("Backspc"))  
        {  
            String tempText=backSpace(cl.displayLabel.getText());  
            if(tempText.equals(""))   
                cl.displayLabel.setText("0");  
            else   
                cl.displayLabel.setText(tempText);  
            return;  
        }  
//check for "C" button i.e. Reset  
        if(opText.equals("C"))   
        {  
            cl.number=0.0; cl.op=' '; cl.memValue=0.0;  
            cl.memLabel.setText(" ");  
        }  
        
//it must be CE button pressed  
        cl.displayLabel.setText("0");cl.setClear=true;  
    }//actionPerformed  
}//class  