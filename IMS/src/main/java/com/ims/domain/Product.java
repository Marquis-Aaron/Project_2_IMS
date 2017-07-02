package com.ims.domain;

import javax.persistence.*;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="PRODUCT")
public class Product {
    private Integer id;
    private String name;
    private Float supplierPrice;
    private Float retailerPrice;
    private ProductCategory productCategory;

    public Product() {}

    @Id
    @Column(name="PID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="PNAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="PSUPPLIERPRICE")
    public Float getSupplierPrice() {
        return supplierPrice;
    }

    public void setSupplierPrice(Float supplierPrice) {
        this.supplierPrice = supplierPrice;
    }

    @Column(name="PRETAILERPRICE")
    public Float getRetailerPrice() {
        return retailerPrice;
    }

    public void setRetailerPrice(Float retailerPrice) {
        this.retailerPrice = retailerPrice;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PID")
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", supplierPrice=" + supplierPrice +
                ", retailerPrice=" + retailerPrice +
                '}';
    }
}
