package teme;

import java.util.Scanner;

public class TestTR3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nr = scanner.nextInt();
		System.out.println(nr * nr);
		System.out.println(nr * nr * nr);
		scanner.close();
	}

}
