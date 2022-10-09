package mortgage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my mortgage app calculator");

        int principal = (int) Console.readValue("Enter the Principal :", 1000, 1_000_000);
        float air = (float) Console.readValue("Enter the AIR in percentage: ", 0, 30);
        byte period = (byte) Console.readValue("Enter the Period in years : ", 0, 30);

        var calculator = new MortgageCalculator(principal, air, period);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();

    }
}
