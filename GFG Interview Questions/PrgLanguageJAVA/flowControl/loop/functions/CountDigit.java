package flowControl.loop.functions;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1003000;
		Integer j=i;
		String s=j.toString();
		System.out.println("Total Digits in "+i+" are "+s.length());
		getCount(i);
				
	}
	
	//Method 2
	public static void getCount(int n){
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Method 2: Ans"+count);
	}

}
