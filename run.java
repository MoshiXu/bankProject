package bank;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class run extends Thread implements Serializable{
	public static void main(String[] args) {
		
		boolean credit=true;
		boolean debit=false;
		employee e1=new employee();
		
		System.out.println("What is your name?");
		Scanner inputName=new Scanner(System.in);
		e1.setName(inputName.nextLine());
		
		System.out.println("What is your age?");
		Scanner inputAge=new Scanner(System.in);
		e1.setAge(inputAge.nextInt());

		System.out.println("How much is your salary?");
		Scanner inputSalary=new Scanner(System.in);
		e1.setSalary(inputSalary.nextDouble());
		
		//print info
		System.out.println("Name: "+e1.getName()+" Age: "+e1.getAge()+" Salary: "+e1.getSalary());
		

		System.out.println("What kind of bank account would you open?");
		System.out.println("1 for SavingAccount,2 for SalaryAccount,3 for CurrentAccount:");
		Scanner inputChoice=new Scanner(System.in);
		int chooseAcc=inputChoice.nextInt();
		
		Account account1 = null;
		switch(chooseAcc) {
		case(1):
			//saving account
			account1=new savingAccount();
			break;
		case(2):
			//salary account
			account1=new salaryAccount();
			break;
		case(3):
			//currentAccount
			account1=new currentAccount();
			break;
		default:
			System.out.println("Invalid number");
		}
		
		//ask for initial deposit
		System.out.println("How much is initial deposit?");
		Scanner inputInitial=new Scanner(System.in);
		double depositMoney=inputInitial.nextDouble();
		
		account1.setBalance(depositMoney);
		
		double a=account1.getBalance();
		e1.setBalance(a);
		System.out.println("Balance now is: "+account1.getBalance());
		
		//ask withdraw or deposit
		int exit=0;
		while(exit!=1) {
			System.out.println("Do you wanna deposit or withdraw?Type 1 to Deposit,2 to Withdraw,3 to Exit");
			Scanner scan=new Scanner(System.in);
			int choice=scan.nextInt();
			
			switch(choice) {
			
			case(1):
				System.out.println("You chose Deposit.How much you want to credit?");
				Scanner inputDeposit=new Scanner(System.in);
				double toDeposit=inputDeposit.nextDouble();
				System.out.println("You credited $"+toDeposit);
				Thread depositthread=new AccountUser(account1,toDeposit,credit);
				depositthread.start();
				try {
					depositthread.join();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Now balance is: "+account1.getBalance());
				break;
				
				
			case(2):
				System.out.println("You chose Withdraw.How much you want to debit?");
				Scanner inputWithdraw=new Scanner(System.in);
				double toWithdraw=inputWithdraw.nextDouble();
				System.out.println("You debited $"+toWithdraw);
				Thread withdrawthread=new AccountUser(account1,toWithdraw,debit);
				withdrawthread.start();
				try {
					withdrawthread.join();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Now balance is: "+account1.getBalance());
				break;
				
				
			case(3):
				System.out.println("Byebye");
				System.out.println("Balance is: "+account1.getBalance());
				exit=1;
				break;
			default:
				System.out.println("Wrong number");
			}
		}
		
		//serialization
		try {
			//write the Object
			FileOutputStream fos=new FileOutputStream("output.txt");
			ObjectOutputStream out=new ObjectOutputStream(fos);
			String str1="Name: "+e1.getName()+" Age: "+e1.getAge()+" Salary: "+e1.getSalary()+" Balance: "+e1.getBalance();
		
			out.writeObject(str1);
			out.flush();
			out.close();
		
			//what I inputed
			System.out.println(str1);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
