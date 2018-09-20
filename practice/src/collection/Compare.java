package collection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Compare {

	public static void main(String[] args) {
		String [] coin = {"Penny", "nickel", "dime", "Quarter", "dollar"};
		TreeSet<String> tree = new TreeSet<>();
		for(int i = 0; i<coin.length; i++) {
			tree.add(coin[i]);
		}
		System.out.println(tree);
		
		TreeSet<String> tree2 =new TreeSet<>();
		tree2.addAll(tree);
		//tree2.addAll(Arrays.asList(coin));
		System.out.println(tree2);
		int i=0;
		for(String str:tree) {
			if(str==coin[i]) {
				System.out.println(str);
			}
			i++;
		}

	}

}
