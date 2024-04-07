package other;

import certification.Parent;

public class Child extends Parent {
    public void testIt() {
        System.out.println("x is: " + x);
        Parent p = new Parent();
        System.out.println("Subclasses cannot use the " +
                "Parent Class reference to access protected members\n" +
                "of the subclass. Protected members are only accessible through " +
                "inheritance");
    }
    public static void main(String[] args){
      new Child().testIt();
    }
}
