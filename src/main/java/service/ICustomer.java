package service;


import model.Customer;

import java.util.List;

public interface ICustomer {
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer model);

    void delete(int id);
}