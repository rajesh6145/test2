package arrayManipulation;

public class FibonacciSeries {

	public static void fibonacci(int startWith, int howManyNo) {

		int scndlast = 0;
		int last = startWith;

		for (int i = 1; i < howManyNo; i++) {
			int curr = scndlast + last;
			System.out.println(curr);
			scndlast = last;
			last = curr;
		}
	}

	public static void fibRecurrsive() {

	}

	public static void main(String[] args) {
		fibonacci(5, 10);

	}

}
