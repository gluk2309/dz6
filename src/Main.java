public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int numberOfMonths = 12;
        double interestRate = 9.99;
        int amountOfCredit = 1_000_000;

        int credit = service.calculate(numberOfMonths,interestRate, amountOfCredit);

        System.out.println(credit);
    }
}