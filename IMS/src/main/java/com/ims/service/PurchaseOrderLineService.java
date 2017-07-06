package com.ims.service;

import com.ims.dao.PurchaseOrderLineDao;
import com.ims.domain.PurchaseOrder;
import com.ims.domain.PurchaseOrderLine;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Service
@Transactional
public class PurchaseOrderLineService
{
    @Autowired
    PurchaseOrderLineDao dao;
    SessionFactory sf;
    //POLImpl dao;

    public PurchaseOrderLine getById(Integer id){return dao.findOne(id);}

    public List<PurchaseOrderLine> getAll(){return (List<PurchaseOrderLine>)dao.findAll();}

    public List<PurchaseOrderLine> getPOById(Integer purchaseOrder){
        return (List<PurchaseOrderLine>) dao.findAllByPurchaseOrder(purchaseOrder);
    }


    //add to purchase order line
    public PurchaseOrderLine addPol(PurchaseOrderLine pol)    {
        return dao.save(pol);
    }

}
