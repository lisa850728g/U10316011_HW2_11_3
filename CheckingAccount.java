import java.util.Scanner;

class CheckingAccount extends Account{
	private int id;
	private double balance;
	private double takeMoney;
	private double putMoney;
	
	CheckingAccount(){
		super();
	}
	
	CheckingAccount(int newId , double newBalance){
		super(newId , newBalance);
	}
	
	public void checking(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter this checking account's ID: ");
		id = input.nextInt();
		super.setId(id);
		setBalance(20000);
		System.out.println("This checking account have $" + (int)getBalance());
		super.setAnnualInterestRate(4.5);
		
		System.out.print("How much money you want to take ? ");
		takeMoney = input.nextDouble();
			
		if(takeMoney > 20000)
			System.out.println("You will need to store money to balance this check.");
		
		super.withdraw(takeMoney);
		
		do{
			System.out.print("How much money you want to store ? ");
			putMoney = input.nextDouble();
			
			if((super.getBalance()+putMoney) < 0)
				System.out.println("You need to store money to balance this check.");
			
			super.deposit(putMoney);
		}while(super.getBalance() < 0);
		
		System.out.println();
	}
	
	public String toString(){
		return super.toString();
	}
}
