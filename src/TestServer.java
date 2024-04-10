public class TestServer {
    public int count =9;
    public void testIt(){
        int count = 10;
        System.out.println("count is: " +count);
    }
    public void login(){
        System.out.println("count is: " +count);
    }
    public static void main(String[] args){
        new TestServer().testIt();
        new TestServer().login();
    }
}
