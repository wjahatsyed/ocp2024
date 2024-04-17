package reference_variables;

public class ParentClass {
	protected void myParentClassMethod() {
		System.out.println("I am declared in the parent class");
	}
}

class ChildClass extends ParentClass{
	public void myChildClassMethod() {
		 
	}
	
	@Override
	public void myParentClassMethod() {
		System.out.println("I am the one who overrides here");
	}
}

class MyTestClass{
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.myParentClassMethod();
		childClass.myChildClassMethod();
		
		ParentClass parentClass = new ChildClass();
		parentClass.myParentClassMethod();
		//parentClass.myChildClassMethod();
	}
}