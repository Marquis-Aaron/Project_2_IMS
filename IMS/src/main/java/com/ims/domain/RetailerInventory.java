package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="RETAILERINVENTORY")
public class RetailerInventory
{
    private Integer id;
    private Integer retailer;
    private Integer product;
    private Integer quantity;
    private Integer threshold;

    public RetailerInventory() {
    }

    public RetailerInventory(Integer id, Integer retailer, Integer product, Integer quantity, Integer threshold) {
        this.id = id;
        this.retailer = retailer;
        this.product = product;
        this.quantity = quantity;
        this.threshold = threshold;
    }

    @Id
    @Column(name="RIID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="RIRETAILER")
    public Integer getRetailer() {
        return retailer;
    }

    public void setRetailer(Integer retailer) {
        this.retailer = retailer;
    }

    @Column(name="RIPRODUCT")
    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    @Column(name="RIPRODUCTQUANTITY")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name="RIPRODUCTTHRESHOLD")
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        return "RetailerInventory{" +
                "id=" + id +
                ", retailer=" + retailer +
                ", product=" + product +
                ", quantity=" + quantity +
                ", threshold=" + threshold +
                '}';
    }
}
