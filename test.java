package bank;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class test{

	public static void main(String[] args){
		
		try {
			
			DriverManager.registerDriver(new org.sqlite.JDBC());
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","XDB","xuer37xdd5");
			System.out.println("Start...");
			
			Statement st=con.createStatement();
			
			con.setAutoCommit(false);
			
			String query="insert into employee values (semployee.nextval,?,?,?,?)";
			//String query="select * from employee";
			
			//String query1="update salespeople set comm=? where snum=?";
			//String query2="insert into salespeople values (?,?,?,?) ";
			//String query3="delete from salespeople where snum=?";
			
			PreparedStatement prst=con.prepareStatement(query);
			//PreparedStatement prst3=con.prepareStatement(query3);
			
			/*ResultSet rs=st.executeQuery("select * from salespeople");
			while(prst.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+" "+rs.getString(3)+" "+rs.getInt(4));	
			}*/
			
			//add column
			/*
			prst1.setInt(1, 90789);
			prst1.setInt(2, "AAA");
			prst1.setInt(3,"India");
			prst1.executeUpdate();
			*/
			
			//add column
			
/*
create table employee(
  ID int,
  name varchar(10),
  age int,
  salary int,
  balance int
);*/
			//prst.setString(1, "semployee.nextval");
			//prst.setInt(1, 1000);//ID
			prst.setString(1, "Adam");//name
			prst.setInt(2,34);//age
			prst.setInt(3,10000);//salary
			prst.setInt(4, 3000);//balance
			prst.execute();
			//prst2.addBatch();
			//prst2.executeUpdate();
			
			
			//delete
			//prst3.setInt(1, 1000);
			//prst3.executeUpdate();
			
			con.commit();
		/*	
			int m = st.executeUpdate(query); 
            if (m == 1) { 
                System.out.println("inserted successfully : "); 
            }else {
                System.out.println("insertion failed"); 
            }
         */
			con.close();
			
			System.out.println("Done!");
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
