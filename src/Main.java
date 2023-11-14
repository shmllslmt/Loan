public class Main {
    public static void main(String[] args) {
        Loan loan = new Loan(15, 1, 1000);
        System.out.println(loan);
        System.out.println("Monthly Payment: "+String.format("%.2f", loan.getMonthlyPayment()));
        System.out.println("Total Payment: "+String.format("%.2f", loan.getTotalPayment()));
    }
}