//package com.ims.Impl;
//
//import com.ims.dao.PurchaseOrderLineDao;
//import com.ims.domain.PurchaseOrderLine;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//
///**
// * Created by Marquis on 7/5/2017.
// */
//@Repository
//@Transactional
//public class POLImpl implements PurchaseOrderLineDao
//{
//    @Autowired
//    private SessionFactory sf;
//
//    @Override
//    public void addPol(PurchaseOrderLine pol) {
//        sf.getCurrentSession().save(pol);
//    }
//}
