package org.example;

public class Composite {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "John Doe", "Developer");
        Developer dev2 = new Developer(101, "Jane Smith", "Developer");

        Manager manager1 = new Manager(200, "James Brown", "Manager");

        CompanyDirectory engineeringDirectory = new CompanyDirectory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);
        engineeringDirectory.addEmployee(manager1);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(engineeringDirectory);

        companyDirectory.showEmployeeDetails();
    }
}