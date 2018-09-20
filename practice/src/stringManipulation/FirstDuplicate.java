package stringManipulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDuplicate {

	public static void main(String[] args) {
		String mainString = "AdobeSystemIndia";
		char[] ch = mainString.toLowerCase().toCharArray();
		LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (hash.containsKey(ch[i])) {
				hash.put(ch[i], (hash.get(ch[i]) + 1));
				System.out.println(ch[i]);
				break;

			} else {
				hash.put(ch[i], 1);

			}

		}
	


	}
}