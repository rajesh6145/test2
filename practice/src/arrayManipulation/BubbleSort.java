package arrayManipulation;

public class BubbleSort {

	public static void main(String[] args) {
		//int[] ary = {123,545,23423,65767,23,566,2423,767,24 };
		int[] ary = {5,8,1,6,9,2};
		bubbleSort(ary);
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		

	}
	
	public static int[] bubbleSort(int[] ary) {
		for(int i=ary.length-1; i>0; i--) {
			for(int j= 0; j<=i-1; j++) {
				if(ary[j]>ary[j+1]) {
					//swap;
					int temp = ary[j];
					ary[j]= ary[j+1];
					ary[j+1]= temp;
				}
			}
		}
		return ary;
		
	}

}
