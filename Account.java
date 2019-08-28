package bank;

public interface Account {
	
	public void setBalance(double amount);
	public double getBalance();
	
	public void withdraw(double amount);
	public void deposit(double amount);
	public void transfer(double amount);
}
