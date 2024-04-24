package overriding;

public class CovariantReturnTypes {

}

class SubClass1 extends CovariantReturnTypes{
	
}

class ParentClass1{
	public CovariantReturnTypes myMethod() {
		return null;
		
	}
}

class ChildClass2 extends ParentClass1{
	@Override
	public SubClass1 myMethod() {
		return null;
		
	}
}
