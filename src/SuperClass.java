public class SuperClass {
    public void methodInSuperClass(){
        System.out.println("Method in superclass");
    }
}

class SubClass extends SuperClass{
    public void methodInSubClass(){
        System.out.println("Method in subclass");
    }
}

class Testclass{
    public static void main(String[] args){
       SubClass subClass = new SubClass();
       subClass.methodInSubClass();
       subClass.methodInSuperClass();
    }
}