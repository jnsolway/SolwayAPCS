import java.util.Scanner;

class PlinkoExtra {
    public static final int STANDARD = 1;
    public static final int NO_WALLS = 2;
    public static final int QUANTUM = 3;
    public static final int TERMINATE = 4;

    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int BACK = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int board = -1;
    public static int mode = -1;
    public static int slot = -1;
    public static int count = -1;
    public static int position = -1;
    public static int finalPosition = -1;

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK_BRIGHT = "\033[0;90m";
    public static final String RED_BRIGHT = "\033[0;91m";
    public static final String GREEN_BRIGHT = "\033[0;92m";  
    public static final String YELLOW_BRIGHT = "\033[0;93m"; 
    public static final String BLUE_BRIGHT = "\033[0;94m";   
    public static final String PURPLE_BRIGHT = "\033[0;95m"; 
    public static final String CYAN_BRIGHT = "\033[0;96m";   
    public static final String WHITE_BRIGHT = "\033[0;97m";

    public static void main(String[] args) {
        Scanner scan5;
        while(true) {
            scan5 = new Scanner(System.in);
            printBoardStatement();
            if(scan5.hasNextInt()) {
                board = scan5.nextInt();
                if(board == STANDARD) {
                    System.out.println(PURPLE + "\nSelected board: Standard"+ RESET);
                    Scanner scan1;        
                    while(true) {
                        //Loop to select mode.
                        //This loop is infinite until the user selects the "Quit" option (3)
                        scan1 = new Scanner(System.in);
                        printModeStatement();
                        if(scan1.hasNextInt()) {
                            mode = scan1.nextInt();
                            if(mode == SINGLE_DISC) {  
                                collectSlotInput();   
                                position = slot * 2;
                                System.out.println("\n"); 
                                printEvenRow(position);   
                                for(int i = 1; i < 13; i++) {
                                    if(position == 0) {
                                        position++;
                                    }
                                    else if(position == 16) {
                                        position--;
                                    }
                                    else if(Math.random() > .5) {
                                            position++; //Shift Right
                                        } else {
                                            position--; //Shift Left
                                        }
                                    if(isEven(i)) {
                                        printEvenRow(position);
                                    } else {
                                        printOddRow(position);
                                    }
                                }
                                finalPosition = position / 2;
                                System.out.println(
                                    "\nYour disk landed in position " + PURPLE
                                    + finalPosition + RESET + " and you won " + GREEN 
                                    + VALUES[finalPosition] + RESET + " points.\n");
                            }   
                            else if(mode == MULTI_DISC) {                  
                                collectSlotInput();
                                collectDiscCount();
                                int[] results = new int[9];
                                for(int n = 0; n < count; n++) {
                                    position = slot * 2;
                                    for(int i = 1; i < 13; i++) {
                                        if(position == 0) {
                                            position++;
                                        }
                                        else if(position == 16) {
                                            position--;
                                        }
                                        else if(Math.random() > .5) {
                                                position++; //Shift Right
                                            } else {
                                                position--; //Shift Left
                                            }                            
                                    }
                                    results[position/2]++;                                     
                                }         
                                int total = 0;
                                for(int t = 0; t < 9; t++) {
                                    total += results[t] * VALUES[t];
                                }
                                System.out.print("\n");
                                for(int p = 0; p < 9; p++) {
                                    System.out.println(
                                        "Discs in position " + YELLOW + p + RESET + ": " 
                                        + CYAN + results[p] + RESET);
                                }
                                System.out.println(
                                    "\nYou won " + GREEN + total + RESET + " points!\n"
                                    );  
                            }
                            else if(mode == BACK) {
                                break;
                            } else {
                                continue;
                            }
                        }
                    }
                }
                else if(board == NO_WALLS) {
                    System.out.println(YELLOW + "\nSelected board: No Walls"+ RESET);
                    Scanner scan1;        
                    while(true) {
                        scan1 = new Scanner(System.in);
                        printModeStatement();
                        if(scan1.hasNextInt()) {
                            mode = scan1.nextInt();
                            if(mode == SINGLE_DISC) {  
                                collectSlotInput();   
                                position = slot * 2;
                                System.out.println("\n"); 
                                printEvenRow(position);   
                                for(int i = 1; i < 13; i++) {
                                    if(position < 0) {
                                    }
                                    else if(position > 16) {
                                    }
                                    else if(Math.random() > .5) {
                                            position++; //Shift Right
                                        } else {
                                            position--; //Shift Left
                                        }
                                    if(isEven(i)) {
                                        printEvenRow(position);
                                    } else {
                                        printOddRow(position);
                                    }
                                }
                                if(position < 0 || position > 16) {
                                    System.out.println(
                                        "\nYour disc escaped the board and you won " + RED
                                        + "no" + RESET + " points.\n");
                                } else {
                                    finalPosition = position / 2;
                                    System.out.println(
                                        "\nYour disk landed in position " + PURPLE
                                        + finalPosition + RESET + " and you won " + GREEN 
                                        + VALUES[finalPosition] + RESET + " points.\n");
                                    }
                                }   
                            else if(mode == MULTI_DISC) {                  
                                collectSlotInput();
                                collectDiscCount();
                                int[] results = new int[9];
                                for(int n = 0; n < count; n++) {
                                    position = slot * 2;
                                    for(int i = 1; i < 13; i++) {
                                        if(position < 0) {
                                        }
                                        else if(position > 16) {
                                        }
                                        else if(Math.random() > .5) {
                                                position++;
                                            } else {
                                                position--;
                                            }                            
                                    }
                                    if(position > -1 && position < 17) {
                                        results[position/2]++;  
                                    }                                   
                                }         
                                int total = 0;
                                for(int t = 0; t < 9; t++) {
                                    total += results[t] * VALUES[t];
                                }
                                System.out.print("\n");
                                for(int p = 0; p < 9; p++) {
                                    System.out.println(
                                        "Discs in position " + YELLOW + p + RESET + ": " 
                                        + CYAN + results[p] + RESET);
                                }
                                System.out.println(
                                    "\nYou won " + GREEN + total + RESET + " points!\n"
                                    );  
                            }
                            else if(mode == BACK) {
                                break;
                            } else {
                                continue;
                            }
                        }
                    }
                }
                else if(board == QUANTUM) {
                    System.out.println(BLUE + "\nSelected board: Quantum"+ RESET);
                    Scanner scan1;        
                    while(true) {
                        scan1 = new Scanner(System.in);
                        printModeStatement();
                        if(scan1.hasNextInt()) {
                            mode = scan1.nextInt();
                            if(mode == SINGLE_DISC) {  
                                collectSlotInput();   
                                position = slot * 2;
                                System.out.println("\n"); 
                                printEvenRow(position);   
                                for(int i = 1; i < 13; i++) {
                                    if(Math.random() > .5) {
                                        position++; //Shift Right
                                    } else {
                                        position--; //Shift Left
                                    }
                                    if(position == -1) {
                                        position = 15;
                                    }
                                    if(position == 17) {
                                        position = 1;
                                    }
                                    if(isEven(i)) {
                                        printEvenRow(position);
                                    } else {
                                        printOddRow(position);
                                    }
                                }
                                finalPosition = position / 2;
                                System.out.println(
                                    "\nYour disk landed in position " + PURPLE
                                    + finalPosition + RESET + " and you won " + GREEN 
                                    + VALUES[finalPosition] + RESET + " points.\n");
                            }   
                            else if(mode == MULTI_DISC) {                  
                                collectSlotInput();
                                collectDiscCount();
                                int[] results = new int[9];
                                for(int n = 0; n < count; n++) {
                                    position = slot * 2;
                                    for(int i = 1; i < 13; i++) {
                                        if(Math.random() > .5) {
                                            position++; //Shift Right
                                        } else {
                                            position--; //Shift Left
                                        }
                                        if(position == -1) {
                                            position = 15;
                                        }
                                        if(position == 17) {
                                            position = 1;
                                        }                           
                                    }
                                    results[position/2]++;                                     
                                }         
                                int total = 0;
                                for(int t = 0; t < 9; t++) {
                                    total += results[t] * VALUES[t];
                                }
                                System.out.print("\n");
                                for(int p = 0; p < 9; p++) {
                                    System.out.println(
                                        "Discs in position " + YELLOW + p + RESET + ": " 
                                        + CYAN + results[p] + RESET);
                                }
                                System.out.println(
                                    "\nYou won " + GREEN + total + RESET + " points!\n"
                                    );  
                            }
                            else if(mode == BACK) {
                                break;
                            } else {
                                continue;
                            }
                        }
                    }                    
                }
                else if(board == TERMINATE) {
                        System.out.println(RED + "\nGoodbye" + RESET);
                        break;
                    } else {
                        continue;
                    }                    
                }
            }
        }

    

    public static void collectSlotInput() {
        Scanner scan2;
        while(true) {
            scan2 = new Scanner(System.in);
            System.out.print(
                BLUE_BRIGHT + "\nPick a slot to drop the disc(s) (0-8): " 
                + RESET);
            if(scan2.hasNextInt()) { 
                slot = scan2.nextInt();
                if(-1 < slot && slot < 9) {                   
                    break; 
                }
            }
        }
    }

    public static void collectDiscCount() {
        Scanner scan4;
        while(true) {
            scan4 = new Scanner(System.in);
            System.out.print(
                BLUE_BRIGHT + "Enter number of discs to drop: " + RESET);
            if(scan4.hasNextInt()) { 
                count = scan4.nextInt();
                if(count > 0) { 
                    break; 
                }
            }
        }
    }

    public static void printOddRow(int position) {      
        //Print the visualization of the row if it's single disc mode.
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print(BLUE + "O" + RESET);
            }
            else if(isEven(i)) {
                System.out.print(YELLOW + "." + RESET);
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");        
    }

    public static void printEvenRow(int position) {               
        //Print the visualization of the row if it's single disc mode.
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print(BLUE + "O" + RESET);
            }
            else if(isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(YELLOW + "." + RESET);
            }
        }
        System.out.print("\n");
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }
                        
    public static void printModeStatement() {
        System.out.print(
            CYAN + "Select a mode:\n" + RESET
            + "\t(1) " + PURPLE_BRIGHT + "Single disc\n" + RESET
            + "\t(2) " + YELLOW_BRIGHT + "Multiple discs\n" + RESET
            + "\t(3) " + RED_BRIGHT + "Back\n" + RESET
        );
    }

    public static void printBoardStatement() {
        System.out.print(
            CYAN + "\nSelect a board:\n" + RESET
            + "\t(1) " + PURPLE + "Standard\n" + RESET
            + "\t(2) " + YELLOW + "No Walls\n" + RESET
            + "\t(3) " + BLUE + "Quantum\n" + RESET
            + "\t(4) " + RED + "Quit\n" + RESET
        );
    }    
}