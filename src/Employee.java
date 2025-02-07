/**
 * Jacob Whitney
 * Software Development 1 prep
 * February 2, 2025
 * Employee.java
 * Creates and manages employee name,
 * age, salary, and location
 */
public class Employee {
    // Attributes
    private String name;
    private int age;
    private double salary;
    private String location;

    // Constructor
    public Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void raiseSalary(double raise){
        salary = salary + raise;
    }
}
