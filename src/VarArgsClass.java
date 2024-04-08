public class VarArgsClass {
    public void myMethod1(int...x){
        for(int i:x){
            System.out.println("x:" +i);
        }
    }

    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5,6};
        VarArgsClass varArgsClass = new VarArgsClass();
        varArgsClass.myMethod1(myArray);
    }
}
