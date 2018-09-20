package learnJDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_demo {

	public static void main(String[] args) {
		try {
			// get connection to data base
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "tester");

			// create a statement
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery("select * from Persons");
			
			while (result.next()) {
				System.out.println(result.getInt("PersonID") + " " + result.getString("LastName") + " "
						+ result.getString("FirstName") + " " + result.getString("Address") + " "
						+ result.getString("City"));
				
			}
			
			
			// st.executeUpdate("insert into Persons (PersonID, LastName, FirstName, Address, City) values (003, 'mishra', 'roni', 'mp', 'bhopal')");
			String sql = "Update persons set FirstName = "+ "'rohit'"+" where PersonID =3";
			st.executeUpdate(sql);
			System.out.println("update completed");
			
			
			// Delete row from table
			String sql2 = "Delete from Persons where FirstName = 'rohit'";
			int rowAffected =  st.executeUpdate(sql2);
			System.out.println(rowAffected);
			System.out.println("deleted");
			
			

		} catch (Exception exp) {
			System.out.println();
		}

	}

}
