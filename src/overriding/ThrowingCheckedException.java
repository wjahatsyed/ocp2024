package overriding;

import java.io.FileNotFoundException;

public class ThrowingCheckedException {
	public void myMethod() throws FileNotFoundException{
		
	}
}

class SubClass extends ThrowingCheckedException{
	@Override
	public void myMethod() throws MyNewSubCheckedException{
		
	}
}

class MyNewSubCheckedException extends FileNotFoundException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}s
