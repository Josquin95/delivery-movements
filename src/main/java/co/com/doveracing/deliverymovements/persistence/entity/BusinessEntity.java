package co.com.doveracing.deliverymovements.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "businesses")
public class BusinessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_business", nullable = false)
    private Long idBusiness;

    @Column(name = "legal_name", nullable = false)
    private String legalName;

    @Column(name = "commercial_name", nullable = false)
    private String commercialName;

    @Column(name = "representative_name", nullable = false)
    private String representativeName;

    @Column(name = "document_type", nullable = false)
    private String documentType;

    @Column(name = "document_number", nullable = true)
    private String documentNumber;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "rep_phone_number", nullable = true)
    private String repPhoneNumber;

    @OneToMany(mappedBy = "businessEntity")
    private List<LocationEntity> locationsList;

    @Temporal(TemporalType.TIME)
    @Column(name = "create_at")
    private Date createAt;

    public BusinessEntity() {
        // Constructor is empty
    }

    public Long getIdBusiness() {
        return idBusiness;
    }

    public void setIdBusiness(Long idBusiness) {
        this.idBusiness = idBusiness;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepPhoneNumber() {
        return repPhoneNumber;
    }

    public void setRepPhoneNumber(String repPhoneNumber) {
        this.repPhoneNumber = repPhoneNumber;
    }

    public List<LocationEntity> getLocationsList() {
        return locationsList;
    }

    public void setLocationsList(List<LocationEntity> locationsList) {
        this.locationsList = locationsList;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
