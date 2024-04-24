package overloading_3;

public class Foo {
	void doStuff() {
		
	}
}

class Bar extends Foo{
	void doStuff(String s) {
		
	}
	
	public static void main(String[] args) {
		Foo fooReferenceToBar = new Bar();
		fooReferenceToBar.doStuff();
		//Below is not accessible as reference decides at compile time not the actual object
		//fooReferenceToBar.doStuff("Wajahat codes");
		Bar barReferenceToBar = (Bar) fooReferenceToBar;
		barReferenceToBar.doStuff();
		barReferenceToBar.doStuff("Wajahat);
	}
}