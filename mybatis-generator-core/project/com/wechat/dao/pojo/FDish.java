package com.wechat.dao.pojo;

public class FDish {
    private Integer id;

    private String dishName;

    private Float dishPrice;

    private Float dishDiscount;

    private Integer freq;

    private String dishImageUrl;

    private Integer evaluateId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName == null ? null : dishName.trim();
    }

    public Float getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(Float dishPrice) {
        this.dishPrice = dishPrice;
    }

    public Float getDishDiscount() {
        return dishDiscount;
    }

    public void setDishDiscount(Float dishDiscount) {
        this.dishDiscount = dishDiscount;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public String getDishImageUrl() {
        return dishImageUrl;
    }

    public void setDishImageUrl(String dishImageUrl) {
        this.dishImageUrl = dishImageUrl == null ? null : dishImageUrl.trim();
    }

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }
}