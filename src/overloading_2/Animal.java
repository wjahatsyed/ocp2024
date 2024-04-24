package overloading_2;

public class Animal {

}

class Horse extends Animal{
	
}

class UseAnimals{
	public void doStuff(Animal a) {
		System.out.println("In the Animal version");
	}
	
	public void doStuff(Horse h) {
		System.out.println("In the horse version");
	}
	
	public static void main(String[] args) {
		UseAnimals useAnimals = new UseAnimals();
		Animal animalObject = new Animal();
		Horse horseObject = new Horse();
		useAnimals.doStuff(animalObject);
		useAnimals.doStuff(horseObject);
	}
}
