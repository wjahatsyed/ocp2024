public class MyNewCoffee {
    public static void main(String[] args){

    }
}

enum MyCoffeeSize{
    BIG(10), HUGE(12), OVERWHELMING(16){
        @Override
        public String getLidCode(){
            return "A";
        }
    };
    MyCoffeeSize(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    private int size;

    public String getLidCode(){
        return "B";
    }


}
