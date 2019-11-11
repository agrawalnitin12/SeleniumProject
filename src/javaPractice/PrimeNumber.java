package javaPractice;

public class PrimeNumber {

	public static void main(String[] args) {

		int temp = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = i; j > 0; j--) {
				if (i % j == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 2) {
				System.out.println(i);
			}
			temp = 0;
		}

	}

}
