package teme;

import java.util.Scanner;

public class TestTR5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduceti suma in Ron: ");
		int sumaRon = scanner.nextInt();
		System.out.print("Curs valutar: ");
		double curs = scanner.nextDouble();
		double sumaEur = sumaRon / curs;
		int sumaIntreagaEur = (int) sumaEur;
		double restEur = sumaEur - sumaIntreagaEur;
		int restRon = (int) (restEur * curs);
		System.out.println("Suma in Euro: " + sumaIntreagaEur);
		System.out.println("Rest in Ron: " + restRon);

		scanner.close();
	}
}
