package com.ims.domain;

import javax.persistence.*;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name="SUPPLIER")
public class Supplier {

    private Integer id;
    private String name;
    private Address address;

    public Supplier() {
    }

    @Id
    @Column(name="SID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="SNAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SADDRESS")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
