package com.ims.service;

import com.ims.dao.PurchaseOrderLineDao;
import com.ims.domain.PurchaseOrderLine;
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

    public PurchaseOrderLine getById(Integer id){return dao.findOne(id);}

    public List<PurchaseOrderLine> getAll(){return (List<PurchaseOrderLine>)dao.findAll();}
}
