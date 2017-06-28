package com.revature.domain;

import javax.persistence.*;

/**
 * Created by ath73 on 6/28/2017.
 */
@Entity
@Table(name="SUPPLIER")
public class Supplier {

    /*
        SUPPLIER

        SID    NUMBER
        SNAME  VARCHAR2
        SADDRESS   NUMBER
     */
    private Integer id;
    private String name;
    private Integer addr;

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
    @Column(name="SADDRESS")
    public Integer getAddr() {
        return addr;
    }

    public void setAddr(Integer addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }
}
