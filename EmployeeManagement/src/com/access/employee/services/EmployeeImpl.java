package com.access.employee.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.access.employee.Employee;

public class EmployeeImpl implements EmployeeInterface {

	static Scanner sc = new Scanner(System.in);

	ArrayList<Employee> al = new ArrayList<>();

	@Override
	public void createEmployee(Employee emp) {


	}

	@Override
	public void doLogin(Integer empId) {
		
		for(Employee i:al) {
			if (i.getEmpId().equals(empId)) {
			System.out.println("Login Suceesfull");

			}
		else
			System.out.println("Login Denied");
	}

	}

	@Override
	public void display() {

		System.out.println("Name :" + empId.getName());


	}

}
