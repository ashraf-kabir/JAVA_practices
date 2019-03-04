public class Dog {
    
    private String color = "Black";
    private String action = "";
    public Dog() {
    }
    public Dog(String name) {
        color = name;
    }
    public void setColor(String x) {
        color = x;
    }
    public String getColor() {
        return color;
    }
    public void setAction(String y) {
        action = y;
    }
    public String getAction() {
        return action;
    }
    public void printDog() {
        System.out.println(getColor()+" is "+getAction());
    }
}
