
public class BankAccount {
	
	String name;
	double amount;
	 int accountNumber;
	 
	 //Creating a constructor for BankAccount.
	 
	 BankAccount(String name, double amount, int accountNumber){
		 
		 this.name=name;
		 this.amount=amount;
		 this.accountNumber=accountNumber;
		 
  }
	 public String getName() {
		 return name;
	 }
	 
	public double deposit(double amnt){
		 
		this.amount=this.amount + amnt;
		return amount;
	 }
	 
	public double withdraw(double amnt)
	 {
		 this.amount=this.amount - amnt;
		 return amount;
	 }
	 
	 void display() {
		  System.out.println("This is an account of " + this.name  + " and his balance is " + this.amount + " and Account number is " + this.accountNumber + " .");
	 }
	 
}
