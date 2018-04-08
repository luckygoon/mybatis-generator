package com.wechat.dao.pojo;

import java.util.Date;

public class Order {
    private Integer id;

    private String uuid;

    private Date createTime;

    private Integer deskId;

    private Integer cookState;

    private Float shouldPay;

    private Float amountPaid;

    private Integer customers;

    private Integer storeId;

    private Integer finished;

    private Integer isUrgent;

    private Date createDay;

    private String note;

    private String uId;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public Integer getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(Integer isUrgent) {
        this.isUrgent = isUrgent;
    }

    public Date getCreateDay() {
        return createDay;
    }

    public void setCreateDay(Date createDay) {
        this.createDay = createDay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }
}