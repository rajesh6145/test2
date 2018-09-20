package arrayManipulation;

public class MaxContiguousArraySum {

	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in); int[] ary = new int[6]; for(int i=0;
		 * i<ary.length;i++) { ary[i]= scan.nextInt(); }
		 */

		int[] ary = { -10, -2, 7 - 4, -2, 19 };

		System.out.println("max Contiguous sum in Array is:-  " + findMaxContiguousSum(ary));

	}

	public static int findMaxContiguousSum(int[] ary) {
		int max_end = 0;
		int max_so_far = 0;
		for (int i = 0; i < ary.length; i++) {
			max_end = max_end + ary[i];
			if (max_end > 0) {
				if (max_so_far < max_end) {
					max_so_far = max_end;

				}
			} 
			else {
				max_end = 0;

			}

		}

		return max_so_far;
	}

}
