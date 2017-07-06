//package com.ims.Impl;
//
//
//import com.ims.dao.PurchaseOrderDao;
//import com.ims.domain.PurchaseOrder;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * Created by Marquis on 7/5/2017.
// */
//public class POImpl implements PurchaseOrderDao
//{
//    @Autowired
//    private SessionFactory sf;
//
//    @Override
//    public void addPo(PurchaseOrder po) {
//        sf.getCurrentSession().save(po);
//    }
//
//
//}
