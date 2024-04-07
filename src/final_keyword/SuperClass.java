package final_keyword;

public class SuperClass {
    public final void myFinalMethod(){
        System.out.println("Final methods cannot be overridden in subclasses.");
    }
}

class SubClass extends SuperClass{
    public static void main(String [] args){
    System.out.println("public void myFinalMethod(){\n" +
            ".."+
    "//This is now allowed)"+
    "});)");
    }
}