package stringManipulation;

public class Question1 {

	public static void main(String[] args) {
		String mainString = "AdobeSystemIndia";
		char[] strChar = mainString.toCharArray();
		for(int i =0; i<strChar.length; i++) {
			if (ifContains(strChar[i], mainString.substring(i+1))) {
				System.out.println("first Duplicate:-"+ strChar[i]);
				break;
			}
			else continue;
			
		}
		

	}
	
	
	public static boolean ifContains(char c, String subString) {
		if(subString.indexOf(c)>=1) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
	}

}
