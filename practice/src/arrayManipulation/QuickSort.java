package arrayManipulation;

public class QuickSort {
	static int[] ary={ 9, 6, 5, 0, 8, 2, 4, 7 };
	
	public static int partioning(int s, int e) {
		int i = s - 1;
		for (int j = s; j < e; j++) {
			if ((ary[j] < ary[e])) {
				i = i + 1;
				int temp = ary[i];
				ary[i] = ary[j];
				ary[j] = temp;
			}
		}
		int temp = ary[i + 1];
		ary[i + 1] = ary[e];
		ary[e] = temp;
		return i+1;
	}
	
	

	public static void main(String[] args) {
			
		sortMyArray(0, ary.length - 1);
		printArray();
	}

	public static void sortMyArray(int s, int e) {

		if (s < e) {
			int q = partioning(s, e);
			sortMyArray(s, q - 1);
			sortMyArray(q + 1, e);
		}
	}

	
	
	public static void printArray() {
		for(int i =0; i<ary.length;i++) {
			System.out.print(ary[i]+ " ");
		}
	}

}
