package co.com.doveracing.deliverymovements.domain;

import java.util.Date;

public class DeliveryType {

    private Long deliveryTypeId;

    private String nameType;

    private String descType;

    private String stateType;

    private Date createAt;

    public DeliveryType() {
    }

    public DeliveryType(Long deliveryTypeId, String nameType, String descType, String stateType, Date createAt) {
        this.deliveryTypeId = deliveryTypeId;
        this.nameType = nameType;
        this.descType = descType;
        this.stateType = stateType;
        this.createAt = createAt;
    }

    public Long getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void setDeliveryTypeId(Long deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getDescType() {
        return descType;
    }

    public void setDescType(String descType) {
        this.descType = descType;
    }

    public String getStateType() {
        return stateType;
    }

    public void setStateType(String stateType) {
        this.stateType = stateType;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
