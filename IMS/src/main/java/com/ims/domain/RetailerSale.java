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
@Table(name="RETAILERSALE")
public class RetailerSale
{
    private Integer id;
    private Integer retailer;
    private Integer product;
    private Integer quantity;
    private Float cost;
    private TIMESTAMP time;

    public RetailerSale() {
    }

    public RetailerSale(Integer id, Integer retailer, Integer product, Integer quantity, Float cost, TIMESTAMP time) {
        this.id = id;
        this.retailer = retailer;
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
        this.time = time;
    }

    @Id
    @Column(name="RSID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="RSRETAILER")
    public Integer getRetailer() {
        return retailer;
    }

    public void setRetailer(Integer retailer) {
        this.retailer = retailer;
    }

    @Column(name="RSPRODUCT")
    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    @Column(name="RSPRODUCTQUANTITY")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name = "RSCOST")
    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Column(name = "RSTIME")
    public TIMESTAMP getTime() {
        return time;
    }

    public void setTime(TIMESTAMP time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "RetailerSale{" +
                "id=" + id +
                ", retailer=" + retailer +
                ", product=" + product +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", time=" + time +
                '}';
    }
}
