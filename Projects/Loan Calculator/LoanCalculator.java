import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

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
        System.out.println(ANSI_CYAN + "You selected mode " + ANSI_RESET + mode);

        if(mode == 1) {
            flatInterest();
            
        }
        else if(mode == 2) {
            compoundInterestWithOutPayments();
            
        }
        else {
            compoundInterestWithPayments(); //Replace this with calls to your appropriate functions 
               
        }
    }

    public static void flatInterest() {
        Scanner scan1;
        Scanner scan2;
        Scanner scan3;
        // loanAmt = scan.hasNextDouble();
        while(loanAmt <= 0) {
            System.out.print("Enter a Loan Amount: ");
            scan1 = new Scanner(System.in);
            if(scan1.hasNextDouble()) { //Check if input provided is a valid integer
                loanAmt = scan1.nextDouble();
            }
        }
        // interestRate = scan.hasNextDouble();
        while(interestRate <= 0) {
            System.out.print("Interest Rate(" + ANSI_RED + "%" + ANSI_RESET + "): " );
            scan2 = new Scanner(System.in);
            if(scan2.hasNextDouble()) { //Check if input provided is a valid integer
                interestRate = scan2.nextDouble();
            }
        }
        
        // loanTerm = scan.hasNextInt();
        while(loanTerm <= 0) {
            System.out.print("Loan Term(Years): ");
            scan3 = new Scanner(System.in);
            if(scan3.hasNextInt()) { //Check if input provided is a valid integer
                loanTerm = scan3.nextInt();
            }
        }
        double interest = loanAmt*interestRate/100*loanTerm;
        double loanCost = loanAmt+interest;

        System.out.println(" ");
        System.out.println("Original Loan Amount:" + ANSI_GREEN + " $" + ANSI_RESET + loanAmt);
        System.out.println("Rate of Interest:" + " " + interestRate + ANSI_RED + "%" + ANSI_RESET);
        System.out.println("Loan Terms in Years:" + " " + loanTerm);
        System.out.println("Interest to be Paid:" + ANSI_GREEN + " $" + ANSI_RESET + interest);
        System.out.println("Total Cost of Loan:" + ANSI_GREEN + " $" + ANSI_RESET + loanCost);
            
    }
    
    public static void compoundInterestWithOutPayments() {
        Scanner scan1;
        Scanner scan2;
        Scanner scan3;
        // loanAmt = scan.hasNextDouble();
        while(loanAmt <= 0) {
            System.out.print("Enter a Loan Amount: ");
            scan1 = new Scanner(System.in);
            if(scan1.hasNextDouble()) { //Check if input provided is a valid integer
                loanAmt = scan1.nextDouble();
            }
        }
        // interestRate = scan.hasNextDouble();
        while(interestRate <= 0) {
            System.out.print("Interest Rate(" + ANSI_RED + "%" + ANSI_RESET + "): " );
            scan2 = new Scanner(System.in);
            if(scan2.hasNextDouble()) { //Check if input provided is a valid integer
                interestRate = scan2.nextDouble();
            }
        }
        
        // loanTerm = scan.hasNextInt();
        while(loanTerm <= 0) {
            System.out.print("Loan Term(Years): ");
            scan3 = new Scanner(System.in);
            if(scan3.hasNextInt()) { //Check if input provided is a valid integer
                loanTerm = scan3.nextInt();
            }
        }
        
        double loanCost = loanAmt*Math.pow(1+((interestRate/100)/12),12*loanTerm);
        double interest = loanCost-loanAmt;

        System.out.println(" ");
        System.out.println("Original Loan Amount:" + ANSI_GREEN + " $" + ANSI_RESET + loanAmt);
        System.out.println("Rate of Interest: " + interestRate + ANSI_RED + "%" + ANSI_RESET);
        System.out.println("Loan Term in Years: " + loanTerm);
        System.out.println("Interest to be Paid:" + ANSI_GREEN + " $" + ANSI_RESET + interest);
        System.out.println("Total Cost of Loan:" + ANSI_GREEN + " $" + ANSI_RESET + loanCost);
        
    }
        
    public static void compoundInterestWithPayments() {
        Scanner scan1;
        Scanner scan2;
        Scanner scan3;
        double interest = -1;
        double interestPaid = -1;
        // loanAmt = scan.hasNextDouble();
        while(loanAmt <= 0) {
            System.out.print("Enter a Loan Amount: ");
            scan1 = new Scanner(System.in);
            if(scan1.hasNextDouble()) { //Check if input provided is a valid integer
                loanAmt = scan1.nextDouble();
            }
        }
        // interestRate = scan.hasNextDouble();
        while(interestRate <= 0) {
            System.out.print("Interest Rate(" + ANSI_RED + "%" + ANSI_RESET + "): " );
            scan2 = new Scanner(System.in);
            if(scan2.hasNextDouble()) { //Check if input provided is a valid integer
                interestRate = scan2.nextDouble();
                break;
            }
        }
        
        // loanTerm = scan.hasNextInt();
        while(loanTerm <= 0) {
            System.out.print("Loan Term: ");
            scan3 = new Scanner(System.in);
            if(scan3.hasNextInt()) { //Check if input provided is a valid integer
                loanTerm = scan3.nextInt();
            }
        }
        
        interestRate = interestRate/100;
        double ratePerMonth = interestRate /12;
        double monthlyPayment = 1 + loanAmt * (ratePerMonth / (1 - Math.pow((1 + ratePerMonth), (loanTerm * - 12))));
        double outstandingBalance = loanAmt;
        
        while(outstandingBalance >= 0) {
            interest = outstandingBalance * (interestRate / 12);
            interestPaid = interestPaid + interest;
            outstandingBalance = outstandingBalance + interest - monthlyPayment;
        }
    
        double finalPay = monthlyPayment + outstandingBalance;
        double loanCost = loanAmt + interestPaid;
    
        System.out.println(" ");
        System.out.println("Original Loan Amount:" + ANSI_GREEN + " $" + ANSI_RESET + loanAmt);
        System.out.println("Rate of Interest:" + " " + (interestRate*100) + ANSI_RED + "%" + ANSI_RESET);
        System.out.println("Loan Term in Years:" + " " + loanTerm);
        System.out.println("Minimum Monthly Payment:" + ANSI_GREEN + " $" + ANSI_RESET + monthlyPayment);
        System.out.println("Final Monthly Payment:" + ANSI_GREEN + " $" + ANSI_RESET + finalPay);
        System.out.println("Interest to be Paid:" + ANSI_GREEN + " $" + ANSI_RESET + interestPaid);
        System.out.println("Total Cost of Loan:" + ANSI_GREEN + " $" + ANSI_RESET + loanCost);

    }

    public static void printModeStatement() {
        System.out.print(
            ANSI_CYAN + "Select an interest calculation mode:\n" + ANSI_RESET
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }
}