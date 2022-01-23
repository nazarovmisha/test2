package Chess;

public abstract class Horse extends ChessPiece {


    public Horse(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public boolean canMoveToPosition(int line, int column, int toLine, int toColumn, ChessBoard board) {
        if(!board.checkPos(toLine) && !board.checkPos(toColumn)){
            return false;
        }
        if (){

        }

        }

    }

