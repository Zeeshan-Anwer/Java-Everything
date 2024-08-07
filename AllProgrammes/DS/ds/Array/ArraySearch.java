package ds.Array;

public class ArraySearch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ARR[]= {2,4,6,8,10};
		int key=7;
		int result=Search(ARR,key);
		System.out.print("Item Index: "+result);
	}
	
	public static int Search(int[] ARR,int key) {
		for(int i=0;i<5;i++)
		{
			if(ARR[i]==key) {
				
			return i;
			}
		}
		return -1;
	}

}
