package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ThirdLargestNumber {

	// ***********not completed***************
	public static void main(String[] args) {
		int[] ary = {23,45,31,34,8,45,23,19,22,33};
		
		TreeMap<Integer,Integer> tree = new TreeMap<>();
		for(int i =0; i<ary.length; i++) {
			if(tree.containsKey(ary[i])) {
				continue;
			}
			else {
				tree.put(ary[i], i+1);
				
			}
		}
		
		
		
		System.out.println(tree);
		
		/*for(Map.Entry<Integer, Integer> entry: tree.entrySet() ) {
			if(entry.getValue().equals(ary.length-3+1)){
				System.out.println(entry.getKey());
			}
		}
*/
	}

}
