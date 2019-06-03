package class1.arrays;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		// [rows][columns]
		String x[][] = new String[3][4];
		x[0][0] = "A0";
		x[0][1] = "B0";
		x[0][2] = "C0";
		x[0][3] = "D0";

		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";

		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C3";
		x[2][3] = "C4";

		// rows
		int rows = x.length;
		System.out.println("Rows are = " + rows);
		// Columns
		int columns = x[0].length;
		System.out.println("Columns are = " + columns);

		for (int rowNum = 0; rowNum < rows; rowNum++) {
			for (int colNum = 0; colNum < columns; colNum++) {
				System.out.print(x[rowNum][colNum] + " ");
			}
			System.out.println();
		}

		
	}
}
