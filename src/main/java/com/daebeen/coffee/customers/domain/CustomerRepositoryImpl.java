package main.java.com.daebeen.coffee.customers.domain;

import java.util.Optional;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Optional<Customer> findByUserId(String customerId) {
        return Optional.empty();
    }
}
