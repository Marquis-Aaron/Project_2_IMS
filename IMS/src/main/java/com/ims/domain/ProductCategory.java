package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="PRODUCTCATEGORY")
public class ProductCategory {

    private Integer id1;
    private Integer id2;

    public ProductCategory() {
    }

    @Id
    @Column(name="PID")
    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    @Column(name="CID")
    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "pid=" + id1 +
                ", cid=" + id2 +
                '}';
    }
}
