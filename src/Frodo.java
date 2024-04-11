public class Frodo extends Hobbit {
    public static void main(String[] args){
        int myGold = 7;
        //System.out.println(countGold(myGold, 6));
        Frodo frodo = new Frodo();
        System.out.println(frodo.countGold(myGold, 6));
    }
}

class Hobbit {
    int countGold(int x, int y) {
        return x + y;
    }
}
