package day_41;

public class BankAccount {

	double balance;
	String accountHolder;
	int accountNum;
	
	public void deposit(double amount) {
	 System.out.println("depositing $" + amount + "to"+ accountNum);

	
	balance += amount;
	
	}
	public void withdraw(double amount) {
	System.out.println("withdrawing $" + amount + "from" + accountNum);
	balance -= amount;
	if (balance <0) {
		balance -=35;
	}
	}
	public void showBalance() {
		
		System.out.println("======================");
		System.out.println("account:" + accountHolder);
		System.out.println("account:" + accountNum);
		
	}
	
      public void charge(double price, String item) {
		if ( balance >+ price) {
			System.out.println("buying " + item + " for$"+ price + " from" + account)
			balance -= price;
		}else {
			System.out.println("infficient funds ti purchase " + item + " from");
		}
		
	}

}