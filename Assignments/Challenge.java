import java.util.Scanner;

class Challenge {
    public static void main(String[] args) {
        Scanner scan;
        System.out.println("=Enter a Valid Integer Within Three Tries=");
        for(int i = 0; i <= 2; i++) {
        scan = new Scanner(System.in);
            if(scan.hasNextInt()) { 
                System.out.println("Success");
                break;
            } else if(i == 2) { 
                System.out.println("Failure");
            }
        }
    }
}