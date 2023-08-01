package co.com.doveracing.deliverymovements.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "locations")
public class LocationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_location", nullable = false)
    private Long idLocation;

    @Column(name = "name_zone", nullable = false)
    private String nameZone;

    @Column(name = "cod_location", nullable = false)
    private String codLocation;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "obs_address", nullable = false)
    private String obsAddress;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "latitude", nullable = true)
    private double latitude;

    @Column(name = "longitude", nullable = true)
    private double longitude;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "email", nullable = true)
    private String email;

    @OneToMany(mappedBy = "locationEntity")
    private List<OrderEntity> orderList;

    @ManyToOne
    @JoinColumn(name = "id_business", insertable = false, updatable = false)
    private BusinessEntity businessEntity;

    @Temporal(TemporalType.TIME)
    @Column(name = "create_at")
    private Date createAt;

    public LocationEntity() {
        // Constructor is empty
    }

    public Long getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Long idLocation) {
        this.idLocation = idLocation;
    }

    public String getNameZone() {
        return nameZone;
    }

    public void setNameZone(String nameZone) {
        this.nameZone = nameZone;
    }

    public String getCodLocation() {
        return codLocation;
    }

    public void setCodLocation(String codLocation) {
        this.codLocation = codLocation;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrderEntity> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderEntity> orderList) {
        this.orderList = orderList;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
