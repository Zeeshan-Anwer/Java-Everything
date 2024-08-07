package com.access.employee.services;

import java.util.ArrayList;

import com.access.employee.Employee;

public class Main {

	@Autowired
	Employ

	static ArrayList<Employee> al = new ArrayList();

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmpId(1);
		e.setJobLocation("Bangalore");
		e.setName("Zeeshan ");

		Employee a = new Employee();
		a.setEmpId(2);
		a.setJobLocation("Hyderabad");
		a.setName("Shadab");

		al.add(e);
		al.add(a);

	}

}
