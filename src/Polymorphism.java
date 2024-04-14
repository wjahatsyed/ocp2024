public class Polymorphism {
    public static void main(String[] args){
        Polymorphism polymorphism = new Polymorphism();
        if(polymorphism instanceof Polymorphism){
            System.out.println("Passing first IS A test for Polymorphism");
        }
        if(polymorphism instanceof Object){
            System.out.println("Passing second IS A test for Polymorphism");
        }
    }
}
