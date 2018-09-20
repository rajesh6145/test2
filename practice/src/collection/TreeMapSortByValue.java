package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortByValue {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1, "ank");
		tmap.put(5, "mark");
		tmap.put(3, "chu");
		tmap.put(2, "tiya");
		
		System.out.println("Entered map:-"+tmap);
		System.out.println("*******************************************");
		
		TreeMap<String, Integer> revTreemap	= new TreeMap<>();
		
		for(Map.Entry<Integer, String> entry: tmap.entrySet()) {
			
			revTreemap.put(entry.getValue(), entry.getKey());
		}
		
		
		System.out.println("reversed tmap:-"+revTreemap);
		
		
		
		
		
		
		
		
		
		
		

	}

}
