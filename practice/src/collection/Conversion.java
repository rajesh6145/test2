package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Conversion {

	public static void main(String[] args) {
		String[] ary = {"rajesh","anmol", "nitesh", "shakti", "mohit", "rajesh", "sumit","Rajesh"};
		//ArrayList<String> al = new ArrayList<>(Arrays.asList(ary));
		ArrayList< String> al = new ArrayList<>();
		al.addAll(Arrays.asList(ary));
		
		LinkedList<String> ll = new LinkedList<>();
		ll.addAll(Arrays.asList(ary));
		
		System.out.println(al);
		for(String s: ll) {
			System.out.println(s);
		}
		
		HashSet<String> hs = new HashSet<>();
		hs.addAll(Arrays.asList(ary));
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(Arrays.asList(ary));
		
		System.out.println(lhs);
		
		TreeSet<String> treeset = new TreeSet<>();
		treeset.addAll(Arrays.asList(ary));
		//treeset.addAll(lhs);
		System.out.println("********");
		System.out.println(treeset);
		Collection<String> col=      Collections.unmodifiableCollection(treeset);
		treeset.add("last");
		//treeset.clear();
		System.out.println(treeset);

	}

}
