package Array.basic.zeeshan;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,26,64,36,46,36,0};
		System.out.println(get2ndLargest(arr));
		
	}
	
	public static int getLargest(int[] n)
	{
		int size=n.length;
		int largest=0;
		for(int i=1;i<size;i++){
			if(n[i]>largest)
			largest=n[i];
		}
		System.out.println("Largest:"+largest);
		return largest;
	}
	
	public static int get2ndLargest(int[] n)
	{
		int largest=getLargest(n);
		int size=n.length-1;
		int res=-1;
		for(int i=0;i<size;i++)
		{
			if(n[i]!=largest)
			{
				if(res==-1)
					res=n[i];
				else if(n[i]>n[res])
					res=n[i];
			}
						
		}
		System.out.println("2ndLargest:"+largest);
		return res;
	}
		
	}


