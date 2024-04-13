public class MyNewAnimal {
}

class MyHorse extends MyNewAnimal{
    private MyHalter myHalter = new MyHalter();
    private LeadRope rope;
    public static void main(String[] args){
        MyHorse myHorse = new MyHorse();
        myHorse.tie(myHorse.rope);
    }
    public void tie(LeadRope rope){
        myHalter.tie(rope);
    }

}

class MyHalter{
    public void tie(LeadRope rope){
        //Do the actual work here.
    }
}

class LeadRope{

}
