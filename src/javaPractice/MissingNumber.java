package javaPractice;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[] = {-5,-6,-8,-9,-10};
		int sum = 0;
		int sum1 = 0;
		for (int i = 0;i<a.length;i++) {
			sum = sum + a[i];
		}
		
		for (int j = -10;j<=-5;j++) {
			sum1 = sum1+j;
		}
		System.out.println("Missing number is: " +(sum1-sum));
	}

}
