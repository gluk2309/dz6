public class CreditPaymentService {
    public int calculate(int numberOfMonths, double interestRate, int amountOfCredit) {

        double result = amountOfCredit * (interestRate / 12) * Math.pow(1 + (interestRate / 12), numberOfMonths) / (Math.pow(1 + (interestRate / 12), numberOfMonths) - 1);

        return (int) result;
    }

}
