/*Given two strings S1 and S2 consisting of only lowercase characters whose anagrams are almost equal.
 *  The task is to count the number of characters which needs to be edited(delete) to make S1 equal to S2.
 

Example 1:

Input:
madame
madam

Output:
1
*/
package com.arrays.strings;

class AlmostEqualString
{
	public static void main(String args[])
	{
String s="Zeeshan Anwer";
		String y="Zeeshan     ";
		int count=0;
		int start=0,run=0;
		
		if(s.length()>y.length()) {
				count=s.length()-y.length();
		run=y.length();
		}
		if(y.length()>s.length())
		{
				count=y.length()-s.length();
		run=s.length();
		}
		while(start<run)
		{
			//System.out.println("do Hell");
			//System.out.println("do Hell2");
			if(s.charAt(start)!=y.charAt(start)) 
				System.out.println(s.charAt(start)+"new: "+(y.charAt(start)));
			count++;
			
		//	System.out.println("end Hell");
		
			start++;
		
}
		
		System.out.println(count+"\nrun"+run+"\nstart"+start);
	}
}