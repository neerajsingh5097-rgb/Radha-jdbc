package my.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import my.jdbc.dao.EmployeeDao;
import my.jdbc.dao.EmployeeDaoImpl;
import my.jdbc.model.Employee;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		/*
		 * Connection conn =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root",
		 * "root");
		 * 
		 * Statement statement = conn.createStatement();
		 * 
		 * statement.executeUpdate(
		 * "insert into employee (empId,name,email,salary) values(7,'John','john@gmail.com',88888)"
		 * );
		 * 
		 * System.out.println("Main.main()");
		 * 
		 */

//		 ise al line me is prakr likhege 

		Employee e = new Employee(9, 44444, "Kunal Singh", "kunal123@gmail.com");
		/*
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root",
		 * "root").createStatement().executeUpdate(
		 * "insert into employee (empId,name,email,salary) values(8,'Puneet','puneet@gmail.com',65888)"
		 * );;
		 * 
		 */

		EmployeeDao empDao = new EmployeeDaoImpl();
//		empDao.saveEmployee(e);

		empDao.updateEmployee(e);
		System.out.println("Main.main()");
		System.out.println("Main.main()");
		System.out.println("Main.main()");
		System.out.println("Main.main()");
		System.out.println("Main.main()");
	}

}
