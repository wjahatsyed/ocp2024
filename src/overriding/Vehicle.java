package overriding;

public class Vehicle {
	public void takeRev() {
		System.out.println("Rev from vehicle class");
	}
	
}

class Car extends Vehicle{
	@Override
	public void takeRev() {
		System.out.println("Rev from car class");
	}
}

class TestVehicle{
	public static void main(String[] args) {
		Vehicle vehicleReference = new Car();
		vehicleReference.takeRev();
	}
}
