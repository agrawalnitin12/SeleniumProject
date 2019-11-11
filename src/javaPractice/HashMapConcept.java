package javaPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

//		HashMap<String, String> hm = new HashMap<>();
//		hm.put("B", "Nitin");
//		hm.put("A", "deepa");
//		hm.put("C", "aarav");
//		System.out.println(hm);
//		System.out.println(hm.get("A"));
//
//		
//		for (Entry e : hm.entrySet()) {
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
//		hm.remove("B");
//		System.out.println(hm);
//		hm.put("A", "deepika");
//		System.out.println(hm);
		
		HashMapObject hmo1 = new HashMapObject("Nitin", 25, "QA");
		HashMapObject hmo2 = new HashMapObject("Deepa", 20, "Dev");
		HashMapObject hmo3 = new HashMapObject("Aarav", 5, "school");
		
		HashMap<Integer, HashMapObject> hm = new HashMap<>();
		hm.put(1, hmo1);
		hm.put(2, hmo2);
		hm.put(3, hmo3);
		
		for (Entry<Integer, HashMapObject> e : hm.entrySet()) {
			int key = e.getKey();
			HashMapObject e1 = e.getValue();
			//System.out.println(key);
			System.out.println(key+" "+e1.name +" "+e1.age+" "+e1.dep);
			
		}
		
		
		
	}

}
