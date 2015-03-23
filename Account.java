import java.util.*;

public class Account{
	/**private variables*/
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	//no-arg constructor
	Account(){
		dateCreated = new java.util.Date();
	}
	
	//constructor
	Account(int newId , double newBalance){
		dateCreated = new java.util.Date();
		id = newId;
		balance = newBalance;
	}
	
	//the accessor method of id
	int getId(){
		return id;
	}
	//the mutator method of id
	void setId(int newId){
		id = newId;
	}
	
	//the accessor method of balance
	double getBalance(){
		return balance;
	}
	//the mutator method of balance
	void setBalance(int newBalance){
		balance = newBalance;
	}
	
	//the accessor method of annualInterestRate
	double getAnnualInterestRate(){
		return annualInterestRate ;
	}
	//the mutator method of annualInterestRate
	void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	//the accessor method of dateCreated
	java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	//the accessor method of monthlyInterestRate
	double getMonthlyInterestRate(){
		return annualInterestRate / 12 ;
	}
	
	//the accessor method of monthlyInterest	
	double getMonthlyInterest(){
		return balance * annualInterestRate / 100 / 12;
	}
	
	//the method of withdraw(takeMoney)
	void withdraw(double takeMoney){
		balance -= takeMoney;
	}
	
	//the method of deposit(putMoney)
	void deposit(double putMoney){
		balance += putMoney;
	}
	
	//toString method
	public String toString(){
		return "Today is " + getDateCreated() + ".\nNow you have $" + (int)getBalance() 
		+ "\nMonthly interest is " + getMonthlyInterest();
	}
	
	//main method
	public static void main(String[] args){
		/**New objects of SavingsAccount*/
		SavingsAccount savingsAccount = new SavingsAccount();
		//invoke saving method in SavingsAccount
		savingsAccount.saving();
		//invoke toString method in SavingsAccount
		System.out.println(savingsAccount.toString());
		
		//jump to next line
		System.out.println();
		
		/**New objects of SavingsAccount*/
		CheckingAccount checkingAccount = new CheckingAccount();
		//invoke saving method in CheckingAccount
		checkingAccount.checking();
		//invoke toString method in CheckingAccount
		System.out.println(checkingAccount.toString());
	}
}
