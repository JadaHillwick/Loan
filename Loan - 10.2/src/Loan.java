//Jada Hillwick
//October 12, 2020
//Chapter 10 Section 2 : Loan 

public class Loan {
    
    //Variables
    private double annualIntRate;
    private double loanAmount;
    private int numberYears;
    private java.util.Date loanDate; //Date The loan was created
    
    //No arg Constructor
    public Loan(){
        this(1.5, 1, 1000); //this(annualIntRate, numYears, loanAmount)
    }
    
    //Construct a loan with specified annual interest rate, number of years, and loan amount.
    public Loan(double annualIntRate, int numberYears, double loanAmount){
        
        // use ( this. ) To specify the variable outside of the parameter.
        this.annualIntRate = annualIntRate;
        this.numberYears = numberYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
        
    }
    
    //Return annualIntRate
    public double getAnnualIntRate(){
        return annualIntRate;
    }
    
    //Set a new annualIntRate
    public void setAnnualIntRate(double annualIntRate){
        this.annualIntRate = annualIntRate;
    }
    
    //Return numberYears
    public double getNumberYears(){
        return numberYears;
    }
    
    //Set a new numberYears
    public void setNumberYears(int numberYears){
        this.numberYears = numberYears;
    }
    
    //Return loanAmount
    public double getLoanAmount(){
        return loanAmount;
    }
    
    //Set a new loanAmount
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    
    //Return loanDate
    java.util.Date getLoanDate(){
        return loanDate;
    }
    
    //Find Monthly Payment
    public double getMonthlyPayment(){
        double monthlyIntRate = annualIntRate / 1200;
        double monthlyPayment = loanAmount * monthlyIntRate /(1 - (1 / Math.pow(1 + monthlyIntRate, numberYears * 12)));
        return monthlyPayment;
    }
    
    //Find Total Payment
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberYears + 12;
        return totalPayment;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
