package com.hexarest.da;

import java.util.ArrayList;
import java.util.List;

import com.hexarest.mod.Employee;

public class Employeedao {

	static List<Employee> employees = new ArrayList<Employee>();

	public List<Employee> dummyEmployees() {

		employees.add(new Employee(1, "shar", "ittt", 1001));
		employees.add(new Employee(2, "shafv", "rtv", 1003));
		employees.add(new Employee(3, "sharsdv", "itg", 1004));
		employees.add(new Employee(4, "sharsvd", "ite", 1005));
		employees.add(new Employee(5, "shardz", "tt", 1002));

		return employees;

	}

	public Employee getEmployeeById(int id) {
		List<Employee> empls = dummyEmployees();
		for (Employee emp : empls) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;

	}

	public Employee createEmployee(Employee emp) {
		Employee empnew =new Employee();
		empnew.setId(emp.getId());
		empnew.setDept(emp.getDept());
		empnew.setName(emp.getName());
		empnew.setSalary(emp.getSalary());
		return empnew;
		
		
	}

	
	 public static void main(String args[]) { 
		  Employeedao dao1 =new Employeedao();
		//Employee employee =  dao1.getEmployeeById(1);
		 // List<Employee> employee=	  dao1.createEmployee(new Employee(6, "ljd", "knd", 200));
		  
		 // System.out.println(employee);
	 }
	 

}
