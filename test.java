package bank;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/*
class Office implements Serializable{
	int id;
	String name;
	
	public Office(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return (name+id);
	}
}

class Employee extends Office implements Serializable{
	int salary;
	public Employee(int id,String name,int salary) {
		super(id,name);
		this.salary=salary;
	}
	@Override
	public String toString() {
		return (name+id+salary);
	}
}

public class test {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(121,"BBB",1000);
		
		try {
			FileOutputStream fos=new FileOutputStream("first.txt");
			ObjectOutputStream out=new ObjectOutputStream(fos);
			out.writeObject(e1);
			out.flush();
			out.close();
		
			FileInputStream fis=new FileInputStream("first.txt");
			ObjectInputStream oin=new ObjectInputStream(fis);
			Employee emp=(Employee)oin.readObject();
			
			System.out.println(emp.id+" "+emp.name+" "+emp.salary);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
*/