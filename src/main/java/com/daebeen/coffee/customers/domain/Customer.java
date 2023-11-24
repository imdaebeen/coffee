package com.daebeen.coffee.customers.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMER")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerSeq;
    private String customerId;
    private Long customerPoint;
    private String nicName;

    public Customer(String customerId){
        this.customerId = customerId;
        customerPoint = 0L;
    }

    public Customer(String customerId, Long customerPoint){
        this.customerId = customerId;
        this.customerPoint = customerPoint;
    }

    public String customerPoint(Long usingPoint){
        if (customerPoint <  usingPoint){
            return "포인트 부족";
        }
        customerPoint -= usingPoint;
        return "충전완료";
    }

    public void chargePoint(Long chargingPoint) {
        customerPoint += chargingPoint;
    }
}