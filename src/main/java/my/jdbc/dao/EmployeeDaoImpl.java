package my.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import my.jdbc.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	public static final String UPDATE_QUERY = "update employee set name = '%s' , email = '%s' , salary = %d  where  empId = %d";

	public static final String DELETE_QUERY = "DElete from employee   where  empId = %d";

	
	private static Connection connection = null;
	
	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void saveEmployee(Employee e) throws SQLException  {
		// TODO Auto-generated method stub
		Statement statement = connection.createStatement();
//		statement.executeUpdate("insert into employee (empId,name,email,salary) values(7,'John','john@gmail.com',88888)");

		statement.executeUpdate("insert into employee (empId,name,email,salary) values("+e.getId()+",'"+e.getName()+"','"+e.getEmail()+"',"+e.getSalary()+")");
		System.out.println("insert into employee (empId,name,email,salary) values("+e.getId()+",'"+e.getName()+"','"+e.getEmail()+"',"+e.getSalary()+")");

	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		try(Statement statement = connection.createStatement();) {
			
			statement.executeUpdate(String.format(UPDATE_QUERY, e.getName(),e.getEmail(),e.getSalary(),e.getId()));
			
			System.out.println(String.format(UPDATE_QUERY, e.getName(),e.getEmail(),e.getSalary(),e.getId()));
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void deleteAnEmployee(int id) {
		// TODO Auto-generated method stub
         try(Statement statement = connection.createStatement();) {
			
			statement.executeUpdate(String.format(DELETE_QUERY, id));
			
			System.out.println(String.format(DELETE_QUERY,id));
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void printAllEmployee()throws SQLException {
		// TODO Auto-generated method stub

	      Statement statement = connection.createStatement();
				
				ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
				
				while(resultSet.next()) {
				   System.out.println("Id = "+resultSet.getInt(1)+"\t NAME = "+resultSet.getString(2)+"t Email = "+resultSet.getString(3)+"\t Salary ="+resultSet.getInt(4));
				}
				
				System.out.println("SELECT * FROM employee");
				
			
	}

	@Override
	public Employee getEmpById(int id)throws SQLException {
		// TODO Auto-generated method stub

	      Statement statement = connection.createStatement();
				
				ResultSet resultSet = statement.executeQuery("SELECT * FROM employee where empId ="+id);
				resultSet.next();
				
				Employee e = new Employee();
				
				e.setId(id);
				e.setName(resultSet.getString(2));
				e.setEmail(resultSet.getString(3));
				e.setSalary(resultSet.getInt(4));
				System.out.println("SELECT * FROM employee where empId ="+id);
				
		return e;
	}

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmpByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
