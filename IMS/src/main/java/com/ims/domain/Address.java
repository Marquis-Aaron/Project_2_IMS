package com.ims.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.DoubleSummaryStatistics;

/**
 * Created by Marquis on 6/28/2017.
 */
@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable
{
    private Integer id;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() {    }

    public Address(Integer id, String street, String city, String state, String zip) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Id
    @Column(name = "AID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="ASTREET")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name="ACITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name="ASTATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name="AZIP")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }



    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
