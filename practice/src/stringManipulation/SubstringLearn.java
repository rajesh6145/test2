package stringManipulation;

public class SubstringLearn {

	public static void main(String[] args) {
		String str= "0abcadefaghi";
	//	System.out.println(str.substring(2,5));
	//	System.out.println(str.indexOf('c'));
	//	System.out.println(str.lastIndexOf("a",3));
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i), i+1)>0) {
				System.out.println(str.charAt(i)+ " is he first repeated char at- "+ str.indexOf(str.charAt(i), i+1 ));
				break;
			}
		}
	}

}
