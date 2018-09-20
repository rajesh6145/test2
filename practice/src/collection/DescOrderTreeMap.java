package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DescOrderTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(1, "ank");
		tmap.put(5, "mark");
		tmap.put(3, "chu");
		tmap.put(2, "tiya");
		
		System.out.println("Entered_Map:-"+tmap);
		System.out.println("*******************************************");
		
		System.out.println(tmap.size());
		
		Set mapSet = tmap.entrySet();
		System.out.println(mapSet);
		
		ArrayList<Integer> aryList = new ArrayList<>();
		for(Map.Entry<Integer, String> map : tmap.entrySet()) {
			aryList.add(map.getKey());
		}
		Collections.reverse(aryList);
		for(Integer i: aryList) {
			System.out.println(i +"="+tmap.get(i));
		}
	

	}

}
