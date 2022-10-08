package mortgageV2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageV2 {

    public static void main(String[] args) {
        System.out.println("Welcome to my mortgage app calculator");

        int principal = (int) readInput("Enter the Principal :", 1000, 1_000_000);
        float air = (float) readInput("Enter the AIR in percentage: ", 0, 30);
        byte period = (byte) readInput("Enter the Period in years : ", 0, 30);

        NumberFormat formatCurrency = NumberFormat.getCurrencyInstance(Locale.US);

        double mortgage = calculateMortgage(principal, air, period);

        System.out.println("Your mortgage is : " + formatCurrency.format(mortgage));

    }

    public static double readInput(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);

        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + min + " & " + max);
        }
        return value;
    }

    public static double calculateMortgage(int principal, float air, byte period) {

        NumberFormat.getPercentInstance().format(air);
        float monthly_interests = air / 12;
        int payments_number = period / 12;
        int pm = period * 12;

        double result = principal *
                (monthly_interests * Math.pow(1 + monthly_interests, payments_number)) /
                (Math.pow(1 + monthly_interests, payments_number) - 1);

        paymentSchedule(principal, monthly_interests, payments_number, pm);

        return result;
    }

    public static double paymentSchedule(int principal, float monthly_interests, int payments_number, int pm) {

        double balance = (principal *
                ((Math.pow(1 + monthly_interests, payments_number) - Math.pow(1 + monthly_interests, pm)))) /
                (Math.pow(1 + monthly_interests, payments_number) - 1);

        return printMortgage(pm, balance);
    }

    private static double printMortgage(int pm, double balance) {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month < pm; month++) {
            System.out.println(month + " - " + NumberFormat.getCurrencyInstance(Locale.US).format(balance));
        }
        return balance;
    }
}
