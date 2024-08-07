package string_programmes;

public class tick {
	
	public static void main(String[] args) {
		
		int n=19;
		if(n>0)
			System.out.println(digitSquare(n));
		else
			System.out.println(false);
	}

	
	public static boolean digitSquare(int n) {
		int temp=n;
		int rem=0,res=0;
		do {
			
			rem=temp%10;
			temp=temp/10;
			res=res+(rem*rem);
			if(temp==0) 
				temp=res;
				if(res!=1)
			res=0;
			
		}
		while(res!=1);
		return true;
	}
}
