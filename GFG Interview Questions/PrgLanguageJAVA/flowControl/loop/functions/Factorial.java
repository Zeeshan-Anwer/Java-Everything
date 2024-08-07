package flowControl.loop.functions;

public class Factorial {

	public static void main(String[] args) {
	
		int number=13;
		int i=1;
		while(number>0)
		{
			i=i*number;
			number--;
		}
		System.out.println(i);
	}

}
