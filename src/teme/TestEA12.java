package teme;

public class TestEA12 {
	public static int[] removePosition(int[] arr, int pos) {
		if (pos < arr.length && pos >= 0 && arr.length > 0) {
			int[] newArr = new int[arr.length - 1];
			int counter = 0;

			for (int i = 0; i < arr.length; i++) {
				if (i != pos) {
					newArr[counter] = arr[i];
					counter++;
				}
			}
			return newArr;
		}
		return null;
	}
}
