import java.util.Scanner;

//inherit the Account class
class SavingsAccount extends Account{
	/**private variables*/
	private int id;
	private double balance;
	private double takeMoney = 0;
	private double putMoney;
	
	//no-arg constructor
	SavingsAccount(){
		super();
	}
	
	//constructor
	SavingsAccount(int newId , double newBalance){
		super(newId , newBalance);
	}
	
	//saving method
	public void saving(){
		//create Scanner
		Scanner input = new Scanner(System.in);
		
		//input id and print balance
		System.out.print("Please enter this saving account's ID: ");
		id = input.nextInt();
		//invoke the setId method in Account
		super.setId(id);
		setBalance(20000);
		System.out.println("This saving account have $" + (int)getBalance());
		//invoke the setAnnualInterestRate method in Account
		super.setAnnualInterestRate(4.5);
		
		//let the user take money but he can't take more than money in this account
		do{
			System.out.print("How much money you want to take ? ");
			takeMoney = input.nextDouble();
			
			if(takeMoney > 20000)
				System.out.println("You can not take that much money");
		}while(takeMoney > 20000);
		
		//invoke the withdraw method in Account
		super.withdraw(takeMoney);
		
		//let the user store money
		System.out.print("How much money you want to store ? ");
		putMoney = input.nextDouble();
		//invoke the deposit method in Account
		super.deposit(putMoney);
		
		System.out.println();
	}
	
	//inherit the super class's toString method 
	public String toString(){
		return super.toString();
	}
}
