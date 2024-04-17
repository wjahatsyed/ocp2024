package overriding;

public class Animal {
	public void eat() {
		System.out.println("Generic animal eating generically");
	}
}

class Horse extends Animal{
	@Override
	public void eat() {
		System.out.println("Horse eating hay, oats"
				+ "and horse treats");
	}
}
