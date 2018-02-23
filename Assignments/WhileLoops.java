class WhileLoops {
    public static void main(String[] args) {
        //  int n = 0;
        // while(n < 100) {
        //     System.out.println(n);
        //     n += 5;
        // }

//Prints nothing
        // int n = 19; 
        // while(n % 2 == 0) {
        //     System.out.println(n);
        //     n--;        
        // }

//prints powers of 2 from 1 to 64
    // int n = 1;
    // while(n < 100) {
    //     System.out.println(n);
    //     n += n;        
    // }

//prints 0 to 20
    Boolean shouldLoop = true;
        int n = 0;
        while(shouldLoop) {
            if(n == 20) {
                shouldLoop = false;
            }
            System.out.println(n);
            n++;
        }
    }
}