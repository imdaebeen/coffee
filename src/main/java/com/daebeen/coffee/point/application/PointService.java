package main.java.com.daebeen.coffee.point.application;

import main.java.com.daebeen.coffee.customers.domain.Customer;
import main.java.com.daebeen.coffee.customers.domain.CustomerRepository;
import main.java.com.daebeen.coffee.point.domain.Point;
import main.java.com.daebeen.coffee.point.domain.PointRepository;

@Service
@RequiredArgsConstructor
public class PointService{
    private final PointRepository pointRepository;
    private final CustomerRepository customerRepository;

    @Transactional
    public void pointPayment(String customerId, Long usingPoint){
        Customer customer = customerRepository.findById(customerId).get();
        customer.customerPoint(usingPoint);
        pointRepository.save(Point.createByPayment(customer,usingPoint));
    }

    @Transactional
    public void charge(String customerId, Long chargingPoint){
        Customer customer = customerRepository.findById(customerId).get();
        customer.chargePoint(chargingPoint);
        pointRepository.save(Point.createByCharge(customer,chargingPoint));
    }
}