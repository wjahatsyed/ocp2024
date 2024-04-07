package final_keyword;

public class MethodParameterExample {
    public void myMethod(int fileNumber, final int recNumber){
        System.out.println("Method parameters are the same as" +
                "local variables. The only modifier that can be applied" +
                "to a method parameter is the final keyword");
    }
}
