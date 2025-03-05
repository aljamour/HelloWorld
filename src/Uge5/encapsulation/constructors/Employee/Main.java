package Uge5.encapsulation.constructors.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setEmployeeID("Alan2025");
        employee.setEmployeeName("Alan Al-Jamour");
        employee.setEmployeeSalary(998.565757565);

        System.out.println(employee.getFormattedSalary());
    }
}