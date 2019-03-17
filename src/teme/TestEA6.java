package teme;

import java.util.Arrays;

public class TestEA6 {
	public static int[] intToArray(int n) {
		String s = Integer.toString(n);
		int length = s.length();
		int[] res = new int[length];

		for (int i = res.length - 1; i >= 0; i--) {
			int numar = n % 10;
			res[i] = numar;
			n /= 10;
		}
		return res;
	}

	public static void main(String[] args) {
		int n = 123;
		System.out.println(Arrays.toString(intToArray(n)));
	}
}
