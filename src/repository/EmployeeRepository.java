package repository;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements Repository<Employee> {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void saveAll(List<Employee> items) {
        this.employees = items;
    }

    @Override
    public Employee findById(String id) {
        return employees.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Employee item) {
        employees.add(item);
    }

    @Override
    public void update(String id, Employee updated) {
        Employee existing = findById(id);
        if (existing != null) {
            int index = employees.indexOf(existing);
            employees.set(index, updated);
        }
    }
}
