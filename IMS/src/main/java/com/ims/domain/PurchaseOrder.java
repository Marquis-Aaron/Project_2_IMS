package com.ims.domain;

import oracle.sql.TIMESTAMP;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="PURCHASEORDER")
public class PurchaseOrder
{
    private Integer id;
    private TIMESTAMP time;
    private Supplier supplier;
    private Retailer retailer;
    private Float cost;
    
    public PurchaseOrder() {
    }

    public PurchaseOrder(Integer id, TIMESTAMP time, Supplier supplier, Retailer retailer, Float cost) {
        this.id = id;
        this.time = time;
        this.supplier = supplier;
        this.retailer = retailer;
        this.cost = cost;
    }

    @Id
    @Column(name="POID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="POTIME")
    public TIMESTAMP getTime() {
        return time;
    }

    public void setTime(TIMESTAMP time) {
        this.time = time;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "POSUPPLIER")
    public Supplier getSupplier() {
        return supplier;
    }


    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PORETAILER")
    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }

    @Column(name="POCOST")
    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "id=" + id +
                ", time=" + time +
                ", supplier=" + supplier +
                ", retailer=" + retailer +
                ", cost=" + cost +
                '}';
    }
}
