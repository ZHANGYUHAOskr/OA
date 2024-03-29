package com.zyh.oa.entity;


import org.springframework.format.annotation.DateTimeFormat;

public class ClaimVoucher {

  private Integer id;
  private String cause;
  private String createSn;
  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
  private java.util.Date createTime;
  private String nextDealSn;
  private Double totalAmount;
  private String status;
  private Employee creater;
  private Employee dealer;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }


  public String getCreateSn() {
    return createSn;
  }

  public void setCreateSn(String createSn) {
    this.createSn = createSn;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }


  public String getNextDealSn() {
    return nextDealSn;
  }

  public void setNextDealSn(String nextDealSn) {
    this.nextDealSn = nextDealSn;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Employee getCreater() {
    return creater;
  }

  public void setCreater(Employee creater) {
    this.creater = creater;
  }

  public Employee getDealer() {
    return dealer;
  }

  public void setDealer(Employee dealer) {
    this.dealer = dealer;
  }
}
