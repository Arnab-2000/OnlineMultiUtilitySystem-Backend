package com.example.myproject.entity;


import javax.persistence.*;

@Entity
@Table(name="recharge")
public class Recharge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rechargeId;
    @Column(name="RechargeType")
    private String rechargeType;
    @Column(name="Name")
    private String name;
    @Column(name="MobileNo")
    private String mobile;
    @Column(name="Email")
    private String email;
    @Column(name="RechargePrice")
    private int rechargePrice;
    @Column(name="RechargePlan")
    private String rechargePlan;

    public Recharge()
    {
        super();
    }
    public Recharge(String rechargeType, String name, String mobile, String email, int rechargePrice, String rechargePlan) {
        super();
        this.rechargeType = rechargeType;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.rechargePrice = rechargePrice;
        this.rechargePlan = rechargePlan;
    }

    public int getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(int rechargeId) {
        this.rechargeId = rechargeId;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRechargePrice() {
        return rechargePrice;
    }

    public void setRechargePrice(int rechargePrice) {
        this.rechargePrice = rechargePrice;
    }

    public String getRechargePlan() {
        return rechargePlan;
    }

    public void setRechargePlan(String rechargePlan) {
        this.rechargePlan = rechargePlan;
    }
}
