package mortgageApp;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        System.out.println("Welcome to my mortgage app calculator");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Princpal : ");
        int principal = scanner.nextInt();

        System.out.print("Enter the AIR in percentage: ");
        float air = scanner.nextFloat();
        NumberFormat.getPercentInstance().format(air);

        System.out.print("Enter the Period in years : ");
        byte period = scanner.nextByte();

        float r = air / 12;
        int n = period / 12;

        double result = principal * ((r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1));

        NumberFormat formatCurrency = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("Your mortgage is : " + formatCurrency.format(result));

    }
}
