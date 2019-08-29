package bank;

public class AccountUser extends Thread{

	Account account;
	double amount;
	boolean b;
	
	public AccountUser(Account account,double amount,boolean b) {
		this.account=account;
		this.amount=amount;
		this.b=b;
	}
	
	@Override
	public void run() {
		if(b==true) {
			account.deposit(amount);
		}else {
			account.withdraw(amount);
		}
	}
}
