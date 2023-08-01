package co.com.doveracing.deliverymovements.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Long idMovement;

    @Column(name = "order_date")
    private Date dateOrder;

    @ManyToOne
    @JoinColumn(name = "id_customer", insertable = false, updatable = false)
    private CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "id_employee", insertable = false, updatable = false)
    private EmployeeEntity employeeEntity;

    @ManyToOne
    @JoinColumn(name = "id_delivery_option", insertable = false, updatable = false)
    private DeliveryOptionEntity deliveryOptionEntity;

    @ManyToOne
    @JoinColumn(name = "id_location", insertable = false, updatable = false)
    private LocationEntity locationEntity;

    private double amount;

    private double price;

    @Column(name = "restaurant_discount")
    private double restaurantDiscounts;

    @Column(name = "employee_discounts")
    private double employeeDiscounts;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "obs_order")
    private String obsOrder;

    public OrderEntity() {
        // Constructor is empty
    }
}
