package com.ims.domain;

import oracle.sql.TIMESTAMP;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="PURCHASEORDER")
public class PurchaseOrder
{
    private Integer id;
    private TIMESTAMP time;
    private Integer supplier;
    private Integer retailer;
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
    public TIMESTAMP getTime() {
        return time;
    }

    public void setTime(TIMESTAMP time) {
        this.time = time;
    }

    @Column(name="POSUPPLIER")
    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    @Column(name="PORETAILER")
    public Integer getRetailer() {
        return retailer;
    }

    public void setRetailer(Integer retailer) {
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
