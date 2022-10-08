package wageapp;

// ENCAPSULATION

public class Main {
    public static void main(String[] args) {

        var employee = new Employee(5000, 20);

        int wage = employee.calculateWage(10);

        System.out.println("wage : " + wage);
    }

}
