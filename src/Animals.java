public enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Animals(String s){
        sound = s;
    }

    class TestEnum{
        final Animals a= CAT;
        public static void main(String [] args){
            //System.out.println(a.DOG.sound +" " + a.CAT.sound);
        }

        Animals ab;
        public void myMethod(){
            System.out.println(DOG.sound +" " + CAT.sound);
        }
    }
}
