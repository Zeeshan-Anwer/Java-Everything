package com.training.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class CollectionTestDemo1 {

	public static void main(String[] args) {
			
		ArrayList<String> arrayListstr=new ArrayList<String>();
		arrayListstr.add("Suresh");
		arrayListstr.add("Ramesh");
		arrayListstr.add("Kavita");
		
		Iterator<String> striterator=arrayListstr.iterator();
		while(striterator.hasNext()) {
			String s=striterator.next();
			System.out.println(s);
		}
		
		System.out.println("***************Sorted Data***************");
			
			Collections.sort(arrayListstr);
			
			for(String s: arrayListstr) {
				System.out.println(s);
			}
			
			ArrayList<Country> conArrayList=new ArrayList<Country>();
			conArrayList.add(new Country(20,"India"));
			conArrayList.add(new Country(30,"China"));
			
			Collections.sort(conArrayList,new PopulationComparator());
			
			Iterator<Country> itrCountry=conArrayList.iterator(  );
			while(itrCountry.hasNext()) {
				Country cn=itrCountry.next();
				System.out.println("Population:"+cn.Population+" "+"Country:"+cn.name);
			}
			
			//Collections.sort(conArrayList);
			
			
		}
		

	}
