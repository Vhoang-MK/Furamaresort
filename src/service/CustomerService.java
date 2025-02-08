package service;

import model.Customer;

public interface CustomerService extends Service<Customer> {
    void displayCustomerList();
    void addNewCustomer();
    void editCustomer();
}
