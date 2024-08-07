package com.access.employee.services;

import com.access.employee.Employee;

public interface EmployeeInterface {

	void createEmployee(Employee emp);

	void doLogin(Integer empId);

	void display();

}
