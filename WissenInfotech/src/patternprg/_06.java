package patternprg;

public class _06 {

	public static void main(String[] args) {

		for(int i=5;i>0;i--) {
			for(int j=1;j<=5;j++)
				if(i<=j)
				System.out.print("*");
				else
			System.out.print(" ");
			for(int k=1;k<=5;k++)
				if(i<=k)
				System.out.print(" ");
				else
			System.out.print("*");
		}
		System.out.println();

	}

}bg
