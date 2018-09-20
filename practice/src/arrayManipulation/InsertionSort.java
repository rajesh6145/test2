package arrayManipulation;

public class InsertionSort {

	public static void main(String[] args) {
		int[] ary = {5,8,1,3,9,6,7,3};
		sortMyArray(ary);
		for(int i =0; i<ary.length; i++) {
			System.out.println(ary[i]);
		}
	}

	
	public static int[] sortMyArray(int[] ary) {
		int key = 0;
		int temp=0;
		for(int i=1; i<ary.length; i++) {
			key= ary[i];
			for(int j=i-1; j>=0; j--) {
				if(key<ary[j]) {
					temp= ary[j];
					ary[j]= ary[j+1];
					ary[j+1]= temp;
					
					
				}
				else
					break;
			}
		}
		return ary;
		
	}
} 
