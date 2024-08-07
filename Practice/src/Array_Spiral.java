
public class Array_Spiral {

	public static void main(String[] args) {
		
		int[][] m = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 7, 8, 9, 10 } };
		int j = 0, i = 0;

		for (i = 0; i < m.length; i++) {

			if (i == 0) {
				for (j = 0; j < m[0].length; j++) {
					System.out.println(m[i][j]);
				} // for
			} // if
			if (i == 1) {
				j = m[1].length - 1;
				System.out.println(m[i][j]);
			} // if
			if (i == 2) {
				for (j = m[2].length - 1; j >= 0; j--) {
					System.out.println(m[i][j]);
				} // infor
			} // if

		} // outfor

		for (j = 0; j <= m[2].length - 2; j++) {
			i = 1;
			System.out.println(m[i][j]);
		} // for

	}// main

}// class
