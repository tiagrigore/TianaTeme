package teme;

public class TestEA2 {
	public static boolean isPalindrome(int n) {

		int palindrome = n;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		return n == reverse;
	}

	public static void main(String[] args) {
		int numar = 158;
		System.out.println(isPalindrome(numar));

	}
}
