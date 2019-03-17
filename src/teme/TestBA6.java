package teme;

public class TestBA6 {
	public static int arrayToNumber(int[] sir) {
		if (sir.length == 0) {
			return -1;
		}
		int nr = 0;
		for (int element : sir) {
			if (element > 9 || element < 0) {
				return -2;
			}
			nr *= 10;
			nr += element;
		}
		return nr;
	}

	public static void main(String[] args) {
		System.out.println(arrayToNumber(new int[] { 0, 0, 1, 2, 7 }));
		System.out.println(arrayToNumber(new int[] { 0, 0, 11, 2, 7 }));
		System.out.println(arrayToNumber(new int[] {}));
	}
}
