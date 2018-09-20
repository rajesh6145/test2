package arrayManipulation;

public class Amrstrong {

	public static int cube(int n) {
		int num = n * n * n;
		return num;
	}

	static int sum = 0;

	public static int isArmstrong(int testNum) { // Recursive number
		if (testNum != 0) {
			int rem = testNum % 10;
			sum = cube(rem) + sum;
			isArmstrong(testNum / 10);
		}
		return sum;
	}

	public static boolean isArmstrongNum(int num) { // using for loop
		int sum = 0;
		for (int i = num; i != 0; i = i / 10) {
			int rem = i % 10;
			sum = sum + rem * rem * rem;
		}
		if (sum == num) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Amrstrong.isArmstrong(23);
		Amrstrong.isArmstrongNum(34);
	}

}
