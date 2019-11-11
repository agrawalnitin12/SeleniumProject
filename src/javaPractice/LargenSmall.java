package javaPractice;

public class LargenSmall {

	public static void main(String[] args) {
		int a[] = { 5, 17, 4, 22, 56, 71, -67, 36, 89, 2, 40 };

		int largest = a[0];
		int smallest = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			} else if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		System.out.println("The largest number is: " + largest);
		System.out.println("The smallest number is: " + smallest);
	}
}
