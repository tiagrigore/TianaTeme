package teme;

public class TestEA5 {
	public static int cmmdc(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		if (a == b)
			return a;

		if (a > b)
			return cmmdc(a - b, b);
		return cmmdc(a, b - a);
	}

	public static void main(String[] args) {
		int a = 98;
		int b = 56;
		System.out.println(cmmdc(a, b));
	}
}
