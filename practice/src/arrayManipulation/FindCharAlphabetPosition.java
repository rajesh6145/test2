package arrayManipulation;

public class FindCharAlphabetPosition {

	public static void main(String[] args) {
		String str = "rajesh";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int position = (int)ch[i];
			int postion_alpha= 96;
			System.out.println(position-postion_alpha);
		}

	}

}
