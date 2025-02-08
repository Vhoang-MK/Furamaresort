package repository;

import model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements Repository<Customer> {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public void saveAll(List<Customer> items) {
        this.customers = items;
    }

    @Override
    public Customer findById(String id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void add(Customer item) {
        customers.add(item);
    }

    @Override
    public void update(String id, Customer updated) {
        Customer existing = findById(id);
        if (existing != null) {
            int index = customers.indexOf(existing);
            customers.set(index, updated);
        }
    }
}
