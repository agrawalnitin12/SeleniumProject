package javaPractice;

public class StringSwap {

	public static void main(String[] args) {
		String a = "selenium";
		String b = "java";
		
		System.out.println("before Swapping");
		System.out.println("The value of A is: "+a);
		System.out.println("The value of B is: "+b);
		
		System.out.println("***************");
		
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("After Swapping");
		System.out.println("The value of A is: "+a);
		System.out.println("The value of B is: "+b);
		
	}

}
