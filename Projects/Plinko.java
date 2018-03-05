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
    

    public static void main(String[] args) {
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) {
                    System.out.println("Mode not yet implemented");
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

    public static int runOddRow(int position) {
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.
        System.out.print("|");
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print("O");
            }
            else if(isEven(i)) {
                System.out.print(".");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print("|");
        System.out.print("\n");
        return position;
    }

    public static int runEvenRow(int position) {
        //Modify the position.
        //Print the visualization of the row if it's single disc mode.
        System.out.print("|");
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print("O");
            }
            else if(isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(".");
            }
        }
        System.out.print("|");
        System.out.print("\n");
        return position;
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
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