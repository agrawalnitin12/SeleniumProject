package javaPractice;

public class ThirdLargestElement {

	public static void main(String[] args) {
		int a [] = {6,7,3,8,4,5,2,10,9};
		
		int temp;
		int key;
		
		for(int i =0;i<a.length;i++) {
			key=a[i];
			for(int j = i+1;j<a.length;j++) {
				if(key>a[j]) {
					temp = key;
					key = a[j];
					a[j] = temp;
				}
			}
			a[i] = key;
		}
		
			System.out.print(a[a.length-3]);
	
		
	}

}
