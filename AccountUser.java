package bank;

public class AccountUser extends Thread{

	Account account;
	int amount;
	boolean b;
	
	public AccountUser(Account account,int amount,boolean b) {
		this.account=account;
		this.amount=amount;
		this.b=b;
	}
	
	@Override
	public void run() {
		
		//for(int i=0;i<4;i++) {
			if(b==true) {
				account.deposit(amount);
			}else {
				account.withdraw(amount);
			}
		//}
	}
}
