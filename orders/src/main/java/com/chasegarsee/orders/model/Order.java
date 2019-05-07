package com.chasegarsee.orders.model;


import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderNumber;
    @Column
    private double orderAmt;
    @Column
    private double advanceAmt;
    @OneToMany
    @JoinColumn(name = "customerCode")
    private long customerCode;
    @OneToMany
    @JoinColumn(name = "agentCode")
    private long agentCode;
    @Column
    private String orderDescription;

    public Order()
    {
    }

    public long getOrderNumber()
    {
        return orderNumber;
    }

    public double getOrderAmt()
    {
        return orderAmt;
    }

    public void setOrderAmt(double orderAmt)
    {
        this.orderAmt = orderAmt;
    }

    public double getAdvanceAmt()
    {
        return advanceAmt;
    }

    public void setAdvanceAmt(double advanceAmt)
    {
        this.advanceAmt = advanceAmt;
    }

    public long getCustomerCode()
    {
        return customerCode;
    }

    public void setCustomerCode(long customerCode)
    {
        this.customerCode = customerCode;
    }

    public long getAgentCode()
    {
        return agentCode;
    }

    public void setAgentCode(long agentCode)
    {
        this.agentCode = agentCode;
    }

    public String getOrderDescription()
    {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription)
    {
        this.orderDescription = orderDescription;
    }
}
