package com.training.Collection;

public class Country implements Comparable<Country> {
	
	public int Population;
	public String name;
	
	public Country(int p,String s)
	{
		Population=p;
		name=s;
	}
	

	@Override
	public int compareTo(Country cn2) {
		Country cn1=this;
		if(cn1.Population==cn2.Population)
			return 0;
		else if(cn1.Population>cn2.Population)
			return 1;
		else
			return -1;
	} 
	}
 