public class SavingsAccount{
  
  public SavingsAccount(double sa){
    savingsBalance=sa;
  }
  
  public static double annualInterestRate;
  
  private double savingsBalance;
  
  public void calculateMonthlyInterest() 
  {
    savingsBalance+=((savingsBalance*annualInterestRate)/12);
  }
  
  public static void modifyInterestRate(double mi)
  {
    annualInterestRate=mi;
  }
  
  public void printSavingsBalance()
  {
    System.out.println("The current balance is : "+savingsBalance);
  }
  
}