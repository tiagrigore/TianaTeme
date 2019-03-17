package teme;

import java.util.Arrays;

public class TestBA8 {
	public static int[] reverse(int[] sir) {
		int[] result = new int[sir.length];

		for (int i = 0; i < sir.length; i++) {
			result[result.length - 1 - i] = sir[i];
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverse(new int[] { 1, 2, 3, 4, 5 })));
	}
}
