package my.jdbc;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

import my.jdbc.dao.EmployeeDao;
import my.jdbc.dao.EmployeeDaoImpl;
import my.jdbc.model.Employee;


//Connection conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/testdb","root","root");

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//		3rd method
		/*
		Properties ps = new Properties();
		
		ps.put("user","root");
		ps.put("password", "root");
		
		Driver d = new Driver();
		Connection connection = d.connect("jdbc:mysql://localhost:3306/testdb", ps);
		connection.createStatement().executeUpdate("insert into employee (empId,name,email,salary) values(9, 'Anoop','anoop@gmail.com',4561)");

*/
		/*
		 1st method
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
//        2nd method
		Employee e = new Employee(9, 1000, "Raja Singh", "rajaal123@gmail.com");
		/*
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root",
		 * "root").createStatement().executeUpdate(
		 * "insert into employee (empId,name,email,salary) values(8,'Puneet','puneet@gmail.com',65888)"
		 * );;
		 * 
		 */

		EmployeeDao empDao = new EmployeeDaoImpl();
//		empDao.saveEmployee(e);

//		empDao.updateEmployee(e);
		
//		empDao.deleteAnEmployee(9);
//		empDao.printAllEmployee();
		
		Employee emp=empDao.getEmpById(3);
//		System.out.println(emp);
		
		System.out.println(empDao.getAllEmps());
		System.out.println("Main.main()");

	


	}

}
