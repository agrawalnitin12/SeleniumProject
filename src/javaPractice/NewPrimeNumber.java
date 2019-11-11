package javaPractice;

public class NewPrimeNumber {

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void listPrimeNumber(int num) {

		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		listPrimeNumber(100);
	}

}
