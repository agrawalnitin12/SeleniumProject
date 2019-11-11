package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		String name[] = { "Java", "C", "Selenium", "QTP", "RFT", "C", "Java","Selenium", "Java" };
		
		Set<String> store = new HashSet<String>();
		
		for (String n : name) {
			if(! store.add(n)) {
				System.out.println("duplicate element is: "+ n);
			}
		}
		
	}

}
