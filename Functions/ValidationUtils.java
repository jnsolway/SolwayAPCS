import java.util.Scanner;

class ValidationUtils {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a boolean: ");
        if(isValidBoolean(scan)) {
            System.out.println("Success!");
        }
        else {
            System.out.println("Failure!");
        }
    }

    
     public static Boolean isValidBoolean(Scanner scan) {
         String s = scan.nextLine();
        return s.equals("t")||
            s.equals("f")||
            s.equals("true")||
            s.equals("false")||
            s.equals("T")||
            s.equals("F")||
            s.equals("True")||
            s.equals("False");

    // public static Boolean isValidDouble(Scanner scan) {
        // try {
        //     double i = scan.nextDouble();
        // }
        // catch(Exception e) {
        //     return false; //An error was raised. The user input could not be read as a String.
        // }
        // return true; //No error was raised. The scanner read it successfully as a String.
    }
}