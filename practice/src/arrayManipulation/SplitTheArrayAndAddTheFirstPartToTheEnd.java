package arrayManipulation;

public class SplitTheArrayAndAddTheFirstPartToTheEnd {

	static public void approach1(char[] ary, int k) {
		for (int i = 0; i < k; i++) {
			char element = ary[0];
			for (int j = 1; j < ary.length; j++) {
				ary[j - 1] = ary[j];
			}
			ary[ary.length - 1] = element;
		}

		System.out.println(ary);

	}

	static public void approach2(char[] ary, int k) {
		String str = new String(ary);
		str = str.substring(k + 1, str.length()) + str.substring(0, k + 1);
		System.out.println(str);

	}

	

	public static void main(String[] args) {
		char[] ary = { 'a', 'd', 'o', 'b', 'e', 's', 'y', 's', 't', 'e', 'm' };
		approach1(ary, 5);

		approach2(ary, 5);
		

	}

}
