package Chess;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public boolean checkPos(int pos) {
        if (0 <= pos && pos <= 7) {
            return true;
        } else return false;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)) {
            if (line != toLine && column != toColumn && (chessBoard.board[toLine][toColumn] == null ||
                    !chessBoard.board[toLine][toColumn].color.equals(this.color)) &&
                    chessBoard.board[line][column] != null) {
                if (!chessBoard.board[line][column].equals(this)) {
                    return false;
                }
            }

            int[][] positions = new int[][]{
                    {line - 1, column - 1}, {line + 1, column + 1},
                    {line + 1, column}, {line - 1, column},
                    {line, column + 1}, {line, column - 1},
                    {line + 1, column - 1}, {line - 1, column + 1}};

            for (int i = 0; i < positions.length; i++) {
                if (positions[i][0] == toLine && positions[i][1] == toColumn) {
                    return true;
                }
            }
        } else return false;
        return false;
    }


    @Override
    String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        if (checkPos(line) && checkPos(column)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (chessBoard.board[i][j] != null) {
                        if (!chessBoard.board[i][j].getColor().equals(color) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } else return false;

    }
}
