package javaPractice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scan.nextInt();
		int res = 1;
		
		for(int i = num;i>1;i--) {
			res = res*i;
		}
		System.out.println(res);
	}

}
