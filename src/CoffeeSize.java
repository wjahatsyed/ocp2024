public enum CoffeeSize {
    BIG, HUGE, OVERWHELMING
}

class Coffee{
    public static void main(String [] args){
        System.out.println("All enums are constants");
        CoffeeSize coffeeSize = CoffeeSize.HUGE;
        System.out.println("enums cannot be declared within a method");
    }
}