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
            System.out.print("Interest Rate(%): ");
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
        System.out.println("Original Loan Amount:" + " $" + loanAmt);
        System.out.println("Rate of Interest:" + " " + interestRate + "%");
        System.out.println("Loan Terms in Years:" + " " + loanTerm);
        System.out.println("Interest to be Paid:" + " $" + interest);
        System.out.println("Total Cost of Loan:" + " $" + loanCost);
            
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
                    break;
                }
        }
        // interestRate = scan.hasNextDouble();
        while(interestRate <= 0) {
            System.out.print("Interest Rate(%): ");
            scan2 = new Scanner(System.in);
                if(scan2.hasNextDouble()) { //Check if input provided is a valid integer
                    interestRate = scan2.nextDouble();
                    break;
                }
        }
        
        // loanTerm = scan.hasNextInt();
        while(loanTerm <= 0) {
            System.out.print("Loan Term(Years): ");
            scan3 = new Scanner(System.in);
                if(scan3.hasNextInt()) { //Check if input provided is a valid integer
                    loanTerm = scan3.nextInt();
                    break;
                }
        }
        
    double loanCost = loanAmt*Math.pow(1+((interestRate/100)/12),12*loanTerm);
    double interest = loanCost-loanAmt;

    System.out.println(" ");
    System.out.println("Original Loan Amount:" + " $" + loanAmt);
    System.out.println("Rate of Interest:" + " $" + interestRate + "%");
    System.out.println("Loan Term in Years:" + " $" + loanTerm);
    System.out.println("Interest to be Paid:" + " $" + interest);
    System.out.println("Total Cost of Loan:" + " $" + loanCost);
        
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
                    
                    break;
                }
        }
        // interestRate = scan.hasNextDouble();
        while(interestRate <= 0) {
            System.out.print("Interest Rate: ");
            scan2 = new Scanner(System.in);
                if(scan2.hasNextDouble()) { //Check if input provided is a valid integer
                    interestRate = scan2.nextDouble();
                    break;
                }
        }
        
        // loanTerm = scan.hasNextInt();
        while(loanTerm < 0) {
            System.out.print("Loan Term: ");
            scan3 = new Scanner(System.in);
                if(scan3.hasNextInt()) { //Check if input provided is a valid integer
                    loanTerm = scan3.nextInt();
                    break;
                }
        }
        
        interestRate = interestRate/100;
        double ratePerMonth = interestRate /12;
        double monthlyPayment = 1 + loanAmt * (ratePerMonth / (1 - Math.pow((1 + ratePerMonth), (loanTerm * - 12))));
        double outstandingBalance = loanAmt;
        
  while(outstandingBalance > 0) {
        interest = outstandingBalance * (interestRate / 12);
        interestPaid = interestPaid + interest;
        outstandingBalance = outstandingBalance + interest - monthlyPayment;
        
        if(outstandingBalance == 0){
            break;
        }
    }
        double finalPay = monthlyPayment + outstandingBalance;
        double loanCost = loanAmt + interestPaid;
    
    System.out.println(" ");
    System.out.println("Original Loan Amount:" + " $" + loanAmt);
    System.out.println("Rate of Interest:" + " " + interestRate*100 + "%");
    System.out.println("Loan Term in Years:" + " " + loanTerm);
    System.out.println("Minimum Monthly Payment:" + " $" + monthlyPayment);
    System.out.println("Final Monthly Payment:" + " $" + finalPay);
    System.out.println("Interest to be Paid:" + " $" + interestPaid);
    System.out.println("Total Cost of Loan:" + " $" + loanCost);


    }

    public static void printModeStatement() {
        System.out.print(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }
}