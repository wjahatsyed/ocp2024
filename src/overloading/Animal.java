package overloading;

public class Animal {
	public void eat() {

	}
}

class Horse extends Animal {
	public void eat(String s) {
		System.out.println("This is overloading");
	}

	public void eat(String s, int... arr) {
		System.out.println("Overloading in same class");
	}
}
