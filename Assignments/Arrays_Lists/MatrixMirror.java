import java.util.*;

 
class MatrixMirror {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int num = 1;
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = num;
                num++;
                // System.out.println(matrix[i][j]);
            }
        }
        reverseMatrix(matrix);
    }
    public static int[][] reverseMatrix(int[][] mat) {
        //[1,2,3]  [3,2,1]
        //[4,5,6]  [6,5,4]
        //[7,8,9]  [9,8,7]
        int[][] matrix1 = mat;
        int[][] reverseMatrix = new int[mat.length][mat[0].length];
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                reverseMatrix[i][j] = matrix1[i][matrix1[i].length - j - 1];
                System.out.println(reverseMatrix[i][j]); 
            }
        }
        return reverseMatrix;
    }


}