package overloading;

import java.io.IOException;

public class Foo {
	public void doStuff(int x, int y) {
		
	}
}

class Bar extends Foo{
	private String doStuff(int x, String z) throws IOException {
		return "Wajahat";
	}
}
