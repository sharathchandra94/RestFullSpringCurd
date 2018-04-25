package com.hexarest.control;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.hexarest.da.Employeedao;
import com.hexarest.mod.Employee;

@Path("get")
public class Controller {
	Employeedao dao = new Employeedao();

	@GET
	@Path("employees")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployees() {

		List<Employee> output = dao.dummyEmployees();
		String json = new Gson().toJson(output);
		return Response.status(200).entity(json).build();

	}

	@GET
	@Path("employees/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeById(@PathParam("id") Integer id) {

		Employee output = dao.getEmployeeById(id);
		String json = new Gson().toJson(output);

		return Response.status(200).entity(json).build();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> createEmployee(Employee emp) {
		List<Employee> newempl =dao.createEmployee(emp);
		return newempl;

	}
}
