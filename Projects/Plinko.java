import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int mode = -1;
    public static int position = -1;
    public static Scanner scan;
    public static Scanner scan1;
    public static int userInputPosition = -1;

    public static void main(String[] args) {
        
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) {
                    positionInput();
                    runEvenRow(position);
                    for(int i = 1; i < 13; i++){
                        if(position == 0){
                            position++;
                        } else if(position == 16){
                            position--;
                        }else if(Math.random() < .5){
                            position++;
                        }else{
                            position--;
                        }
                        if(isEven(i)){
                            //waitmil(500);
                            runEvenRow(position);
                        }else{
                            //waitmil(500);
                            runOddRow(position);
                        }
                    }
                    System.out.println("You got " + VALUES[position/2] + " points");
                }   

                else if(mode == MULTI_DISC) {
                    System.out.println("Mode not yet implemented");
                }
                else if(mode == TERMINATE) {
                    System.out.println(ANSI_RED + "Goodbye" + ANSI_RESET);
                    break;
                } else {
                    continue;
                }
            }
        }
    }
    public static void positionInput(){
        while(userInputPosition < 0 || userInputPosition > 8) {
            System.out.print("Enter a Postition(0-8): ");
            scan1 = new Scanner(System.in);
            if(scan1.hasNextInt()) { //Check if input provided is a valid integer
                userInputPosition = scan1.nextInt();
            }
        }
        position = usernputPosition*2;
        userInputPosition = -1;
    }
    public static int runOddRow(int position) {
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.
        System.out.print(ANSI_GREEN + "|" + ANSI_RESET);
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                waitmil(250);
                System.out.print(ANSI_RED + "O" + ANSI_RESET);
            }
            else if(isEven(i)) {
                System.out.print(".");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print(ANSI_GREEN + "|" + ANSI_RESET);
        System.out.print("\n");
        return position;
    }

    public static int runEvenRow(int position) {
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.
        System.out.print(ANSI_GREEN + "|" + ANSI_RESET);
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                waitmil(250);
                System.out.print(ANSI_RED + "O" + ANSI_RESET);
            }
            else if(isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(".");
            }
        }
        System.out.print(ANSI_GREEN + "|" + ANSI_RESET);
        System.out.print("\n");
        return position;
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void waitmil(int y) {
        try {
            //sleep 5 seconds
            Thread.sleep(y);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     
    }

    public static void printModeStatement() {
        System.out.print(
            ANSI_CYAN + "Select a mode:\n" + ANSI_RESET
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }
}