package naveenSeleniumClass;

public class ArrayPrac2 {

	public static void main(String[] args) {
		
		int [] a = new int [] {1,0,0,0,0,0,0,0,1};
		int temp;
		
		for (int i = 0;i<a.length;i++) {
			for (int j = i+1;j<a.length;j++) {
				if (a[i]<a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					break;
				}
			}
		}
		for (int k=0;k<a.length;k++)
			System.out.println(a[k]);
		}

}
