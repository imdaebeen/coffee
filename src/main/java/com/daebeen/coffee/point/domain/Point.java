package main.java.com.daebeen.coffee.point.domain;

import main.java.com.daebeen.coffee.customers.domain.Customer;

import java.time.LocalDateTime;

@Entity
@Table(name = "POINT")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
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
        this.point = point;
        transcatedAt = LocalDateTime.now();
    }

    public static Point createByPayment(Customer customer, Long point){
        Point point = new Point(customer, point);
        point.transactionType = TransactionType.PAYMENT;
        return point;
    }

    public static Point createByCharge(Customer customer, Long point){
        Point point = new Point(customer, point);
        point.transactionType = TransactionType.CHARGE;
        return point;
    }
}