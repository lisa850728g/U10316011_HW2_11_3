import java.util.*;

public class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	Account(){
		dateCreated = new java.util.Date();
	}
	
	Account(int newId , double newBalance){
		dateCreated = new java.util.Date();
		id = newId;
		balance = newBalance;
	}
	
	int getId(){
		return id;
	}
	
	void setId(int newId){
		id = newId;
	}
	
	double getBalance(){
		return balance;
	}
	
	void setBalance(int newBalance){
		balance = newBalance;
	}
	
	double getAnnualInterestRate(){
		return annualInterestRate ;
	}
	
	void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	double getMonthlyInterestRate(){
		return annualInterestRate / 12 ;
	}
	
	double getMonthlyInterest(){
		return balance * annualInterestRate / 100 / 12;
	}
	
	void withdraw(double takeMoney){
		balance -= takeMoney;
	}
	
	void deposit(double putMoney){
		balance += putMoney;
	}
	
	public String toString(){
		return "Today is " + getDateCreated() + ".\nNow you have $" + (int)getBalance() 
		+ "\nMonthly interest is " + getMonthlyInterest();
	}
	
	public static void main(String[] args){
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.saving();
		System.out.println(savingsAccount.toString());
		System.out.println();
		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.checking();
		System.out.println(checkingAccount.toString());
	}
}
