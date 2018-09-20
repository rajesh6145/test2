package arrayManipulation;

public class ProductofElementsOtherThanItself {

	static int zeros = 0;
	static int zeroIndex;
	static int prod=1;
	public static void main(String[] args) {
		int[] ary = {2,5,1,4,6,7,4,3,8};
		for(int i = 0; i<ary.length;i++) {
			if(ary[i]==0) {
				zeros= zeros+1;
				zeroIndex= i;
				continue;
			}
			prod= prod*ary[i];
			
		}
		
		System.out.println(prod);
		
		int[] ary2 = new int[ary.length];
		for(int j=0; j<ary.length;j++) {
			if(zeros==0) {
				ary2[j]= prod/ary[j];
			}
			if(zeros==1) {
				if(j==zeroIndex) {
					ary2[j]=prod;
				}
				else {
					ary2[j]=0;
				}
			}
			if(zeros>1) {
				ary2[j]=0;
			}
			
		}
		
		for(int k=0; k<ary2.length; k++) {
			System.out.print(ary2[k]);
			System.out.print(" ");
		}
		

	}

}
