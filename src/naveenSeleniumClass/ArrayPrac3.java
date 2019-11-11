package naveenSeleniumClass;

public class ArrayPrac3 {

	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 2, 3, 3, 4, 5, 2, 3, 4 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] == a[i]) {
					break;
				}
				temp = temp + 1;
				break;
			}

		}
		System.out.println(temp);

	}
}
