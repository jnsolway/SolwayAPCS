import java.util.Scanner;

class ValidationUtils {
    public static void main(String args[]) {
        System.out.print("Enter a double: ");
        Scanner scan = new Scanner(System.in);
        if(isValidDouble(scan)) {
            System.out.println("Double Success!");
        }
        else {
            System.out.println("Double Failure!");
        }
    }

    
    public static Boolean isValidDouble(Scanner scan) {
        try {
            double i = scan.nextDouble();
        }
        catch(Exception e) {
            return false; //An error was raised. The user input could not be read as a String.
        }
        return true; //No error was raised. The scanner read it successfully as a String.
    }
}