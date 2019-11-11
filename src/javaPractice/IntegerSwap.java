package javaPractice;

public class IntegerSwap {

	public static void main(String[] args) {
		int a = 80;
		int b = 160;
		
//		a = a+b;//24
//		b = a-b;//8
//		a = a-b;//16
//		
//		System.out.println(a +" "+b);
		
//		a = a*b; //128
//		b = a/b; //8
//		a = a/b; //16
//		
//		System.out.println(a +" "+b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a +" "+b);
		
		
	}

}
