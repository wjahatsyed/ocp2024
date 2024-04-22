package overriding;

public class AnimalClass {
	public void eat() throws Exception{
		
	}
}

class DogClass extends AnimalClass{
	@Override
	public void eat() {
		
	}
	
	public static void main(String[] args) {
		AnimalClass animalClassReference = new DogClass();
		/*
		 * The line below won't compile as the reference here decides
		 * at compile time that the AnimalClass's version of the 
		 * method shall be called so it gives a compiler error.
		 * However, in fact, if the code compile, overriding method in
		 * the child class shall be called at runtime.
		 */
		//animalClassReference.eat();
		DogClass dogClassReference = new DogClass();
		dogClassReference.eat();
		
	}
}
