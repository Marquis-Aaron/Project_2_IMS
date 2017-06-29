package com.ims.service;

import com.ims.dao.PurchaseOrderDao;
import com.ims.domain.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Service
@Transactional
public class PurchaseOrderService
{
    @Autowired
    PurchaseOrderDao dao;

    public PurchaseOrder getById(Integer id){return dao.findOne(id);}

    public List<PurchaseOrder> getAll(){return (List<PurchaseOrder>)dao.findAll();}
}
