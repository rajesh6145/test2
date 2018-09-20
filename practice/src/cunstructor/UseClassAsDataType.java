package cunstructor;

import java.util.ArrayList;
import java.util.Collections;

public class UseClassAsDataType {
	String str;
	int i;

	public UseClassAsDataType(String str, int i) {
		this.str = str;
		this.i = i;
	}

	public static void main(String[] args) {
		ArrayList<UseClassAsDataType> ary = new ArrayList<>();
		ary.add(new UseClassAsDataType("rajesh", 6145));
		ary.add(new UseClassAsDataType("rahul", 1001));
		ary.add(new UseClassAsDataType("ashish", 0));
		ary.add(new UseClassAsDataType(null, 121));
		
		//Collections.sort(ary);
		for(UseClassAsDataType obj: ary) {
			System.out.println(obj.str + " "+ obj.i);
		}
	}
}