package bank;

public class currentAccount {

	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance>50000) {
			this.balance = balance;
		}else{
			throw new InsufficentBalance("minimum balance should be 50,000");
		}
	}
	
	public double withdraw(double amount) {
		balance=balance-amount;
		return balance;
	}
	
	public double deposit(double amount) {
		balance=balance+amount;
		return balance;
	}
	
	public double transfer(double amount) {
		balance=balance-amount;
		return balance;
	}
}