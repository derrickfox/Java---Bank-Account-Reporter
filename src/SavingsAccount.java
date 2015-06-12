/* Derrick Fox
 * CS 213 31015
 * SavingsAccount.java Project 2
 * April 7th, 2014
 * SavingsAccount Class
 * 
 * This is a class that creates methods for adding, subtracting, and reporting funds in a savings account. 
 * 
 */

public class SavingsAccount extends BankAccount{
	//Instance variables for savings interest rate, number of savings accounts per user, and account numbers variable. 
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	//Constructor for a savings account with name and amount 
	public SavingsAccount(String name, double amount) {
		setOwner(name);
		setBalance(amount);
		accountNumber = accountNumber + "-" + savingsNumber;
	}
	
	//Constructor for a savings account with another savings account as a parameter as well as initial amount. 
	public SavingsAccount(SavingsAccount account, double amount) {
		setOwner(account.getOwner());
		savingsNumber = savingsNumber + 1;
		accountNumber = accountNumber + "-"+ savingsNumber;
	}
	
	//Method to determine how much the balance is after the interest has accured. 
	public void postInterest() {
		balance = (balance * (rate / 12)) + balance;
	}
}
