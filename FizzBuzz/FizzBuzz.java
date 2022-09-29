package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = scanner.nextInt();

        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Buzz");
        } else if (n % 5 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);

        }

    }
}
