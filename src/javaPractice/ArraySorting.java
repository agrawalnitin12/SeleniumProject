package javaPractice;

public class ArraySorting {

	public static void main(String[] args) {
		int[] a = { 3, 5, 6, 3, 4, 9, 2, 8, 2, 1 };
		int temp, key;

		for (int i = 0; i < a.length; i++) {
				key = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (key > a[j]) {
					temp = key;
					key = a[j];
					a[j] = temp;
				}
				a[i] = key;
			}
		}

		for (int k = 0;k<a.length;k++) {
			System.out.println(a[k]);
		}

	}

}
