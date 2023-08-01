package co.com.doveracing.deliverymovements.domain;

import java.util.Date;

public class Employee {

    private Long employeeId;

    private String documentType;

    private String documentNumber;

    private String firstName;

    private String middleName;

    private String lastName;

    private String employeeAbb;

    private String email;

    private String bloodType;

    private String phoneNumber;

    private String address;

    private String emergencyName;

    private String emergencyAddress;

    private String emergencyContact;

    private String eps;

    private Date createAt;

    public Employee(){

    }

    public Employee(Long employeeId, String documentType, String documentNumber, String firstName, String middleName, String lastName, String employeeAbb, String bloodType, String phoneNumber, String address, String emergencyName, String emergencyContact, String eps, Date createAt) {
        this.employeeId = employeeId;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.employeeAbb = employeeAbb;
        this.bloodType = bloodType;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.emergencyName = emergencyName;
        this.emergencyContact = emergencyContact;
        this.eps = eps;
        this.createAt = createAt;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmergencyAddress() {
        return emergencyAddress;
    }

    public void setEmergencyAddress(String emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
    }
}
