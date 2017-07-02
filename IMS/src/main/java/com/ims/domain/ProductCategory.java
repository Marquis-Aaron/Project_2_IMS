package com.ims.domain;

import javax.persistence.*;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="PRODUCTCATEGORY")
public class ProductCategory {

    private Integer id1;
    private Category category;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CID")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
