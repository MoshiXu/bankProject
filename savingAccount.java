package bank;

public class savingAccount implements Account{

	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		//minimum balance should be 10,000
		if(balance>10000) {
			this.balance = balance;
		}else{
			throw new InsufficentBalance("Minimum balance should be 10,000");
		}
	}
	
	public synchronized void withdraw(double amount) {
		double temp;
		int flag=1;
		while(flag!=0) {
			temp=balance;
			//minimum balance should be 10,000
			if(temp-amount>=10000) {
				temp=temp-amount;
				balance=temp;
				flag=0;
			}else{
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
		System.out.println("Deposite Done"+Thread.currentThread().getName());
		System.out.println("Balance after Deposite"+balance);
		this.notify();
	}
	
	public void transfer(double amount) {
		balance=amount+balance;
		//return balance;
	}	
}