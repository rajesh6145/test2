package collection;

import java.util.TreeMap;

public class TreeMapJava {
	public static void main(String[] args) {
		String str = "a man boy man boy man";
		String[] strAry = str.trim().split(" ");
		TreeMap<String, Integer> treemap = new TreeMap<>();
		for (String s : strAry) {
			if (treemap.containsKey(s)) {
				treemap.put(s, treemap.get(s) + 1);
			} else
				treemap.put(s, 1);

		}
		System.out.println(treemap);
	

	}

}
