package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.DoubleSummaryStatistics;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="CATEGORY")
public class Category
{
    private Integer id;
    private String name;

    public Category() {
    }

    @Id
    @Column(name="CID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="CNAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
