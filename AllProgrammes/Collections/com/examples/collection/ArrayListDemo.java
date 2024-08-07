package com.examples.collection;
import java.util.*;

class ArrayListDemo{
	public static void main(String args[]) {
		ArrayList<String> a=new ArrayList<String>(10);
		a.add("Zeeshan");
		System.out.println(a);
		a.add(1,"Shadab");
		System.out.println(a);
		a.remove("Zeeshan");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		
		
	}
}
 /*class ArrayListDemo{
	 
	public static void main(String args[]) {
	ArrayList<String> list=new ArrayList<String>();	
	list.add("Zeeshan");
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
*/

