package ds.Array;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {10,20,30,40,50};
			int pos=3;	//position to put
			int key=25;	//number to put
			int result=insert(a,pos,key);
			System.out.println(result);
	}
	
	public static int insert(int[] arr,int pos,int key)
	{
		if(arr.length>=pos){
			arr[pos]=key;
			return 1;
		}
		return 0;
	}

}
