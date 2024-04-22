package overriding;

public interface MyNewInterface {
	public default void myNewMethod() {
		System.out.println("Responding from the interface");
	}
}

class MyNewClass implements MyNewInterface{
	public void myNewMethod() {
		MyNewInterface.super.myNewMethod();
		System.out.println("Inside the similar name method");
	}
}
