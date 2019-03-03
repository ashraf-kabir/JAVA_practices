public class Test {
    
    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(20000.00);
        SavingsAccount saver2 = new SavingsAccount(30000.00);
        
        saver1.calculateMonthlyInterest();
        saver1.printSavingsBalance( );
        
        saver2.modifyInterestRate(5.5);
        saver2.calculateMonthlyInterest();
        saver2.printSavingsBalance();
    }
    
}
