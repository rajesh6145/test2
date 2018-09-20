package arrayManipulation;

import java.util.ArrayList;

public class SortByAsciiSum {

	static String gStr = "MY NAME IS ABHISHEK YM";
	static String[] splitAry = gStr.split(" ");
	static String[] intarr = new String[splitAry.length];
	//static ArrayList<Integer> sumAry = new ArrayList<>();
	//static ArrayList<Integer> indexAry = new ArrayList<>();

	public static void main(String[] args) {

		storeAsciiSum(splitAry);
		//System.out.println(sumAry);

		sortSumAry();

	}

	public static void storeAsciiSum(String[] splitString) {
		int i=0;
		for (String str : splitString) {
			//sumAry.add(asciiSum(str));
			
		}
	}

	public static int asciiSum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = sum + (int) str.charAt(i);
		}

		return sum;
	}

	public static void sortSumAry() {
		int min;
		int index = 0;
		int pre = 0;
		
		int arr[]= {166, 289, 156, 575, 166};
		/*
		 * for (int i = 0; i < sumAry.size(); i++) { for (int j = 0; j < sumAry.size();
		 * j++) { min = sumAry.get(0); if (!indexAry.contains(j)) { min =
		 * sumAry.get(j);} if (min > sumAry.get(j)) { if (!indexAry.contains(j)) {
		 * 
		 * min = sumAry.get(j); index = j; if(pre==j && indexAry.contains(pre)) { pre=
		 * pre+1; } System.out.println(" @log :" + sumAry.get(j) + " " + min + " " +
		 * index); } } } indexAry.add(index); System.out.println(splitAry[index]); }
		 */
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					//System.out.println("@1 "+sumAry.get(i)+" "+sumAry.get(j));
					int temp =  arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					//System.out.println("@2 "+sumAry.get(i)+" "+sumAry.get(j));
				}

			}
		}
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
