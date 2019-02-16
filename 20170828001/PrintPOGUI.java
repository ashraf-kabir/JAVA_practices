import javax.swing.JOptionPane;

public class PrintPOGUI{
    public static void main(String[] args){
        
        String itemName;
        double price;
        int qty;
        
        itemName = JOptionPane.showInputDialog("Name of purchase item:");
        price = Double.parseDouble(JOptionPane.showInputDialog("Price of one item:"));
        qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));
        JOptionPane.showMessageDialog(null, "PURCHASE ORDER:\n\n"+
                                      "Item: "+itemName+"\nQuantity: "+qty+
                                      "\nTotal price: BDT "+price*qty+"/=");
    }
}
