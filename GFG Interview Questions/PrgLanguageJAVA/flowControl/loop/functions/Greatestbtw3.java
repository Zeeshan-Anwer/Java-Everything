package flowControl.loop.functions;

public class Greatestbtw3 {

	public static void main(String[] args) {
	
		int a=5,b=8,c=7;
		System.out.println("Greater is: "+utility(a,b,c));
	}
	public static int utility(int a,int b,int c) {
		if(a>b & a>c)
			return a;
		else if(b>a & b>c)
			return b;
		else
			return c;
	}

}
