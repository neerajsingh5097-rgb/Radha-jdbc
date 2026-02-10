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

	

		Employee e = new Employee(11, 00000, "worker Singh", "kunal123@gmail.com");


		EmployeeDao empDao = new EmployeeDaoImpl();
//		empDao.saveEmployeeByPs(e);
		
		System.out.println(empDao.getAllEmps());

//		empDao.updateEmployee(e);
		System.out.println("Main.main()");
		
		System.out.println("jay ho");
	

	}

}
