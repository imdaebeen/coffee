package main.java.com.daebeen.coffee.customers.domain;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByUserId(String customerId);

}