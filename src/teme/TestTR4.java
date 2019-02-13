package teme;

import java.util.Scanner;

public class TestTR4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Suma EURO: ");
		int euro = scanner.nextInt();
		System.out.print("Curs valutar: ");
		double cursEuro = scanner.nextDouble();
		double sumaRon = euro * cursEuro;
		System.out.println("Suma in Ron: " + sumaRon);

		scanner.close();
	}
}
