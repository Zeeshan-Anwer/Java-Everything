package com.time.practice;

/**
 * @author hp
 *
 */
public class Human {

	String name;
	int age;
	String Religion;
	String Gender;
	
	public void Speak() {
		System.out.print("Hello My name is:"+name);
		System.out.println("My age:"+age);
		System.out.println("My Religion:"+Religion);
		System.out.println("My Gender:"+Gender);
		
	}

	public Human(String name, int age, String religion, String gender) {
		super();
		this.name = name;
		this.age = age;
		Religion = religion;
		Gender = gender;
	}
	
	
	
		


	
	}
