package mortgage;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageReport {

    private static MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        MortgageReport.calculator = calculator;

    }

    public static void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.remainingBalances())
            System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(balance));

    }

    public static void printMortgage() {
        double mortgage = calculator.calculateMortgage();

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("----------------");
        System.out.println("Monthly Payments: " + formattedMortgage);
    }

}
