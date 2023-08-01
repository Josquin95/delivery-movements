package co.com.doveracing.deliverymovements.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Long idEmployee;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name", nullable = true)
    private String middleName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "document_type", nullable = false)
    private String documentType;

    @Column(name = "document_number", nullable = false)
    private String documentNumber;

    @Column(name = "employee_abb", nullable = true)
    private String employeeAbb;

    @Column(name = "blood_type", nullable = true)
    private String bloodType;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "emergency_name", nullable = false)
    private String emergencyName;

    @Column(name = "emergency_contact", nullable = false)
    private String emergencyContact;

    @Column(name = "emergency_address", nullable = true)
    private String emergencyAddress;

    @Column(name = "eps", nullable = true)
    private String eps;

    @Column(name = "email", nullable = true)
    private String email;

    @OneToMany(mappedBy = "employeeEntity")
    private List<OrderEntity> movementEntityList;

    @Temporal(TemporalType.TIME)
    @Column(name = "create_at")
    private Date createAt;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Long idEmployee, String firstName, String middleName, String lastName, String documentType, String documentNumber, String employeeAbb, String bloodType, String phoneNumber, String address, String emergencyName, String emergencyContact, String emergencyAddress, String eps, List<OrderEntity> movementEntityList) {
        this.idEmployee = idEmployee;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.employeeAbb = employeeAbb;
        this.bloodType = bloodType;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.emergencyName = emergencyName;
        this.emergencyContact = emergencyContact;
        this.emergencyAddress = emergencyAddress;
        this.eps = eps;
        this.movementEntityList = movementEntityList;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getEmployeeAbb() {
        return employeeAbb;
    }

    public void setEmployeeAbb(String employeeAbb) {
        this.employeeAbb = employeeAbb;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
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

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyAddress() {
        return emergencyAddress;
    }

    public void setEmergencyAddress(String emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public List<OrderEntity> getMovementEntityList() {
        return movementEntityList;
    }

    public void setMovementEntityList(List<OrderEntity> movementEntityList) {
        this.movementEntityList = movementEntityList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
