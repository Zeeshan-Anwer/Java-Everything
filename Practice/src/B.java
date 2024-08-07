

public class B {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int val = 24;
		System.out.println(sumCheck(arr, val));
	}

	private static boolean sumCheck(int[] arr, int val) {

		int i = 1;
		while (i < arr.length) {
			if (arr[i] + arr[i - 1] == val)
				return true;
			i++;
		}
		return false;
	}

}
