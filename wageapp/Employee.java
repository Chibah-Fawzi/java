package wageapp;

// ENCAPSULATION
public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    // CONSTRUCTOR
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void displayNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    // METHOD OVERLOADING
    // --------------------------------------
    // if there's extra hours execute this
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    // else execute this
    public int calculateWage() {
        // return baseSalary;
        // OR
        return calculateWage(0);
    }
    // --------------------------------------

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary cannot be 0 or less");
        }
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Base salary cannot be 0 or less");
        }
        this.hourlyRate = hourlyRate;
    }

    // ABSTRACTION : reduce coupling : public => private

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

}
