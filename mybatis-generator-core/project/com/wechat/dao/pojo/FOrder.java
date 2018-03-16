package com.wechat.dao.pojo;

import java.util.Date;

public class FOrder {
    private Integer id;

    private String uuid;

    private Date dishedTime;

    private Integer deskId;

    private Integer cookState;

    private Float shouldPay;

    private Float amountPaid;

    private Integer customers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Date getDishedTime() {
        return dishedTime;
    }

    public void setDishedTime(Date dishedTime) {
        this.dishedTime = dishedTime;
    }

    public Integer getDeskId() {
        return deskId;
    }

    public void setDeskId(Integer deskId) {
        this.deskId = deskId;
    }

    public Integer getCookState() {
        return cookState;
    }

    public void setCookState(Integer cookState) {
        this.cookState = cookState;
    }

    public Float getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(Float shouldPay) {
        this.shouldPay = shouldPay;
    }

    public Float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Integer getCustomers() {
        return customers;
    }

    public void setCustomers(Integer customers) {
        this.customers = customers;
    }
}