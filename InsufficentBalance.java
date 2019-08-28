package bank;

public class InsufficentBalance extends RuntimeException{

//	ArithmeticException
	
	String str;
	
	public InsufficentBalance(String str) {
		this.str=str;
		System.out.print(str);
	}
}
