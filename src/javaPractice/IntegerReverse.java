package javaPractice;

import java.util.Scanner;

public class IntegerReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scan.nextInt();
		int rev=0;
		
		while (num != 0) {
			rev = rev*10 + num%10;
			num=num/10;
		}
		System.out.println(rev);
		scan.close();
		
		int num1 = 12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
