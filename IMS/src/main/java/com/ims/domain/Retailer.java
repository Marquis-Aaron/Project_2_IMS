package com.ims.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Marquis on 6/28/2017.
 */

@Entity
@Table(name="RETAILER")
public class Retailer implements Serializable
{
    private Integer id;
    private String name;
    private Address address;

    public Retailer(){}

    public Retailer(Integer id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="RADDRESS")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Retailer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
