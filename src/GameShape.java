public class GameShape {
    public void displayShape(){
        System.out.println("Displaying shape");
    }
}

class PlayerPiece extends GameShape{
    public void movePiece(){
        System.out.println("Moving piece");
    }
}
class TilePiece extends GameShape{
    public void getAdjacent(){
        System.out.println("Getting adjacent");
    }
}

class TestClassNew extends GameShape{
    public static void main(String [] args){
        TilePiece tilePiece = new TilePiece();
        PlayerPiece playerPiece = new PlayerPiece();
        doShapes(tilePiece);
        doShapes(playerPiece);
    }
    public static void doShapes(GameShape gameShape){
        gameShape.displayShape();
    }
}
