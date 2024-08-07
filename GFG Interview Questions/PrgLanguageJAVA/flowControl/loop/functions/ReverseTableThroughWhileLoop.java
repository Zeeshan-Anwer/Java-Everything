/* 

While loop is another loop like for loop but unlike for loop it only checks for one condition.

Here, we will use while loop and print a number n's table in reverse order.

Example 1:

Input:
1

Output:
10 9 8 7 6 5 4 3 2 1
User Task:

Your task is to complete the provided function.

Constraints:
1 <= n<= 1000
*/

package flowControl.loop.functions;

public class ReverseTableThroughWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9;
		findReverseTable(num);
	}
	
	public static void findReverseTable(long num)
	{
	int i=10;
	{
		while(i>0)
		{
			System.out.println(num*i);
			i--;
	}

}
}
}