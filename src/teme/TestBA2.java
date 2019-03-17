package teme;

public class TestBA2 {
	public static int countNegatives(int[] sir) {
		int counter = 0;

		for (int element : sir) {
			if (element < 0) {
				counter++;

			}
		}
		return counter;

	}

	public static void main(String[] args) {
		System.out.println(countNegatives(new int[] { -1, 0 }));
	}
}
