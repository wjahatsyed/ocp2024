package local_variables;

public class LocalVariable {
    public static void main(String [] args){
        System.out.println("No modifier can be applied to a local variable\n" +
                "except for the final keyword/non-access modifier");
        final int x = 10;
        System.out.println("x: "+ x);
    }
}
