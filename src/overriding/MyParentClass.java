package overriding;

import java.sql.SQLException;

public class MyParentClass {
	public void myMethod() throws SQLException{
		
	}
	
	public void myMethod2() {
		
	}
}

class MyChildClass extends MyParentClass{
	@Override
	public void myMethod() throws MyNewCheckedException{
		
	}
	
	@Override
	public void myMethod2() throws RuntimeException{
		
	}
	
}

class MyNewCheckedException extends SQLException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
