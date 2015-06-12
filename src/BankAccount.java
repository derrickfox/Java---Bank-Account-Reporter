/* Derrick Fox
 * CS 213 31015
 * BankAccount.java Project 2
 * April 7th, 2014
 * BankAccount Class
 * 
 * This is a class that creates methods for adding, subtracting, and reporting funds in a bank account. 
 * 
 */

import java.util.Date;

public class BankAccount {
	//Here we declare private instance variables
	protected double balance;
	private String owner;
	protected String accountNumber = "100001";
	static int numberOfAccounts = 0;
	
	//Here a default constructor is created with no parameters
	public BankAccount() {
		setAccountNumber(accountNumber);
		numberOfAccounts++;
	}
	//Here is a constructor with parameters
	public BankAccount(String name, double amount) {
		setAccountNumber(accountNumber);
		setOwner(name);
		setBalance(amount);
		numberOfAccounts++;
	}
	//Here is a constructor with parameters Old Account and balance.
	public BankAccount(BankAccount oldAccount, double amount) {
		this.balance = amount;
	}
	
	//Method to add money to an account
	public void deposit(double amount) {
		balance = balance + amount;
	}	
	//Method to withdraw money from account
	public boolean withdraw(double amount) {
		if(balance >= amount) {
			balance = balance - amount;
			return true;
		}
		else
			return false;
	}	
	//Method to return account balance to the user
	public double getBalance() {
		return balance;
	}		
	//Method to return the name of the account owner to the user
	public String getOwner() {
		return owner;
	}	
	//Method to return the account number to the user
	public String getAccountNumber() {
		return accountNumber;
	}	
	//Method that assigns an initial account balance
	public void setBalance(double amount) {
		balance = amount;
	}
	//Method that assigns an account number
	public void setAccountNumber(String newAccountNumber) {
		int newNumber = Integer.parseInt(newAccountNumber);
		int newAccNum = newNumber + numberOfAccounts;
		String newNum = Integer.toString(newAccNum);
		accountNumber = newNum;
	}
	
	//Method to return account balance to the user
	public double getTotal() {
		return balance;
	}
	//Method to set the name of the account owner
	public void setOwner(String name) {
		owner = name;
	}
}

