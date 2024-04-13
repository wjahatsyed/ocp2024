public class Vehicle {
}

class Car extends Vehicle{

}

class Subaru extends Car{

}

 class MyTestincClass{
     public static void main(String [] args){
        Car car = new Car();
        Subaru subaru = new Subaru();
        if(car instanceof Vehicle){
            System.out.println("Car is a vehicle");
        }
     }

 }