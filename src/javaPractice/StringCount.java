package javaPractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringCount {

	public static void main(String[] args) {

		String str[] = {"India", "US", "Japan", "US", "India"};
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (String name : str) {
			Integer count = hm.get(name);
			if(count == null) {
				hm.put(name, 1);
			}
			else {
				hm.put(name, ++count);
			}
		}
		Set<Entry<String,Integer>> entryset = hm.entrySet();
		for(Entry<String, Integer> entry : entryset ) {
			if(entry.getValue()>1) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		}
	}

}
