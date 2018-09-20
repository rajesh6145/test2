package collection;

import java.util.LinkedList;

import com.graphbuilder.struc.LinkedList.Node;

public class LearnLinkedList {
	static Node node;

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
	
		list.add(12);
		list.add(423);
		list.add(4);
		list.add(44);
		list.add(9);
		list.add(43);
		list.add(1);
		list.add(7);
		list.add(32);
		list.add(888);
		
		System.out.println(list);
		System.out.println(list.get(2));

	}

}
