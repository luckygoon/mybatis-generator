package com.wechat.dao.pojo;

public class FOrderDishRelation {
    private Integer id;

    private Integer oId;

    private Integer dId;

    private Integer dishVariety;

    private Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getDishVariety() {
        return dishVariety;
    }

    public void setDishVariety(Integer dishVariety) {
        this.dishVariety = dishVariety;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}