package arrayManipulation;

public class RemoveDuplicates {
	public static void main(String[] args) {
		/*
		 * String str = "geeksforgeeks"; String result = "";
		 * 
		 * for (int i = 0; i < str.length(); i++) { if (result.indexOf(str.charAt(i)) <
		 * 0) { result = result + str.charAt(i); } }
		 * 
		 * System.out.println(result);
		 */

		removeDuplicatesWithoutAnyOtherString("geeksforgeeks");
	}

	public static void removeDuplicatesWithoutAnyOtherString(String str) {
		for (int i = 1; i < str.length(); i++) {

			if (str.substring(0, i).indexOf(str.charAt(i)) >= 0) {
				str = str.replace(str.charAt(i), ' ');
			}

		}
		System.out.println(str);

	}
}
