import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Print3Ways {
	
	public static void main(String[] args) {
		
		List<String> str=new ArrayList<String>();
		
		str.add("Apple");
		str.add("Apple 1");
		str.add("Apple 2");
		str.add("Apple 3");
		str.add("Apple 4");
		str.add("Apple 5");
		
	Iterator itr=str.iterator();
	
	
	
	while(itr.hasNext()) {
		Object el=itr.next();
		System.out.println(el);
		
	}
	
	System.out.println("*************");
	
	Enumeration e=Collections.enumeration(str);
	
	
	
	
	while(e.hasMoreElements())
		System.out.println(e.nextElement());
		
	System.out.println("*************");
		
		
		str.forEach(i -> System.out.println(i));
	
	
	}
}
