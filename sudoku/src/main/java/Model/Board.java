package Model;

public class Board {
    private static int GRID_SIZE;
    private static BoardStatus boardStatus;
    private int[][] board;

    public Board(int[][] board) {
        this.board = board;
        this.GRID_SIZE = 9;
        this.boardStatus = BoardStatus.NEW;
    }

    public static BoardStatus getBoardStatus() {
        return boardStatus;
    }

    public static void setBoardStatus(BoardStatus boardStatus) {
        Board.boardStatus = boardStatus;
    }
}
