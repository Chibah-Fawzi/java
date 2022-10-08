package wageapp;

// ENCAPSULATION

public class Main {
    public static void main(String[] args) {

        // Instance Member
        var employee = new Employee(5000, 20);

        // Static Member
        Employee.displayNumberOfEmployees();
        int wage = employee.calculateWage();

        System.out.println("wage : " + wage);
    }

}
