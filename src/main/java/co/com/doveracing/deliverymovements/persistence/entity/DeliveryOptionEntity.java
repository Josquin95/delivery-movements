package co.com.doveracing.deliverymovements.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "delivery_option")
public class DeliveryOptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_delivery_option")
    private Long idMovement;

    @Column(name = "name_option", nullable = false)
    private String nameOption;

    @Column(name = "desc_option",  nullable = false)
    private String descOption;

    @Column(name = "type_option",  nullable = false)
    private String typeOption;

    @Column(name = "state_option", nullable = false)
    private String stateOption;

    @Column(name = "init_range",  nullable = false)
    private double initRange;

    @Column(name = "final_range",  nullable = false)
    private double finalRange;

    @Column(name = "price",  nullable = false)
    private double price;
    @Temporal(TemporalType.TIME)
    @Column(name = "create_at")
    private Date createAt;

    @OneToMany(mappedBy = "deliveryOptionEntity")
    private List<OrderEntity> orderList;

    public DeliveryOptionEntity() {
        // Constructor is empty
    }

    public Long getIdMovement() {
        return idMovement;
    }

    public void setIdMovement(Long idMovement) {
        this.idMovement = idMovement;
    }

    public String getNameOption() {
        return nameOption;
    }

    public void setNameOption(String nameOption) {
        this.nameOption = nameOption;
    }

    public String getDescOption() {
        return descOption;
    }

    public void setDescOption(String descOption) {
        this.descOption = descOption;
    }

    public String getTypeOption() {
        return typeOption;
    }

    public void setTypeOption(String typeOption) {
        this.typeOption = typeOption;
    }

    public String getStateOption() {
        return stateOption;
    }

    public void setStateOption(String stateOption) {
        this.stateOption = stateOption;
    }

    public double getInitRange() {
        return initRange;
    }

    public void setInitRange(double initRange) {
        this.initRange = initRange;
    }

    public double getFinalRange() {
        return finalRange;
    }

    public void setFinalRange(double finalRange) {
        this.finalRange = finalRange;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreateAt() {
        return createAt;
    }
}
