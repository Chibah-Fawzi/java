package mortgage;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public double readValue(String prompt) {
        return scanner.nextDouble();
    }

    public static double readValue(String prompt, int min, int max) {

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

}
