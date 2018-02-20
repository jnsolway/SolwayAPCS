import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;

    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }
        System.out.println("You selected mode " + mode);

        if(mode == 1) {
            flatInterest();
        }
        else {
            System.out.println("Other modes not yet supported."); //Replace this with calls to your appropriate functions            
        }
    }

    public static void flatInterest() {
        Scanner scan1;
        Scanner scan2;
        Scanner scan3;
        System.out.println("Still a stub function. Not yet implemented");
        // loanAmt = scan.hasNextDouble();
            while(true) {
                System.out.print("Enter a Loan Amount: ");
                scan1 = new Scanner(System.in);
                    if(scan1.hasNextDouble()) { //Check if input provided is a valid integer
                        loanAmt = scan1.nextDouble();
                        break;
                    }
            }
        // interestRate = scan.hasNextDouble();
            while(true) {
                System.out.print("Interest Rate: ");
                scan2 = new Scanner(System.in);
                    if(scan2.hasNextDouble()) { //Check if input provided is a valid integer
                        interestRate = scan2.nextDouble();
                        break;
                    }
            }
        
        // loanTerm = scan.hasNextInt();
            while(true) {
                System.out.print("Loan Term: ");
                scan3 = new Scanner(System.in);
                    if(scan3.hasNextInt()) { //Check if input provided is a valid integer
                        loanTerm = scan3.nextInt();
                        break;
                    }
            }
        double interest = loanAmt*interestRate/100*loanTerm;
        double loanCost = loanAmt+interest;

        System.out.println(" ");
        System.out.println("Loan Amount" + " " + loanAmt);
        System.out.println("Rate of Interest" + " " + interestRate);
        System.out.println("Months" + " " + loanTerm);
        System.out.println("Interest" + " " + interest);
        System.out.println("Total Cost of Loan" + " " + loanCost);
            
        }
    

//     public static Boolean isValidDouble(Scanner scan) {
//         try {
//             double d = scan.hasNextDouble();
//         }
//         catch(Exception e) {
//             return false; //An error was raised. The user input could not be read as a String.
//         }
//         return true; //No error was raised. The scanner read it successfully as a String.
//     }

//  public static Boolean isValidInt(Scanner scan) {
//         try {
//             int i = scan.hasNextInt();
//         }
//         catch(Exception e) {
//             return false; //An error was raised. The user input could not be read as a String.
//         }
//         return true; //No error was raised. The scanner read it successfully as a String.
//     }


    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }
}