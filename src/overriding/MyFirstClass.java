package overriding;

public class MyFirstClass {
	public void myMethod() {
		System.out.println("Hello. I am working from the super class");
	}
}

class MySubClass extends MyFirstClass {
	@Override
	public void myMethod() {
		super.myMethod();
		System.out.println("Now I go from the subclass");
	}

	public static void main(String[] args) {
		MyFirstClass myFirstClass = new MySubClass();
		myFirstClass.myMethod();
	}
}
