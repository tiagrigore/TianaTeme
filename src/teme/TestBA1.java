package teme;

public class TestBA1 {
	public static double avg(int[] sir) {
		double sum = 0;

		for (int element : sir) {
			sum += element;

		}

		return sum / sir.length;

	}

	public static void main(String[] args) {
		System.out.println(avg(new int[] { 1, 2, 3, 4 }));
	}
}
