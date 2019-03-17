package teme;

public class TestEA17 {
	public static int removeDuplicates(int[] arr) {
		if (arr.length < 2) {

			return arr.length;
		}
		int j = 0;
		int i = 1;

		while (i < arr.length) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}

			i++;
		}

		return j + 1;
	}
}
