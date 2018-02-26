import java.util.Scanner;

class Challenge {
    public static void main(String[] args) {
        Scanner scan;
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RED = "\033[0;91m";
        String ANSI_CYAN = "\u001B[36m";
        System.out.println(ANSI_CYAN + "=Enter a Valid Integer Within Three Tries="  + ANSI_RESET);
        for(int i = 0; i <= 2; i++) {
        scan = new Scanner(System.in);
            if(scan.hasNextInt()) { 
                System.out.println(ANSI_GREEN + "Success" + ANSI_RESET);
                break;
            } else if(i == 2) { 
                System.out.println(ANSI_RED + "Failure" + ANSI_RESET);
            }
        }
    }
}