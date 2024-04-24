package overloading;

public class Adder {
	public int addThem(int x, int y) {
		return x+y;
	}
	
	public String addThem(int x, int y, int z) {
		return "When overloading, if you change the return type"
				+ "then you must change the argument list otherwise"
				+ "it is considered as a duplicate method";
	}
	
	public double addThem(double x, double y) {
		return x+y;
	}
}

class TestAdder{
	public static void main(String[] args) {
		Adder adder = new Adder();
		double result1 = adder.addThem(22.5, 69.3);
		System.out.println(result1);
		int result2 = adder.addThem(20, 10);
		System.out.println(result2);
	}
}
