package pack.java.lange;

public class StringKnowledge {

	public static void main(String args[])
	{
		//Constructor 
		String s=new String();
		String a=new String("a");
		
		char[] ch= {'a','b','c','d','e'};
		
		String b=new String(ch);
		
		StringBuffer d=new StringBuffer("Hello");
		
		String e=new String(d);
		String c=("helo");
		
		//Checking
	
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Zeeshan anwer");
		System.out.println(sb.capacity());
		
		StringBuffer za=new StringBuffer(17);
		System.out.println("ZACapcity"+za.capacity());
		
		StringBuilder t=new StringBuilder("Zeeshan");
		t.append("Anwer").insert(7," ");
		System.out.println(t);
	}
	
	
}
