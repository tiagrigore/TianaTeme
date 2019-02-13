package teme;

public class TestTR8 {
	public static double divide(double a, double b) {
		if (b == 0) {
			return Double.MAX_VALUE;
		}

		return a / b;
	}

	public static void main(String[] args) {
		System.out.println(divide(10, 5));

	}
}
