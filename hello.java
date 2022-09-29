import java.text.NumberFormat;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String result = NumberFormat.getPercentInstance().format(10);
        System.out.println("percentage : " + result);

        // a
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are: " + age);

    }
}