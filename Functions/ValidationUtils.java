import java.util.Scanner;

class ValidationUtils {
    public static void main(String args[]) {
        System.out.print("Enter a Int: ");
        Scanner scan = new Scanner(System.in);
        if(isValidInt(scan)) {
            System.out.println("Int Success!");
        }
        else {
            System.out.println("Int Failure!");
        }
    }

    
    public static Boolean isValidInt(Scanner scan) {
        try {
            int i = scan.nextInt();
        }
        catch(Exception e) {
            return false; //An error was raised. The user input could not be read as a String.
        }
        return true; //No error was raised. The scanner read it successfully as a String.
    }
}