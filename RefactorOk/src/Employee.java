/*
 *
 * This is the definition of the Employee object
 *
 * */

public class Employee {
    private int employeeId;
    private String pps;
    private String surname;
    private String firstName;
    private char gender;
    private String department;
    private double salary;
    private boolean fullTime;

    // Create Employee with no details
    Employee() {
        this.employeeId = 0;
        this.pps = "";
        this.surname = "";
        this.firstName = "";
        this.gender = '\0';
        this.department = "";
        this.salary = 0;
        this.fullTime = false;
    }//end Employee with no details

    // Create Employee with details
    public Employee(int employeeId, String pps, String surname, String firstName, char gender, String department, double salary,
                    boolean fullTime) {
        this.employeeId = employeeId;
        this.pps = pps;
        this.surname = surname;
        this.firstName = firstName;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.fullTime = fullTime;
    }// end Employee with details

    // Getter methods
    public int getEmployeeId() {
        return this.employeeId;
    }

    // Setter methods
    void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPps() {
        return pps;
    }

    void setPps(String pps) {
        this.pps = pps;
    }

    public String getSurname() {
        return this.surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getGender() {
        return this.gender;
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return this.department;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean getFullTime() {
        return this.fullTime;
    }

    void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    // Display Employee details
    public String toString() {
        String bool;
        if (fullTime)
            bool = "Yes";
        else
            bool = "No";

        return "Employee ID: " + this.employeeId + "\nPPS Number: " + this.pps + "\nSurname: " + this.surname
                + "\nFirst Name: " + this.firstName + "\nGender: " + this.gender + "\nDepartment: " + this.department + "\nSalary: " + this.salary
                + "\nFull Time: " + bool;
    }// end toString
}// end class Employee
