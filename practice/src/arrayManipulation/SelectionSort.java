package arrayManipulation;

public class SelectionSort {
	public static void main(String[] args) {
		int[] ary = { 5, 8, 1, 3, 9, 6, 7, 3 };
		sortMyArray(ary);
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}

	public static int[] sortMyArray(int[] ary) {
		int j = 0;
		int index = 0;
		int min = 0;
		for (int i = 0; i < ary.length - 1; i++) {
			index = i;
			min = ary[i];
			for (j = i + 1; j < ary.length; j++) {
				if (min > ary[j]) {
					min= ary[j];
					index=j;
				}

			}
			if(i!=index) {
				int temp= ary[i];
				ary[i]= ary[index];
				ary[index]= temp;
			}
		}
		return ary;
	}

}
