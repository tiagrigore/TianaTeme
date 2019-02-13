package teme;

public class TestTR9 {
	public static boolean inPitagoraRelation(int a, int b, int c) {
		if (a * a + b * b == c * c && (a + b + c) % 10 == 0) {
			return true;
		} else {
			return false;

		}

	}
}
