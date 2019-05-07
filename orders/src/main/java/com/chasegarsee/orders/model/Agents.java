package com.chasegarsee.orders.model;


import javax.persistence.*;

@Entity
@Table(name="agents")

public class Agents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //it will be primary key
    @Column(nullable = false)
    private long AGENTCODE;
    private String AGENTNAME;
    private String WORKINGAREA;
    private double COMMISSION;
    private String PHONE;
    private String COUNTRY;

    public Agents()
    {}

    public Agents(String AGENTNAME, String WORKINGAREA, double COMMISSION, String PHONE, String COUNTRY)
    {
        this.AGENTNAME = AGENTNAME;
        this.WORKINGAREA = WORKINGAREA;
        this.COMMISSION = COMMISSION;
        this.PHONE = PHONE;
        this.COUNTRY = COUNTRY;
    }

    public long getAGENTCODE() {
        return AGENTCODE;
    }

    public String getAGENTNAME() {
        return AGENTNAME;
    }

    public void setAGENTNAME(String AGENTNAME) {
        this.AGENTNAME = AGENTNAME;
    }

    public String getWORKINGAREA() {
        return WORKINGAREA;
    }

    public void setWORKINGAREA(String WORKINGAREA) {
        this.WORKINGAREA = WORKINGAREA;
    }

    public double getCOMMISSION() {
        return COMMISSION;
    }

    public void setCOMMISSION(double COMMISSION) {
        this.COMMISSION = COMMISSION;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }
}
