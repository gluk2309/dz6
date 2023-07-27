public class Main {
    public static void main(String[] args) {

        //int numberOfMonths = ;
        //double interestRate = 9.99;
        //int amountOfCredit = 1_000_000;

        CreditPaymentService service = new CreditPaymentService();
        int credit = service.calculate(12, 9.99, 1_000_000);
        System.out.println("Ежемесячный платёж на 12 месяцев - " + credit);


        int credit2 = service.calculate(24, 9.99, 1_000_000);
        System.out.println("Ежемесячный платёж на 24 месяцев - " + credit2);


        int credit3 = service.calculate(36, 9.99, 1_000_000);
        System.out.println("Ежемесячный платёж на 36 месяцев - " + credit3);
    }
}