package naveenSeleniumClass;

public class ArrayConcept {

	public static void main(String[] args) {
		int i [] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		for (int j = 0;j<i.length;j++) {
			System.out.println(i[j]+",");
		}
		
		char c[] = new char [4];
		c[0] = 'L';
		c[1] = 'G';
		c[2] = 'S';
		c[3] = 'O';
		
		for (int k = 0;k<c.length;k++) {
			System.out.println(c[k]);
		}
		
		String s [] = new String [4];
		s[0] = "Nitin";
		s[1] = "Agrawal";
		s[2] = "LG";
		s[3] = "Soft";
		
		for (int l = 0;l<s.length;l++) {
			System.out.println(s[l]);
		}
		
		Object ob [] = new Object [6];
		ob[0] = "Nitin";
		ob[1] = "Agrawal";
		ob[2] = 2732;
		ob[3] = "12Jun1984";
		ob[4] = 50000;
		ob[5] = 'L';
		for (int x = 0; x<ob.length;x++) {
			System.out.println(ob[x]);
		}
		
		
	}

}
