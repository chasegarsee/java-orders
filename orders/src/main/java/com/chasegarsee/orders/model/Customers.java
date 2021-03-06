package com.chasegarsee.orders.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customers
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CUSTCODE;

    @Column(nullable = false)

    private String CUSTNAME;
    private String CUSTCITY;
    private String WORKINGAREA;
    private String CUSTCOUNTRY;
    private String GRADE;
    private double OPENINGAMT;
    private double RECEIVEAMT;
    private double PAYMENTAMT;
    private double OUTSTANDINGAMT;
    private String PHONE;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "AGENTCODE", nullable = false)
    private Agents agents;

    public Customers()
    {
    }

    public Customers(Long CUSTCODE, String CUSTNAME, String CUSTCITY, String WORKINGAREA, String CUSTCOUNTRY, String GRADE, double OPENINGAMT, double RECEIVEAMT, double PAYMENTAMT, double OUTSTANDINGAMT, String PHONE, Agents agents)
    {
        this.CUSTCODE = CUSTCODE;
        this.CUSTNAME = CUSTNAME;
        this.CUSTCITY = CUSTCITY;
        this.WORKINGAREA = WORKINGAREA;
        this.CUSTCOUNTRY = CUSTCOUNTRY;
        this.GRADE = GRADE;
        this.OPENINGAMT = OPENINGAMT;
        this.RECEIVEAMT = RECEIVEAMT;
        this.PAYMENTAMT = PAYMENTAMT;
        this.OUTSTANDINGAMT = OUTSTANDINGAMT;
        this.PHONE = PHONE;
        this.agents = agents;
    }

    public long getCUSTCODE() {
        return CUSTCODE;
    }

    public String getCUSTNAME() {
        return CUSTNAME;
    }

    public void setCUSTNAME(String CUSTNAME) {
        this.CUSTNAME = CUSTNAME;
    }

    public String getCUSTCITY() {
        return CUSTCITY;
    }

    public void setCUSTCITY(String CUSTCITY) {
        this.CUSTCITY = CUSTCITY;
    }

    public String getWORKINGAREA() {
        return WORKINGAREA;
    }

    public void setWORKINGAREA(String WORKINGAREA) {
        this.WORKINGAREA = WORKINGAREA;
    }

    public String getCUSTCOUNTRY() {
        return CUSTCOUNTRY;
    }

    public void setCUSTCOUNTRY(String CUSTCOUNTRY) {
        this.CUSTCOUNTRY = CUSTCOUNTRY;
    }

    public String getGRADE() {
        return GRADE;
    }

    public void setGRADE(String GRADE) {
        this.GRADE = GRADE;
    }

    public double getOPENINGAMT() {
        return OPENINGAMT;
    }

    public void setOPENINGAMT(double OPENINGAMT) {
        this.OPENINGAMT = OPENINGAMT;
    }

    public double getRECEIVEAMT() {
        return RECEIVEAMT;
    }

    public void setRECEIVEAMT(double RECEIVEAMT) {
        this.RECEIVEAMT = RECEIVEAMT;
    }

    public double getPAYMENTAMT() {
        return PAYMENTAMT;
    }

    public void setPAYMENTAMT(double PAYMENTAMT) {
        this.PAYMENTAMT = PAYMENTAMT;
    }

    public double getOUTSTANDINGAMT() {
        return OUTSTANDINGAMT;
    }

    public void setOUTSTANDINGAMT(double OUTSTANDINGAMT) {
        this.OUTSTANDINGAMT = OUTSTANDINGAMT;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public Agents getAgents()
    {
        return agents;
    }

    public void setAgents(Agents agents)
    {
        this.agents = agents;
    }
}
