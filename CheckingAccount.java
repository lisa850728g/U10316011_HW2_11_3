import java.util.Scanner;

//inherit the Account class
class CheckingAccount extends Account{
	/**private variables*/
	private int id;
	private double balance;
	private double takeMoney;
	private double putMoney;
	
	//no-arg constructor
	CheckingAccount(){
		super();
	}
	
	//constructor
	CheckingAccount(int newId , double newBalance){
		super(newId , newBalance);
	}
	
	//checking method
	public void checking(){
		//create Scanner
		Scanner input = new Scanner(System.in);
		
		//input id and print out balance
		System.out.print("Please enter this checking account's ID: ");
		id = input.nextInt();
		//invoke the setId method in Account
		super.setId(id);
		setBalance(20000);
		System.out.println("This checking account have $" + (int)getBalance());
		//invoke the setAnnualInterestRate method in Account
		super.setAnnualInterestRate(4.5);
		
		//let the user takes money
		System.out.print("How much money you want to take ? ");
		takeMoney = input.nextDouble();
			
		if(takeMoney > 20000)
			System.out.println("You will need to store money to balance this check.");
		
		//invoke the withdraw method in Account
		super.withdraw(takeMoney);
		
		//let the user stores money
		//If he took money more than the overage in this account, he will need to balance it
		do{
			System.out.print("How much money you want to store ? ");
			putMoney = input.nextDouble();
			
			if((super.getBalance()+putMoney) < 0)
				System.out.println("You need to store money to balance this check.");
			
			//invoke the deposit method in Account
			super.deposit(putMoney);
		}while(super.getBalance() < 0);
		
		//jump to the next line
		System.out.println();
	}
	
	//inherit the super class's toString method
	public String toString(){
		return super.toString();
	}
}
