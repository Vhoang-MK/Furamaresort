package service;

import model.Employee;

public interface EmployeeService extends Service<Employee> {
    void displayEmployeeList();
    void addNewEmployee();
    void editEmployee();
}
