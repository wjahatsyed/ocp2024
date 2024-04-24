package down_casting;

public class Animal {
	public void makeSound() {
		System.out.println("Making generic sound");
	}
}

class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Bark");
	}
	
	public void playDead() {
		System.out.println("Playing dead");
	}
}

class CastTest2{
	public static void main(String[] args) {
		Animal[] animal = {new Animal(), new Dog(), new Animal()};
		for(Animal a : animal) {
			if(a instanceof Dog) {
				Dog d = (Dog)a;
				d.playDead();
				//((Dog) a).playDead();
			}
		}
	}
}
