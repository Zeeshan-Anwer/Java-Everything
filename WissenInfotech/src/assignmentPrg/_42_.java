package assignmentPrg;

import java.util.HashSet;
import java.util.Set;

public class _42_ {

	public static void main(String[] args) {
		//doubts
		long result=1;
		int uplimit=20;
		Set<Integer>digits=new HashSet<Integer>();
		
		for(int i=1;i<=uplimit;i++) {
			if(result%i!=0) {
				digits.add(i);
				result *=i;
				for(int j=2;j<i;j++) {
					if(i%j==0 && result %j==0) {
						if(digits.contains(j)) {
							result /=j;
							digits.remove(j);
							
						}
					}
				}
			}
		}
	System.out.println(result);
	}

}
