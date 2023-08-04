package co.com.doveracing.deliverymovements.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_costumer", nullable = false)
    private Long idCustomer;

    @Column(name = "document_type", nullable = true)
    private String documentType;

    @Column(name = "document_number", nullable = true)
    private String documentNumber;

    @Column(name = "fullName", nullable = false)
    private String fullName;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "obs_address", nullable = false)
    private String obsAddress;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "latitude", nullable = true)
    private double latitude;

    @Column(name = "longitude", nullable = true)
    private double longitude;

    @Column(name = "payment_method", nullable = true)
    private String paymentMethod;

    @Temporal(TemporalType.TIME)
    @Column(name = "create_at")
    private Date createAt;

    @OneToMany(mappedBy = "customerEntity")
    private List<OrderEntity> orderList;

    public CustomerEntity() {
        // Constructor is empty
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getObsAddress() {
        return obsAddress;
    }

    public void setObsAddress(String obsAddress) {
        this.obsAddress = obsAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<OrderEntity> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderEntity> orderList) {
        this.orderList = orderList;
    }

    @PrePersist
    public void prePersist() {
        this.createAt = new Date();
    }
}
