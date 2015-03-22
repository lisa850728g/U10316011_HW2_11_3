class SavingsAccount extends Account{
	private int id;
	private double balance;
	private double takeMoney;
	private double putMoney;
	
	SavingsAccount(){
		super();
	}
	
	SavingsAccount(int id ; double balance){
		super(id , balance);
	}
	
	public void saving(){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter this saving account's ID: );
		id = input.nextInt();
		super.setId(id);
		setBalance(20000);
		System.out.print("This saving account have $" + (int)getBalance());
		super.setAnnualInterestRate(4.5);
		
		do{
			System.out.print("How much money you want to take ?");
			takeMoney = input.nextDouble();
			
			if(takeMoney > 20000)
				System.out.print("You can not take that much money");
		}while(takeMoney > 20000);
		
		super.withdraw(takeMoney);
		
		System.out.print("How much money you want to store ?");
		putMoney = input.nextDouble();
		super.deposit(putMoney);
		
		System.out.println();
	}
	
	String toString(){
		return super.toString();
	}
}
