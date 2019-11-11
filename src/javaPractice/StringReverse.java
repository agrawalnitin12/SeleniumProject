package javaPractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scan.next();
		int len = str.length();
		char[] nwStr = new char[len];
		int j = len - 1;
		for (int i = 0; i < len; i++) {
			nwStr[j] = str.charAt(i);
			j--;
		}
		System.out.println(nwStr);
		scan.close();
		
		String s1 = "laptop";
		StringBuffer sf = new StringBuffer(s1);
		System.out.println(sf.reverse());
	}

	}


