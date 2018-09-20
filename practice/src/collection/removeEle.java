package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class removeEle {

	public static void main(String[] args) {
		String[] string = {"Penny", "nickel", "dime", "Quarter", "dollar"};
		
		ArrayList<String> aryList = new ArrayList<>(Arrays.asList(string));
		System.out.println("printing aryList--"+aryList);
		Collections.replaceAll(aryList, "Penny", "Denny");
		System.out.println(aryList);
		aryList.remove(1);
		System.out.println(aryList);
		
		
		if(aryList.remove("nickel")) {
		System.out.println("TRUE");	
		}
		else {
			System.out.println("falss");
		}
		Collections.shuffle(aryList);
		System.out.println("*****shuffelled list**********");
		System.out.println(aryList);
		System.out.println(aryList.size());
		Collections.max(aryList);
		Collections.min(aryList);
		
		
		
		
		CopyOnWriteArrayList<String> aryListConcu = new CopyOnWriteArrayList<String>(Arrays.asList(string));
		System.out.println("printing aryListConcu--"+aryListConcu);
		System.out.println(aryListConcu.size());
		Collections.replaceAll(aryListConcu, "dollar", "shrof");
		System.out.println(aryListConcu);
		
		
		LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(string));
		System.out.println("printing LinkedList--"+linkedList);
		System.out.println(linkedList.size());
		System.out.println("***********************************************");
		Collections.replaceAll(linkedList, "dime", "timer");
		System.out.println(linkedList);
		
		HashSet<String> hashset = new HashSet<>(Arrays.asList(string));
		System.out.println("printing hashSet--"+hashset);
		System.out.println(hashset.size());
		//Collections.replaceAll(hashset, "dime", "abc");		//replace all not applicable for Set
		
		
		LinkedHashSet<String> linkedhashSet = new LinkedHashSet<>(Arrays.asList(string));
		System.out.println("printing linkedHashSet--"+linkedhashSet);
		System.out.println(linkedhashSet.size());
		//Collections.replaceAll(hashset, "dime", "abc");			//replace all not applicable for Set
		
		TreeSet<String> treeset = new TreeSet<>(Arrays.asList(string));
		System.out.println("printing treeSet--"+treeset);
		System.out.println("*******reversed tree set*******");
		System.out.println(treeset.descendingSet());
		System.out.println(treeset.size());
		//Collections.replaceAll(hashset, "dime", "abc");			//replace all not applicable for Set
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>(Arrays.asList(string));
		System.out.println("printing priorityQueue--"+priorityQueue);
		System.out.println(priorityQueue.size());
		
		
		
	}

}
