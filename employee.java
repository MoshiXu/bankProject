package bank;

public class employee {

	private String name;
	private int age;
	private double salary;
	
	public void setName(String name) {
		this.name = name;
	}
		
	//check age first
	public void setAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Age must be above 18");
		}else {
			this.age=age;
		}
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}
}
