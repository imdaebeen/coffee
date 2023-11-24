package com.daebeen.coffee.point.application;

import com.daebeen.coffee.customers.domain.Customer;
import com.daebeen.coffee.customers.domain.CustomerRepository;
import com.daebeen.coffee.point.domain.Point;
import com.daebeen.coffee.point.domain.PointRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PointService{
    private final PointRepository pointRepository;
    private final CustomerRepository customerRepository;

    @Transactional
    public void pointPayment(Long customerSeq, Long usingPoint){
        Customer customer = customerRepository.findById(customerSeq).get();
        customer.customerPoint(usingPoint);
        pointRepository.save(Point.createByPayment(customer,usingPoint));
    }

    @Transactional
    public void charge(Long customerId, Long chargingPoint){
        Customer customer = customerRepository.findById(customerId).get();
        customer.chargePoint(chargingPoint);
        pointRepository.save(Point.createByCharge(customer,chargingPoint));
    }
}