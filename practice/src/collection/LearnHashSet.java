package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LearnHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<>();
		hashset.add(234);
		hashset.add(2342);
		hashset.add(12);
		hashset.add(45);
		hashset.add(null);
		for(Integer s: hashset) {
			System.out.println(s);
		}
		System.out.println(hashset);
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add(null);
		linkedhashset.add("a");
		linkedhashset.add("c");
		linkedhashset.add("b");
		linkedhashset.add("d");
		linkedhashset.add(null);
		
		System.out.println(linkedhashset);

	}

}
