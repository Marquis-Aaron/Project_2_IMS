package com.ims.domain;

import oracle.sql.TIMESTAMP;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="PURCHASEORDER")
public class PurchaseOrder implements Serializable {
    private Integer id;
    private Timestamp time;
    private Supplier supplier;
    private Retailer retailer;
    private Float cost;

    public PurchaseOrder() {
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
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "POSUPPLIER")
    public Supplier getSupplier() {
        return supplier;
    }


    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @ManyToOne(cascade = CascadeType.ALL)
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
