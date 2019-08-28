package bank;

public class salaryAccount {

	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		//minimum balance should be 5000
		if(balance>=5000) {
			this.balance = balance;
		}else {
			throw new InsufficentBalance("Minimum balance should be 5000.");
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