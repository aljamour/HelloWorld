package Uge5.encapsulation.constructors.Employee;

public class Employee {
    private String employeeID;

    private String employeeName;

    private double employeeSalary;

    public String getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    public String getFormattedSalary() {
        return String.format("%.2f", employeeSalary);
    }
}
