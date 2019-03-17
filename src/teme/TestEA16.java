package teme;

public class TestEA16 {
	public static int countAppearances(int[] a, int[] b) {
		int counter = 0;
		for (int i = 0; i <= (a.length - b.length); i++) {
			int result = 0, k = 0;
			for (int abc : b) {
				if (a[i + k] == abc) {
					result++;
					k++;
				} else {
					break;
				}
				if (result == b.length && b.length > 0) {
					counter++;
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(countAppearances(new int[] { 1, 2, 3, 2, 2, 8, 1, 2, 6 }, new int[] { 1, 2, 3 }));
	}
}
