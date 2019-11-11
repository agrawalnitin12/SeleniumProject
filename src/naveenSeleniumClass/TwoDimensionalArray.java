package naveenSeleniumClass;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		String s[][] = new String [][] {{"A","B","C","D","E"},{"A1","B1","C1","D1","E1"},{"A2","B2","C2","D2","E2"}};
		System.out.println(s.length);
		System.out.println(s[0].length);
		
		for(int i=0;i<s.length;i++) {
			for (int j=0;j<s[0].length;j++) {
				System.out.println(s[i][j]);
				
			}
		}

	}

}
