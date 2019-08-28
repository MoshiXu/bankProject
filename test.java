package bank;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		int exit=0;
		while(exit!=1) {
			System.out.println("Do you wanna deposit or withdraw?Type 1 to deposit,2 to withdraw,3 to exit");
			Scanner scan=new Scanner(System.in);
			int choice=scan.nextInt();
			
			switch(choice) {
			case(1):
				System.out.println("You chose 1 deposit");
				
			
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
		}
		
	}

}
