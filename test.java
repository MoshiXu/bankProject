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

/*
create table in oracle sql developer
run the code in mainClass
*/


public class test{

	public static void main(String[] args){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","XDB","xuer37xdd5");
			System.out.println("Connect done");
			
			Statement st=con.createStatement();
			
			con.setAutoCommit(false);
			
			String query1="update salespeople set comm=? where snum=?";
			String query2="insert into salespeople values (?,?,?,?) ";
			//String query3="delete from salespeople where snum=?";
			
			PreparedStatement prst2=con.prepareStatement(query2);
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
			
			prst2.setInt(1, 1000);
			prst2.setString(2, "Tom");
			prst2.setString(3,"Chicago");
			prst2.setInt(4,10000);
			//prst2.addBatch();
			//prst2.executeUpdate();
			
			
			//delete
			//prst3.setInt(1, 1000);
			//prst3.executeUpdate();
			
			con.commit();
			con.close();
			
			System.out.println("Record updated");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
