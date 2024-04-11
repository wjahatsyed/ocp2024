public class CoffeeTest {
    public static void main(String[] args) {
        Coffee2 coffee2 = new Coffee2();
        coffee2.coffeeSize1 = Coffee2.CoffeeSize1.BIG;
    }
}

class Coffee2 {
    enum CoffeeSize1 {
        BIG, HUGE, OVERWHELMING
    }

    CoffeeSize1 coffeeSize1;
}
