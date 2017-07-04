package com.ims.domain;

import javax.persistence.*;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="RETAILERINVENTORY")
public class RetailerInventory
{
    private Integer id;
    private Retailer retailer;
    private Product product;
    private Integer quantity;
    private Integer threshold;

    public RetailerInventory() {
    }

    @Id
    @Column(name="RIID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="RIRETAILER")
    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="RIPRODUCT")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
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
