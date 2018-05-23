package game;

public class MemoryGame {
    public int boardSize;
    public int pairAmounts;
    public int maxTries;
    MemoryPiece[][] board;

    public MemoryGame(int boardSize, int pairAmounts, int maxTries) {
        this.boardSize = boardSize;
        this.pairAmounts = pairAmounts;
        this.maxTries = maxTries;

        int totalShapes = boardSize * boardSize;
        int numEachShape = totalShapes / pairAmounts;
    }
    
}