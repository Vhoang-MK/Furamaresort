package service;

import model.Employee;
import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    void addEmployee();
    void editEmployee();
    void deleteEmployee();
    Employee findById(String id);
    void displayEmployeeList();
    void searchEmployeeByName(); // Tìm kiếm nhân viên theo tên
}
