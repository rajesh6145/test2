package cunstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class SortByAsciiSum {
	static String gStr = "MY NAME IS ABHISHEK YM";
	static String[] splitAry = gStr.split(" ");
	static ArrayList<Abc> ObjAry = new ArrayList<>();

	public static void main(String[] args) {
		storeAsciiSum(splitAry);
		Collections.sort(ObjAry);
		
		Iterator<Abc> itr = ObjAry.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().str);
		}
		
		for(Abc obj : ObjAry) {
			System.out.println(obj.str);
		}
	}

	public static void storeAsciiSum(String[] splitString) {
		for (int i = 0; i < splitString.length; i++) {
			ObjAry.add(new Abc(asciiSum(splitString[i]), splitString[i]));
		}
	}

	public static int asciiSum(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = sum + (int) str.charAt(i);
		}
		return sum;
	}

}

class Abc implements Comparable<Abc> {
	String str;
	int asciiSum;

	Abc(int asciiSum, String str) {
		this.str = str;
		this.asciiSum = asciiSum;
	}

	@Override
	public int compareTo(Abc o) {
		if(asciiSum== o.asciiSum) {
			return 0;
		}
		else if (asciiSum>o.asciiSum) {
			return 1;
		}
		else
			return -1;
		}
		
	}


