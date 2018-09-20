package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ArraylistClass {
	public static void main(String[] args) {
		
		 ArrayList<String> alist = new ArrayList();
		//ArrayList<String> alistString = new ArrayList<String>();
		
		
		 alist.add("first Element");
		 alist.add("second Element");
		 alist.add("third Element");
		
		System.out.println(alist);
		Iterator iterator = alist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Collections.sort(alist);
		
		for(String s: alist) {
			System.out.println(s);
		}
		System.out.println(alist);
		Collections.reverse(alist);
		System.out.println(alist);
		System.out.println();
		System.out.println(alist.get(1));
		
		LinkedList<String> list = new LinkedList<>();
		list.addAll(alist);
		
		list.addFirst("adobe");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		list.addLast("last");
		list.add(null);
		System.out.println(list.get(5));
		
		
		
		
	}
	

}
