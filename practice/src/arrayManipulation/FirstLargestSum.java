package arrayManipulation;

public class FirstLargestSum {

	public static void main(String[] args) {
		int[] ary = { 12, 34, 10, 6, 40 };
		int scnd = 0;
		int first = 0;
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] <= scnd) {
				continue;
			}
			if (ary[i] > scnd) {
				if (ary[i] >= first) {
					scnd=first;
					first = ary[i];
				} else {
					scnd = ary[i];
				}
			}
		}
		
		System.out.println(scnd+first);

	}

}
