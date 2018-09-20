package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionLadder {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap1 = new HashMap<>();
		hashmap1.put(1, "vaibhav");
		hashmap1.put(2, "rajesh");
		hashmap1.put(3, "sumit");
		hashmap1.put(4,"yogi");
		
		HashMap<Integer, String> hashmap2 = new HashMap<>();
		hashmap2.put(5, "vaibhav");
		hashmap2.put(6, "rajesh");
		hashmap2.put(7, "sumit");
		hashmap2.put(8,"yogi");
		
		ArrayList< Map> ary1 = new ArrayList<>();
		ary1.add(hashmap1);
		ArrayList< Map> ary2 = new ArrayList<>();
		ary2.add(hashmap2);
		
		
		HashMap<Integer, ArrayList<Map>> hashFinal = new HashMap<>();
		hashFinal.put(1, ary1);
		hashFinal.put(2, ary2);
		
		System.out.println(hashFinal);
		
	}

}
