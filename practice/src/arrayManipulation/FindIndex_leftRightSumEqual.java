package arrayManipulation;

public class FindIndex_leftRightSumEqual {

	public static void main(String[] args) {
		int[] intAry = { 12, -3, -4, 12, -4, 5, -12, 6, -6, 7, -3, 4, 7, -8, 4, 3, -2, 5, 7, -3, -8, 3, 4, 0, -5, -2, };
		for (int i = 0; i < intAry.length; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for (int j = 0; j < intAry.length; j++) {
				if (j < i) {
					leftSum = leftSum + intAry[j];
				}
				if (j > i) {
					rightSum = rightSum + intAry[j];
				}
				if (j == i) {
					continue;
				}
			}
			if(leftSum==rightSum) {
				System.out.println("the result is:"+ i);
			}
		}

	}

}
