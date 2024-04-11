package enums_package;

public class Coffee {
    CoffeeSize coffeeSize;
    public static void main(String[] args){
        Coffee coffee = new Coffee();
        coffee.coffeeSize = CoffeeSize.HUGE;
        System.out.println(coffee.coffeeSize.getSize());
        for(CoffeeSize cs:CoffeeSize.values()){
            System.out.println(cs.getSize());
        }
    }
}

enum CoffeeSize{
    BIG(10), HUGE(12), OVERWHELMING(15);
     CoffeeSize(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    private int size;
}
