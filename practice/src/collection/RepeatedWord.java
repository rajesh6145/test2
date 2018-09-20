package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RepeatedWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		repeated(str);
	}

	public static void repeated(String str) {
		LinkedHashMap<Character, Integer> hashmap = new LinkedHashMap<>();
		char[] ch = str.trim().toLowerCase().toCharArray();
		for (char c : ch) {
			if(c!=' ') {
			if (hashmap.containsKey(c)) {
				
				hashmap.put(c, hashmap.get(c) + 1);
			} else
				hashmap.put(c, 1);
		}
		}

		int maxValue = 1;
		char maxkey = '\0';

		for (Map.Entry<Character, Integer> hm : hashmap.entrySet()) {

			if (hm.getValue() > maxValue) {
				maxValue = hm.getValue();
				maxkey = hm.getKey();
				
			}

		}

		System.out.println("word which repeated for max time is:-" + maxkey);

	}

}
