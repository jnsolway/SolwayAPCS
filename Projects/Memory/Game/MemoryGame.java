package game;

public class MemoryGame {
    public int boardSize;
    public int pairAmounts;
    public int maxTries;

    public MemoryGame(int boardSize, int pairAmounts, int maxTries) {
        this.boardSize = boardSize;
        this.pairAmounts = pairAmounts;
        this.maxTries = maxTries;
    }
    public GameBoard(){
        int[][] board = new int[boardSize][boardSize];
    }
}