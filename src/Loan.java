import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getMonthlyPayment() {
        double i = annualInterestRate / 100 / 12;
        int n = numberOfYears * 12;

        double monthpay = ((loanAmount * i)*(Math.pow(1+i,n))) / (Math.pow(1+i, n) - 1);

        return monthpay;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * (numberOfYears*12);
    }

    @Override
    public String toString() {
        return "\nLoan Amount: "+loanAmount+
                "\nNumber Of Years: "+numberOfYears+
                "\nAnnual Interest Rate: "+annualInterestRate+
                "\nLoan Submitted On "+loanDate;
    }
}
