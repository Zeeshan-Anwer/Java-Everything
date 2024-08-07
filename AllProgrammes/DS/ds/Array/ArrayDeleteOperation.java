//geta question

package ds.Array;

public class ArrayDeleteOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,50};
		int key=30;	// to delete
		delete(a,key);
		
	}
	
	public static int delete(int[] arr,int key){
		int position=ArraySearch.Search(arr,key);
		if(position==-1)
		{
			System.out.println("Element not found");
			return -1;
		}
		
		int i;
		for(i= position;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
			
		}
		for(i=0;i<arr.length;i++)
			System.out.print(" Arr: "+arr[i]);
		return 1;
		}
	}


