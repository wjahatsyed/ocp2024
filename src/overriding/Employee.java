package overriding;

public class Employee {
	public void getEmployeeBasicPay() {
		
	}
}

class Chauffeur extends Employee{
	@Override
	public void getEmployeeBasicPay() throws RuntimeException{
		System.out.println("Java 5 introduces the @Override annotation");
	}
}
W