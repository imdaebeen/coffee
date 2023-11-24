package com.daebeen.coffee.point.domain;

import com.daebeen.coffee.customers.domain.Customer;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Entity
@Table(name = "POINT")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pointId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "customer_seq")
    private Customer customer;

    private Long pointAmt;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    private LocalDateTime transcatedAt;

    private Point(Customer customer, Long point){
        this.customer = customer;
        this.pointAmt = point;
        transcatedAt = LocalDateTime.now();
    }

    public static Point createByPayment(Customer customer, Long point){
        Point paymentPoint = new Point(customer, point);
        paymentPoint.transactionType = TransactionType.PAYMENT;
        return paymentPoint;
    }

    public static Point createByCharge(Customer customer, Long point){
        Point chargePoint = new Point(customer, point);
        chargePoint.transactionType = TransactionType.CHARGE;
        return chargePoint;
    }
}