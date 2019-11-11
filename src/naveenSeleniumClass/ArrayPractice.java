package naveenSeleniumClass;


public class ArrayPractice {

	public static void main(String[] args) {
		
		int [] a = new int [] {1,2,3,4,5,1};
		System.out.println(a.length);
		int temp_one = 0;
		int temp_two = 0;
		int temp_three = 0;
		int temp_four = 0;
		int temp_five = 0;
		
		for (int i =0;i<a.length;i++) {
			if (a[i]==1) {
				temp_one = temp_one+1;
			} else if (a[i] == 2) {
				temp_two = temp_two+1;
			} else if (a[i] == 3) {
				temp_three = temp_three+1;
			} else if (a[i] == 4) {
				temp_four = temp_four+1;
			} else if (a[i] == 5) {
				temp_five = temp_five+1;
			}
		}
			if (temp_one > 1)
				System.out.println("1");
			if (temp_two > 1)
				System.out.println("2");
			if(temp_three>1)
				System.out.println("3");
			if(temp_four>1)
				System.out.println("4");
			if (temp_five>1)
				System.out.println("5");
	}
}
