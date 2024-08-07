package practice.Collections;

import java.util.*;

public class ExampleCollection {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();
		list.add("Hello Brother");
		list.add("Zeeshan ");
		list.add("Anwer");
		list.add("ok");
		list.remove("Anwer");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
		
	}

}
