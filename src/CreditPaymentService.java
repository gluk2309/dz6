public class CreditPaymentService {
    public int calculate(int numberOfMonths, double interestRate, int amountOfCredit) {

        double result = amountOfCredit * interestRate * Math.pow(1 + interestRate, numberOfMonths) / (Math.pow(1 + interestRate, numberOfMonths) - 1);

        return (int) result;
    }

}
