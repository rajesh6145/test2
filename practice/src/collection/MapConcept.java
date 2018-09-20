package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapConcept {

	public static void main(String[] args) {
		Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		map.put(001, "rajesh");
		map.put(002, "amisha");
		map.put(003, "kumar");
		map.put(004, "ankit");
		map.put(005, "abhishek");
		map.put(006, "anmol");
		map.put(007, "amisha");
		
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
		Set hash = map.entrySet();
		
		Iterator itr = hash.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+"  "+ entry.getValue());
			map.remove(007);
		}
		
		//Second way to iterate map
		for(Map.Entry entry1: map.entrySet()) {
			System.out.println(entry1.getKey()+"  "+entry1.getValue());
		}
		
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		System.out.println(map);
		System.out.println(map.values());
		
		
	}

}
