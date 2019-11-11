package naveenSeleniumClass;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> AL = new ArrayList<String>();
		AL.add("bala");
		AL.add("Ravi");
		AL.add("chiru");
		AL.add("chaitu");
		System.out.println(AL);
		Iterator<String> itr = AL.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.equals("bala")) {
				itr.remove();
			}
			System.out.println(s);
		}
		System.out.println(AL);
	}
}
