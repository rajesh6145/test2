package arrayManipulation;

public class PrintDuplicates {
	char r;

	public static void main(String[] args) {

		String testString = "geeksforgeeks";
		char[] ch = testString.toCharArray();
		int[] empty = new int[26];

		// find first duplicate element
		for (int i = 0; i < ch.length; i++) {
			int order = orderof(ch[i]);
			if (empty[order - 1] == 0) {
				empty[order - 1] = 1;
				continue;

			}
			if (empty[order - 1] == 1) {
				System.out.println(orderToChar(order) + "- is the first duplicate element");
				break;

			}

		}

		// find occurrence of all alphabet
		System.out.println("*******detailed occurence is as below********");
		for (int i = 0; i < ch.length; i++) {
			int order = orderof(ch[i]);
			if (empty[order - 1] != 0) {
				empty[order - 1] = empty[order - 1] + 1;
			} else {
				empty[order - 1] = 1;
			}

		}

		for (int i = 0; i < empty.length; i++) {
			if (empty[i] != 0) {

				System.out.println("occurence of " + orderToChar(i + 1) + " is " + empty[i]);
			}
		}
	}

	public static int orderof(char ch) {

		return (int) ch - 96;
	}

	public static char orderToChar(int n) {

		return (char) (n + 96);
	}

}
