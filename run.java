package bank;
import java.util.Scanner;

public class run extends Thread{

	public static void main(String[] args) {
		
		//for switch
		int type=0,decision=0;
		double depositMoney;
		
		//personel info
		String name="Moshi";
		int age=22;
		int salary=5000;
		employee e1=new employee();
		e1.setName(name);
		e1.setAge(age);
		e1.setSalary(salary);
		//print info
		System.out.println("Name: "+e1.getName()+" Age: "+e1.getAge()+" Salary: "+e1.getSalary());
		
		boolean credit=true;
		boolean debit=false;
		
		//choose saving account
		Account account1=new savingAccount();
		
		//initial balance is 60000
		depositMoney=60000;
		account1.setBalance(depositMoney);
		System.out.println("Balance now is: "+account1.getBalance());
		
		System.out.println("Do you wanna deposit or withdraw?Type 1 to deposit,2 to withdraw,3 to exit");
		//Scanner inputChoice=new Scanner(System.in);
		//int choice=inputChoice.nextInt();
		System.out.println("You chose 2 withdraw");
		//he chose 2 withdraw
		//System.out.println("How much you wanna withdraw?");
		
		//Step1:	withdraw1 2000
		int withdraw1=2000;
		
		//Thread withdrawthread=new AccountUser(account1,withdraw1,debit);
		
		//Thread withdrawthread=new AccountUser(account1,withdraw1,debit);
		
		int exit=0;
		while(exit!=1) {
			System.out.println("Do you wanna deposit or withdraw?Type 1 to deposit,2 to withdraw,3 to exit");
			Scanner scan=new Scanner(System.in);
			int choice=scan.nextInt();
			
			switch(choice) {
			case(1):
				System.out.println("You chose 1 deposit");
				System.out.println("add $4000");
				Thread depositthread=new AccountUser(account1,4000,credit);
				depositthread.start();
				try {
					depositthread.join();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Now balance is: "+account1.getBalance());
				break;
			case(2):
				System.out.println("You chose 2 withdraw");
				break;
			case(3):
				exit=1;
				break;
			default:
				System.out.println("Wrong number");
			}
		}
		if(exit==1) {
			System.out.println("Byebye");
			System.out.println("Balance is: "+account1.getBalance());
		}
		
		//add 4000
		Thread depositthread=new AccountUser(account1,4000,credit);
		//take 12000
		//Thread withdrawthread=new AccountUser(account1,12000,debit);
		
		//depositthread.start();
		//withdrawthread.start();
		/*
		 * try { depositthread.join(); withdrawthread.join();
		 * }catch(InterruptedException e) { e.printStackTrace(); }
		 */
		//created object of employee
/*
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
		
		//output the user info
		System.out.println("Name: "+e1.getName()+" Age: "+e1.getAge()+" Salary: "+e1.getSalary());
		
		System.out.println("What kind of bank account would you open?");
		System.out.println("1 for SavingAccount,2 for SalaryAccount,3 for CurrentAccount:");
		Scanner inputChoice=new Scanner(System.in);
		choice=inputChoice.nextInt();
*/
		
/*
 * First do saving account only		
 */
/*	
		//Account a=new savingAccount();
		Account savingacc=new savingAccount();
		
		System.out.println("How much would you like to deposit for first time?");
		Scanner inputDeposit1=new Scanner(System.in);
		depositMoney=inputDeposit1.nextDouble();
		savingacc.setBalance(depositMoney);
		//print balance
		System.out.println("Now your balance in savingAccount: "+savingacc.getBalance());
*/
	/*	
		switch(choice) {
		case 1:
			System.out.println("You chose savingAccount!");
			type=1;
			break;
		case 2:
			System.out.println("You chose salaryAccount!");
			type=2;
			break;
		default:
			System.out.println("You chose currentAccount!");
			type=3;
		}
		
		switch(type) {
		case 1:
			savingAccount savingacc=new savingAccount();
		
			System.out.println("How much would you like to deposit for first time?");
			Scanner inputDeposit1=new Scanner(System.in);
			depositMoney=inputDeposit1.nextDouble();
			savingacc.setBalance(depositMoney);
			//print balance
			System.out.println("Now your balance in savingAccount: "+savingacc.getBalance());
			break;
		
		case 2:
			if(e1.getSalary()>5000) {
				salaryAccount salaryacc=new salaryAccount();
				System.out.println("How much would you like to deposit for first time?");
				Scanner inputDeposit2=new Scanner(System.in);
				depositMoney=inputDeposit2.nextDouble();
				salaryacc.setBalance(depositMoney);
				//print balance
				System.out.println("Now your balance in salaryAccount: "+salaryacc.getBalance());
			}else {
				System.out.println("You're not eligble to open salary account");
			}
			break;
			
		default:
			if(e1.getSalary()>30000) {
				currentAccount currentacc=new currentAccount();
				System.out.println("How much would you like to deposit for first time?");
				Scanner inputDeposit3=new Scanner(System.in);
				depositMoney=inputDeposit3.nextDouble();
				currentacc.setBalance(depositMoney);
				//print balance
				System.out.println("Now your balance in currentAccount: "+currentacc.getBalance());
			}else {
				System.out.println("You're not eligble to open salary account");
			}
		}
	*/	
		/*
		while(decision!=4) {
			System.out.println("Would you like to deposit, withdraw,or transfer?");
			System.out.println("1 for deposit,2 for withdraw,3 for transfer,4 for exit");
		
			switch(decision){
			case 1:
				if(type==1) {
					savingacc
				}else if(type==2) {
					
				}else {
					
				}
				
				
			case 2:
				
				
			
			}
		
		}*/
		
	}
}


/*
withdraw
deposit
transfer
remove income
add synchronization
*/