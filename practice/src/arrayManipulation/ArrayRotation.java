package arrayManipulation;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int num= Integer.parseInt(str);
		scan.close();

		int[] intAry = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for(int i=num; i>0; i--) {
			leftRotate(intAry);
		}
		
		

		displayArray(intAry);

	}

	static public int[] leftRotate(int[] ary) {
		int size = ary.length;
		int temp = ary[0];
		for (int i = 1; i < size; i++) {
			ary[i - 1] = ary[i];
		}
		ary[size - 1] = temp;
		return ary;
	}

	public static void displayArray(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}
}
