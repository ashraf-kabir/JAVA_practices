public class CircularArray{
    
    private int start;
    private int size;
    private Object [] cir;
    
    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object [] lin, int st, int sz){
        //TO DO
        start=st;
        size=sz;
        cir=new Object[lin.length];
        
        int k = start;
        for (int i=0; i<lin.length; i++){
            cir[k]=lin[i];
            k=(k+1)%cir.length;
        }
    }
    
    //Prints from index --> 0 to cir.length-1
    public void printFullLinear(){
        //TO DO
        for (int i=0; i<cir.length; i++){
            if (i==cir.length-1){
                System.out.printf(cir[i]+".");
            } else{
                System.out.printf(cir[i]+", ");
            }
        }
        System.out.println();
    }
    
    // Starts Printing from index start. Prints a total of size elements
    public void printForward(){
        //To DO
        int k=start;
        for (int i=0; i<size; i++){
            if (i==size-1){
                System.out.print(".");
            } else{
                System.out.print(", ");
            }
            k=(k+1)&cir.length;
        }
        System.out.println();
    }
    
    
    public void printBackward(){
        //TO DO
        int last=((start+size)-1)%cir.length;
        for (int i=0; i<size; i++){
            if (last<0){
                last=cir.length-1;
            }
            if (i==size-1){
                System.out.print(cir[last]+".");
            } else{
                System.out.print(cir[last]+", ");
            }
            last--;
        }
        System.out.println();
    }
    
    // With no null cells
    public void linearize(){
        //TO DO
    }
    
    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity){
        //TO DO
    }
    
    // Start index becomes zero
    public void resizeByLinearize(int newcapacity){
        //TO DO
    }
    
    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos){
        //TO DO
    }
    
    public void insertByLeftShift(Object elem, int pos){
        //TO DO
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos){
        //TO DO
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos){
        //TO DO
    }
    
    
    //This method will check whether the array is palindrome or not
    public void palindromeCheck(){
        //TO DO
    }
    
    
    //This method will sort the values by keeping the start unchanged
    public void sort(){
        //TO DO
    }
    
    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k){
        //TO DO
        return false; // Remove this line
    }
}