package javaPractice;

public class Palindrome {

	public static void main(String[] args) {

		String a = "java";
		int len = a.length();
		String rev = "";
		
		for (int i = len-1;i>=0;i--) {
		rev = rev+a.charAt(i);
		}
		
		System.out.println(rev);
		
		if (rev.equals(a)) {
			System.out.println("palindrome");
		}
		else 
			System.out.println("not palindrome");
		
	}

}
