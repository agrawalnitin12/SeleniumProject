package naveenSeleniumClass;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int count = 0;
		int total = 0;
		for (int x = 1;x<=1000;x++) {
		for (int i = x; i>0;i--) {
			if (x%i == 0) {
				count = count + 1;
			}
				
			}
		 if (count == 2) {
			 System.out.println(x);
			 total = total +1;
			 
		 }
		 count = 0;
		}
		System.out.println(total);
			
	}

}
