public interface MyInterface {
    default void myDefaultMethod(){
        System.out.println("My default method and I cannot be final.");
    }
    static void myStaticFinalMethod(){

    }
}
