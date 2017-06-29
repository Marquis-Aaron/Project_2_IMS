package com.ims.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Marquis on 6/28/2017.
 */

@Entity
@Table(name="RETAILER")
public class Retailer
{
    private Integer id;
    private String name;
    private Integer addressId;

    public Retailer(){}

    @Id
    @Column(name="RID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="RNAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="RADDRESS")
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "Retailer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressId=" + addressId +
                '}';
    }
}
