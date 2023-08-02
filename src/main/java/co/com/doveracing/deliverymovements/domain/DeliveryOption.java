package co.com.doveracing.deliverymovements.domain;

import java.util.Date;


public class DeliveryOption {

    private Long idDeliveryOption;
    private String nameOption;
    private String descOption;
    private String typeOption;
    private String stateOption;
    private double initRange;
    private double finalRange;
    private double price;
    private Date createAt;

    public DeliveryOption(){
    }

    public Long getIdDeliveryOption() {
        return idDeliveryOption;
    }

    public void setIdDeliveryOption(Long idDeliveryOption) {
        this.idDeliveryOption = idDeliveryOption;
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

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
