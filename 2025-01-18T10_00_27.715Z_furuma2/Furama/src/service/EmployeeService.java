package service;

import model.Employee;
import repository.IEmployeeRepository;
import repository.EmployeeRepository;
import utils.Utils;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository employeeRepo = new EmployeeRepository();
    private List<Employee> employees;

    public EmployeeService() {
        employees = employeeRepo.readFile(); // Đọc dữ liệu từ file CSV
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public void addEmployee() {
        System.out.println("Enter new Employee details:");
        Employee newEmployee = Utils.inputEmployee();

        // Kiểm tra xem ID đã tồn tại chưa
        if (findById((String) newEmployee.getId()) != null) {
            System.out.println("Error: Employee ID already exists!");
            return;
        }

        employees.add(newEmployee);
        employeeRepo.writeFile(employees);
        System.out.println("Employee added successfully!");
    }

    @Override
    public void editEmployee() {
        String id = Utils.inputString("Enter Employee ID to edit: ");
        Employee employee = findById(id);

        if (employee == null) {
            System.out.println("Error: Employee not found!");
            return;
        }

        System.out.println("Editing employee: " + employee);
        Employee updatedEmployee = Utils.inputEmployee();
        employees.set(employees.indexOf(employee), updatedEmployee);
        employeeRepo.writeFile(employees);
        System.out.println("Employee updated successfully!");
    }

    @Override
    public void deleteEmployee() {
        String id = Utils.inputString("Enter Employee ID to delete: ");
        Employee employee = findById(id);

        if (employee == null) {
            System.out.println("Error: Employee not found!");
            return;
        }

        employees.remove(employee);
        employeeRepo.writeFile(employees);
        System.out.println("Employee deleted successfully!");
    }

    @Override
    public Employee findById(String id) {
        return employees.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void displayEmployeeList() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            employees.forEach(System.out::println);
        }
    }

    @Override
public void searchEmployeeByName() {
    String name = Utils.inputString("Enter Employee Name to search: ").trim();

    // Kiểm tra nếu input rỗng
    if (name.isEmpty()) {
        System.out.println("Error: Name cannot be empty!");
        return;
    }

    // Kiểm tra danh sách employees có dữ liệu không
    if (employees == null || employees.isEmpty()) {
        System.out.println("No employees available to search.");
        return;
    }

    List<Employee> filteredEmployees = employees.stream()
            .filter(e -> e.getName().toLowerCase().contains(name.toLowerCase()))
            .collect(Collectors.toList()); // Sử dụng Collectors.toList() thay vì toList()

    if (filteredEmployees.isEmpty()) {
        System.out.println("No employees found with name: " + name);
    } else {
        System.out.println("--- Search Results ---");
        filteredEmployees.forEach(System.out::println);
    }
}
}
