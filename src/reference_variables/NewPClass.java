package reference_variables;

public class NewPClass {

}
class NewCClass extends NewPClass implements MyInterface{
	public void myChildClassMethod() {
		
	}
}

interface MyInterface{
	
}

class NewTestClass{
	public static void main(String[] args) {
		//Access a child class object through parent class
		NewPClass newPClassReference = new NewCClass();
		
		//Access a child class object through its own reference
		NewCClass newCClassReference = new NewCClass();
		
		//Access a child class object through an implemented interface reference
		MyInterface myInterfaceReference = new NewCClass();
		//below is not accessible
		//myInterfaceReference.myChildClassMethod();
		System.out.println("The method myChildClassMethod is not declared"
				+ "in MyInterface");
	}
}
