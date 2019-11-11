package javaPractice;

public class StringWordsReverse {

	public static void main(String[] args) {
		String st = "Nitin Automation Selenium Java TestNG";
		String a[] = st.split(" ");
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
