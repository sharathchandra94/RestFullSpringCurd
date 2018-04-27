package com.hexarest.control;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexarest.da.Employeedao;
import com.hexarest.mod.Employee;

@RequestMapping("/")
@RestController
public class RestControllerSpring {
	Employeedao dao = new Employeedao();

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		List<Employee> output = dao.dummyEmployees();
		// String json = new Gson().toJson(output);
		return output;

	}
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public @ResponseBody Employee getEmployeeById(@PathVariable("id") Integer id) {

		Employee output = dao.getEmployeeById(id);
	//	String json = new Gson().toJson(output);

		return output;
	}
	@RequestMapping(value = "/employees", method = RequestMethod.POST)

	public Employee createEmployee(Employee emp) {
		
		Employee newempl = dao.createEmployee(emp);
		return newempl;

	}
}
