package mortgage;

import java.text.NumberFormat;

public class MortgageCalculator {

    private int principal;
    private float air;
    private byte period;

    public MortgageCalculator(int principal, float air, byte period) {
        this.principal = principal;
        this.air = air;
        this.period = period;
    }

    public double calculateBalance(double numberOfPaymentsMade) {
        NumberFormat.getPercentInstance().format(air);
        float monthlyInterest = air / 12;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, getNumberOfPayments())
                        - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, getNumberOfPayments()) - 1);

        return balance;
    }

    public double calculateMortgage() {
        NumberFormat.getPercentInstance().format(air);

        float monthlyInterest = air / 12;

        double result = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, getNumberOfPayments())) /
                (Math.pow(1 + monthlyInterest, getNumberOfPayments()) - 1);
        return result;
    }

    public double[] remainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month < balances.length; month++)
            balances[month - 1] = calculateBalance(month);

        return balances;
    }

    public byte getPeriod() {
        return period;
    }

    public int getNumberOfPayments() {
        return period * 12;
    }

}
