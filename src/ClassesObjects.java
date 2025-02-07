public class ClassesObjects {
    public static void main(String[] args) {
        Employee john = new Employee("John", 25, 12.5, "Orlando, FL");
        System.out.println("Name: " + john.getName());
        System.out.println("Age: " + john.getAge());
        System.out.println("Salary: " + john.getSalary());
        System.out.println("Location: " + john.getLocation());

        john.raiseSalary(1.5);

        System.out.println("New Salary: " + john.getSalary());
    }
}