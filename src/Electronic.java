public class Electronic implements Device {
    @Override
    public void doIt() {

    }
}
abstract class Phone1 extends Electronic{

}
abstract class Phone2 extends Electronic{
    public void doIt(int x){

    }
}
class Phone3 extends Electronic2 implements Device{
    public void doStuff(){

    }
}
class Electronic2 implements Device{

    @Override
    public void doIt() {

    }
}
interface Device{
    public void doIt();
}
