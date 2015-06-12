/* Derrick Fox
 * CS 213 31015
 * CheckingAccount.java Project 2
 * April 7th, 2014
 * CheckingAccount Class
 * 
 * This is a class that creates methods for adding, subtracting, and reporting funds in a checking account. 
 * 
 */


public class CheckingAccount extends BankAccount{
	//Constant declared for checking account fee.
	static final double FEE = 0.15;
	
	//Constructor with account owner name parameter and initial account amount parameter. 
	public CheckingAccount(String name, double amount) {
		setOwner(name);
		setBalance(amount);
	}
	
	//Method to withdraw funds from the account
	public boolean withdraw(double amount) {
		amount = amount + FEE;
		if(super.withdraw(amount))
			return true;
		else
			return false;
	}
	
	//Method to assign specific checking account format to a bank account number
	public void setAccountNumber(String number) {
		accountNumber = accountNumber + "-10";
	}
}
