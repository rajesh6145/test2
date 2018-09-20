package arrayManipulation;

import java.util.Scanner;

import overriding.TestClass;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String palindrome = scan.next();
		if (isPalindrome(palindrome)) {
			System.out.println("The given input- "+ palindrome+ " is a palindrome");
		} else {
			System.out.println("The given input- "+ palindrome+ " is not apalindrome");
		}
	}

	public static boolean isPalindrome(String string) {

		boolean flag = true;
		char[] chAry = string.trim().toCharArray();
		for (int start = 0, last = chAry.length - 1; start<chAry.length/2; start++, last--) {
			if (chAry[start] == chAry[last]) {
				continue;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	

}
