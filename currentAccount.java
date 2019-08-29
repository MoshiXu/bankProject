package bank;

public class currentAccount implements Account{

	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		//minimum is 50000
		if(balance>50000) {
			this.balance = balance;
		}else{
			throw new InsufficentBalance("minimum balance should be 50,000");
		}
	}
	
	public synchronized void withdraw(double amount) {
		double temp;
		int flag=1;
		while(flag!=0) {
			temp=balance;
			if(temp-amount>=50000) {
				temp=temp-amount;
				balance=temp;
				flag=0;
			}else {
				try {
					System.out.println("Insufficient"+Thread.currentThread().getName());
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Balance now is: "+balance);
		}
	}
	
	public synchronized void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposit Done"+Thread.currentThread().getName());
		System.out.println("Balance after Deposit"+balance);
		this.notify();
	}
	
	public void transfer(double amount) {
		balance=balance-amount;
	}
}