package teme;

public class TestBA4 {
	public static int max(int[] sir) {
		int max = sir[0];

		for (int i = 1; i < sir.length; i++) {
			if (sir[i] > max) {
				max = sir[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(max(new int[] { 4, 7, 2, 9, 1 }));
	}
}
