package com.training.Collection;

public class Product {
	
	int id;
	String Colour_Varient;
	float Rate;

	public void set(int id,String Colour_Varient,float Rate) {
		this.id=id;
		this.Colour_Varient=Colour_Varient;
		this.Rate=Rate;
	}
	
	public void get() {
		System.out.println("Product id: "+id+"Product Colour: "+Colour_Varient+"Rate: "+Rate);
	}
	

}
