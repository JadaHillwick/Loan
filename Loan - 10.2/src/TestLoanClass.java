//Jada Hillwick
//October 12, 2020
//Chapter 10 Section 2 : Loan 

import java.util.Scanner;

public class TestLoanClass {
    //Main Method
    public static void main(String[] args){
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //User Input Interest Rate
        System.out.print("Enter yearly inerest rate...(Ex: 8.25): ");
        double annualIntRate = input.nextDouble();
        
        //User Input Number of Years
        System.out.print("Enter number of years...(Ex: 5): ");
        int numberYears = input.nextInt();
        
        
        //User Input Loan Amount
        System.out.print("Enter loan amount...(Ex: 120000.95): ");
        double loanAmount = input.nextDouble();
        
        //Loan Object
        Loan loan = new Loan(annualIntRate, numberYears, loanAmount);
        
        //Display
        System.out.printf("The loan was created on %s\nThe monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
        
        
    }//End of Main
    
}
