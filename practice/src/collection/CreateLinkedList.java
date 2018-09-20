package collection;

public class CreateLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static void printlist(Node node) {
		while (node != null) {
			System.out.print(node.data);
			System.out.print(" ");

			node = node.next;
		}

	}

	static Node revrseLinkedList(Node node) {
		Node curr = node;
		Node pre = null;
		Node next = null;

		while (curr!= null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		return pre;
	}

	public static void main(String[] args) {
		CreateLinkedList list = new CreateLinkedList();

		list.head = new Node(23);
		list.head.next = new Node(5);
		list.head.next.next = new Node(9);
		list.head.next.next.next = new Node(19);
		list.head.next.next.next.next = new Node(0);
		list.head.next.next.next.next.next = new Node(7);

		// print linkelist
		printlist(head);
		
		head = revrseLinkedList(head);
		 
		// print reversed list
		System.out.println("reversed list is:-");
		printlist(head);
		

	}

}
