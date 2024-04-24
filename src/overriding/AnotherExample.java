package overriding;

import java.io.FileNotFoundException;

public class AnotherExample {
	protected void myNewMethod() throws FileNotFoundException{
		
	}
}

class SubClassOfAnotherExample extends AnotherExample{
	@Override
	public void myNewMethod() {
		System.out.println("Either reduce the exception or throw a subtype of the checked exception.");
	}
}

