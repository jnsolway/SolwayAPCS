import java.util.*;

 
class twoDArraysPractice {
    public static void main(String[] args) {
        // [2, 4, 8]
        // [3, 9, 27]
        // [5, 25, 125]
        int [][] mat = new int[3][3];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                mat[i][j] = ()
            }
        }
        printMatrix(mat);
    }
    public static void printMatrix(int[][] mat) {
        for(int[] row: mat) {
            for(int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}