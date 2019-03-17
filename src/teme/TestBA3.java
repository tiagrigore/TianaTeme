package teme;

public class TestBA3 {
	public static int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);

	}
}
