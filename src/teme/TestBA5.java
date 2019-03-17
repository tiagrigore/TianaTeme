package teme;

public class TestBA5 {
	public static int product(int[] sir) {

		int produs = 1;

		for (int element : sir) {
			if (element != 0) {
				produs *= element;

			}
		}
		return produs;

	}

	public static void main(String[] args) {
		System.out.println(product(new int[] { 2, 3, 5, 0, 0 }));
		System.out.println(product(new int[] { 0, 0, 0 }));
		System.out.println(product(new int[] {}));
	}
}
