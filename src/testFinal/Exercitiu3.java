package testFinal;

public class Exercitiu3 {
	public static int next(int[] arr, int n) {
		if (n == arr[arr.length - 1]) {
			return -1;

		}

		int followNmb = 0;
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				followNmb = arr[i + 1];
				return followNmb;
			}

		}
		return -2;

	}

	public static void main(String[] args) {
		int[] arr = { 8, 3, 2, 4, 5 };
		int n = 10;
		System.out.println(next(arr, n));
	}
}
