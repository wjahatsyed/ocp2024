public class Synchronized {
    public synchronized void mySynchronizedMethod(){
        System.out.println("A method marked synchronized\n" +
                "means it can be accessed by one thread at a time.\n" +
                "synchronized keyword is only used with the methods\n" +
                "and it can be used with all the four access levels.");
    }
    public static void main(String[] args){
        Synchronized sync = new Synchronized();
        sync.mySynchronizedMethod();
    }
}
