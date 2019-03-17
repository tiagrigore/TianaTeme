package teme;

import java.util.Arrays;

public class TestEA7 {
	public static int nthSmallest(int[] sir, int n) {
		if (n > sir.length) {
			return -1;
		}
		Arrays.sort(sir);
		int nthMin = sir[n - 1];

		return nthMin;
	}

	public static void main(String[] args) {
		int[] sir = { 6, 8, 2, 1, 4, 9 };
		System.out.println(nthSmallest(sir, 7));
	}

}
