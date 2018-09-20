package arrayManipulation;

public class SortByAsciiSum2 {
	static String given_Str = "MY NAME IS ABHISHEK YM";
	static String[] splited_Ary = given_Str.split(" ");
	static int[] int_arr = new int[splited_Ary.length];

	public static void main(String[] args) {
		for (int i = 0; i < splited_Ary.length; i++) {
			int_arr[i] = asciiSum(splited_Ary[i]);
			System.out.println(int_arr[i]);
		}
		sort_intAry();
		for(int i=0; i<splited_Ary.length;i++) {
			System.out.println(splited_Ary[i]);
		}
	}

	
	public static void sort_intAry() {
		for(int i= 0; i<int_arr.length-1;i++) {
			for(int j=i+1; j<int_arr.length; j++) {
				if(int_arr[i]>int_arr[j]) {
					int temp= int_arr[i];
					int_arr[i]=int_arr[j];
					int_arr[j]= temp;
					update_Splited_Ary(i, j);
				}
			}
		}
		
	}
	public static int asciiSum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = sum + (int) str.charAt(i);
		}

		return sum;
	}
	
	public static void update_Splited_Ary(int i, int j) {
		String temp= splited_Ary[i];
		splited_Ary[i]=splited_Ary[j];
		splited_Ary[j]= temp;
	}

}
