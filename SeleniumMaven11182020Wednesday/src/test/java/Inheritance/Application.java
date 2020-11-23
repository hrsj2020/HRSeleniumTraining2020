package Inheritance;

public class Application {
	public static void main(String[] args) {
		ParentClass objParent = new ParentClass();
		objParent.dinnerTime();
		
		ChildClass objChild = new ChildClass();
		objChild.dinnerTime();
		objChild.working();
		objChild.doCharity();
		OverloadingDemo obj = new OverloadingDemo();
		obj.sum(1, 2);
		obj.sum(1, 2, 3);
	}

} 
