package teme;

public class TestBA9 {
	public static int getDiagonalSum(int[][] matrix) {

		int total = 0;

		for (int i = 0; i < matrix.length; i++) {

			total += matrix[i][i];
		}

		return total;

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 10, 11, 12 }, { 20, 10, 30 } };
		System.out.println(getDiagonalSum(matrix));
	}
}
