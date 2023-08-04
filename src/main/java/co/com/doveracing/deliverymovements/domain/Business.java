package co.com.doveracing.deliverymovements.domain;

import co.com.doveracing.deliverymovements.persistence.entity.LocationEntity;

import java.util.Date;
import java.util.List;

public class Business {

    private Long idBusiness;

    private String legalName;

    private String commercialName;

    private String representativeName;

    private String documentType;

    private String documentNumber;

    private String email;

    private String repPhoneNumber;

    private List<LocationEntity> locationsList;

    private Date createAt;


    public Business() {
        // Constructor empty
    }

    public Long getIdBusiness() {
        return idBusiness;
    }

    public void setIdBusiness(Long idBusiness) {
        this.idBusiness = idBusiness;
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

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }
}
