package com.ims.domain;

import oracle.sql.TIMESTAMP;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Marquis on 6/30/2017.
 */
@Entity
@Table(name = "powithretailerandsupplier ")
public class poView
{
    private Integer id;
    private TIMESTAMP time;
    private Integer suppId;
    private Integer retId;
    private Float cost;
    private String sname;
    private String rname;

    public poView() {
    }

    @Id
    @Column(name="POID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="POTIME")
    public TIMESTAMP getTime() {
        return time;
    }

    public void setTime(TIMESTAMP time) {
        this.time = time;
    }

    @Column(name="POSUPPLIER")
    public Integer getSuppId() {
        return suppId;
    }

    public void setSuppId(Integer suppId) {
        this.suppId = suppId;
    }

    @Column(name="PORETAILER")
    public Integer getRetId() {
        return retId;
    }

    public void setRetId(Integer retId) {
        this.retId = retId;
    }

    @Column(name="POCOST")
    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Column(name="SNAME")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Column(name="RNAME")
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "poView{" +
                "id=" + id +
                ", time=" + time +
                ", suppId=" + suppId +
                ", retId=" + retId +
                ", cost=" + cost +
                ", sname='" + sname + '\'' +
                ", rname='" + rname + '\'' +
                '}';
    }
}
