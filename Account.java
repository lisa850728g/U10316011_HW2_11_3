import java.util.*;

public class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	Account(){
		dateCreated = new java.util.Date();
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
	
	public static void main(String[] args){
		Account account = new Account();
		account.setId(1122);
		account.setBalance(20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.print("餘額 " + (int)account.getBalance() + "\n月利息 " + account.getMonthlyInterest() 
		+ "\n日期 " + account.getDateCreated());
	}
}
