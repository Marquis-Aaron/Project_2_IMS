package com.ims.domain;

import oracle.sql.TIMESTAMP;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="RETAILERSALE")
public class RetailerSale
{
    private Integer id;
    private Retailer retailer;
    private Product product;
    private Integer quantity;
    private Float cost;
    private Timestamp time;

    public RetailerSale() {
    }

    @Id
    @Column(name="RSID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="RSRETAILER")
    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="RSPRODUCT")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
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
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
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
