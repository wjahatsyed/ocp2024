public class Animal {
}

class Horse extends Animal{
    private final Halter halter = new Halter();

    public static void main(String[] args){
        Horse horse = new Horse();
        horse.halter.tieRope();
    }
}

class Halter{
    public void tieRope(){
        System.out.println("Tying the rope");
    }
}
