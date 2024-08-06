package javaPackage;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3, 4 }, { 2, 5, 7, 8 }, { 7, 3, 6, 7 } };
		int row = a.length;
		System.out.println("Total Rows = " + row);

		int column = a[1].length;
		System.out.println("Total column = " + column);

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print(a[i][j] + "     ");
			}
				System.out.println();
		}

	}

}
