import utils.*;

class Example {
    public static void main(String[] args) {
        // sentenceExample();
        // matrixTest1();
        // matrixTest2();
        matrixTest3();
    }

    public static void sentenceExample() {
        String sentence = SentenceUtil.generateSentence();
        System.out.println(sentence);
    }

    public static void matrixTest1() {   
        MatrixUtil.printMatrix(MatrixUtil.generateRandomMatrix(3,3));
    }

    public static void matrixTest2() {
        MatrixUtil.printMatrix(MatrixUtil.generateRandomMatrix(4,4,1234));
    }

    public static void matrixTest3() {
         MatrixUtil.printMatrix(MatrixUtil.reverseMatrix(MatrixUtil.generateRandomMatrix(4,4,1234)));
    }
}