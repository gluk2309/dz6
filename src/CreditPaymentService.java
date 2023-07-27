public class CreditPaymentService {
    public int calculate(int numberOfMonths, double interestRate, int amountOfCredit) {

        double result = amountOfCredit * (interestRate / 12 / 100) * Math.pow(1 + (interestRate / 12 / 100), numberOfMonths) / (Math.pow(1 + (interestRate / 12 / 100), numberOfMonths) - 1);

        return (int) result;
    }

}