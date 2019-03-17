package teme;

public class TestEA8 {
	public static boolean contains(int[] a, int[] b) {
		if (a.length == 0) {
			return false;
		}
		if (b.length == 0) {
			return true;
		}

		int k = 0;

		for (int element : a) {
			if (element == b[k]) {
				k++;
				if (k == b.length) {
					return true;
				}
			}
		}

		return false;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 2, 1, 3, 4 };
		int[] b = { 2, 3, 4 };
		System.out.println(contains(a, b));
	}
}
