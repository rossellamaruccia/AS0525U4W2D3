package Entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
    String id = "";
    String status = "";
    LocalDate orderDate = LocalDate.now();
    LocalDate deliveryDate = LocalDate.now();
    List<Product> product;
    Customer customer;


    public Order(String id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> product, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.product = product;
        this.customer = customer;
    }
}
