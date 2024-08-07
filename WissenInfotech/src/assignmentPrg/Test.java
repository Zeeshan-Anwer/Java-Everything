package assignmentPrg;

public class Test {
	
	public static void main(String[] args) {
		

	int sum=0,sumsqr=0;
	for(int i=1;i<=100;i++) {
	sum=sum+(i*i);
	sumsqr+=i;
	}
	sumsqr=sumsqr*sumsqr;
	System.out.println(sumsqr-sum);

}
}
