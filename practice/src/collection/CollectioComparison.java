package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectioComparison {
	
	public static void main(String[] args) {
		
		String[] str = {"rajesh","anmol", "nitesh", "shakti", "mohit", "rajesh", "sumit","Rajesh", "A"};
		ArrayList<String> array = new ArrayList<>(Arrays.asList(str));
		System.out.println(array);
		
		LinkedList<String> linkedlist = new LinkedList<>(Arrays.asList(str));
		System.out.println(linkedlist);
		
		
		TreeSet<String> tree = new TreeSet<>(Arrays.asList(str));
		System.out.println(tree);
		
		HashSet<String> hashset = new HashSet<>(Arrays.asList(str));
		System.out.println(hashset);
		
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<>(Arrays.asList(str));
		System.out.println(linkedhashset);
		
		
		
		
		
	}

}
