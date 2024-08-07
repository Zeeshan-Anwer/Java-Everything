package assignmentPrg;

public class _41_LargestPalindromeOf3Digit {
	//not getting output
	public static void main(String args[]) {
		int product=0;
		for(int i=99;i>=10;i--) 
			for(int j=i;j>=10;j--) {
				product=i*j;
				if(checkProduct(product)==true)
					System.out.println(product);
				return;
		}
	}
	
	public static boolean checkProduct(int pr) {
		int temp=pr,rev=0,rem=0;;
		while(pr%10>0) {
			rem=pr%10;
			pr=pr/10;
			rev=rev*10+pr;
		}
		if(temp==rev)
			return true;
		else
			return false;
	
	
	}

}
