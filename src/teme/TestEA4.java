package teme;

public class TestEA4 {
	public static int cmmmc(int a, int b) {
		int temp = a * b;
		int cmmmc = temp;
		for (int i = temp; i > 0; i--) {
			if (i % a == 0 && i % b == 0) {
				cmmmc = i;
			}
		}
		return cmmmc;

	}

	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		System.out.println(cmmmc(a, b));
	}
}
