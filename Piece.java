public class Piece {
    
    Position pos;
    int id;

    public Piece (int x, int y, int id){
        this.pos = new Position(x, y);
        this.id = id;
    }

}
