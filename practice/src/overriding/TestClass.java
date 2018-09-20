package overriding;

public class TestClass {

	public static void main(String[] args) {
		ParentClass pObj = new ParentClass();
	//	pObj.varArgmethod(1);

		ChildClass cObj = new ChildClass();
//		cObj.varArgmethod(2);
//		cObj.varArgmethod('c');
		

		ParentClass p2Obj = new ChildClass();
//		p2Obj.varArgmethod(5);
		

		/*ChildClass c2Obj = (ChildClass) new ParentClass();
		System.out.println(c2Obj.method());*/
		
		pObj.staticMethod();
		cObj.staticMethod();
		
		p2Obj.staticMethod();
		
		ParentClass.staticMethod();
		

	}

}
