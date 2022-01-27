package Chess;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    public boolean checkPos(int pos) {
        if (0 <= pos && pos <= 7) {
            return true;
        } else return false;
    }

    @Override
    public String getColor() {
        return this.color;
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
                    {line - 1, column - 1}, {line - 2, column - 2},
                    {line - 3, column - 3}, {line - 4, column - 4},
                    {line - 5, column - 5}, {line - 6, column - 6},
                    {line - 7, column - 7}, {line + 1, column + 1},
                    {line + 2, column + 2}, {line + 3, column + 3},
                    {line + 4, column + 4}, {line + 5, column + 5},
                    {line + 6, column + 6}, {line + 7, column + 7},
                    {line - 1, column + 1}, {line - 2, column + 2},
                    {line - 3, column + 3}, {line - 4, column + 4},
                    {line - 5, column + 5}, {line - 6, column + 6},
                    {line - 7, column + 7}, {line + 1, column - 1},
                    {line + 2, column - 2}, {line + 3, column - 3},
                    {line + 4, column - 4}, {line + 5, column - 5},
                    {line + 6, column - 6}, {line + 7, column - 7}};
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
        return "B";
    }
}
