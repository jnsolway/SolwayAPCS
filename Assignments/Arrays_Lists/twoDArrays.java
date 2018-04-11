import java.util.*;

 
class twoDArrays {
    public static void main(String[] args) {    
        int[][] twoDArray = new int[3][3];

        for(int i = 0; i < twoDArray.length; i++) {
            for(int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = i * (j + 1);    
                System.out.println(twoDArray[i][j]);
            }
        }

        //Example - Contents of a 3x3 array of zeros
        //[0,0,0]
        //[0,0,0]
        //[0,0,0]

        int[][] arr1 = new int[3][3];

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = (i * 2) * (j * 2);
            }
            //[0,0,0]
            //[0,4,8]
            //[0,8,16]
        }

        int[][] arr2 = new int[3][3];
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = arr1[i][j] * arr1[i][j];
            }
            //[0,0,0]
            //[0,16,64]
            //[0,64,256]
        }

        int[][] arr3 = new int[4][4];

        int num = 1;
        for(int i = 0; i < arr3.length; i++) {
            for(int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = num; 
                num *= 2
            }
            //[1,2,4,8]
            //[16,32,64,128]
            //[256,512,1024,2048]
            //[4096,8182,16384,32768]
        }
    
    }
}