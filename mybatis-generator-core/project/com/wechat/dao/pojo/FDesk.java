package com.wechat.dao.pojo;

public class FDesk {
    private Integer id;

    private Integer deskNumber;

    private String info;

    private Integer seatNum;

    private Integer isUsed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(Integer deskNumber) {
        this.deskNumber = deskNumber;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }
}