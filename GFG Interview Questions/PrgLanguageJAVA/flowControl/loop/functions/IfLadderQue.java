/*
  Sometimes, the normal if-else isn't enough. In such cases, we have what we call ladder if and else conditions. 
  So here we'll learn to use them.

Given a positive integer N. Your task is to check if it divisible as given below:
1. If it is divisible by 2, print "Two".
2. If it is divisible by 3, print "Three".
3. If it is divisible by 11, print "Eleven".
4. If not follow above three rules, print "-1".
Note: If N is divisible by more than one of the above given numbers, print the one which is largest.

Example 1:

Input:
3

Output:
Three

Your Task:
Your task is to complete the function to check divisibility as required.

Constraints:
1 <= N <= 10(power 6)

 */
package flowControl.loop.functions;

public class IfLadderQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=18;
		System.out.println(findCondition(num));
		
		
	}
	public static int findCondition(int num)
	{
		int a=0;
		if(num%2==0)
			a=2;
		if(num%3==0)
			a=3;
		if(num%11==0)
			a=11;
		if(a>0)
			return a;
		else
			return -1;
			}
	

}
