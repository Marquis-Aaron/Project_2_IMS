package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name = "PURCHASEORDERLINE")
public class PurchaseOrderLine
{
    private Integer id;
    private Integer purchaseOrder;
    private Integer product;
    private Integer quantity;
    private Float cost;

    public PurchaseOrderLine() {
    }

    @Id
    @Column(name="POLID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "POLPURCHASEORDER")
    public Integer getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(Integer purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    @Column(name = "POLPRODUCT")
    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    @Column(name="POLQUANTITY")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name="POLCOST")
    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "PurchaseOrderLine{" +
                "id=" + id +
                ", purchaseOrder=" + purchaseOrder +
                ", product=" + product +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
