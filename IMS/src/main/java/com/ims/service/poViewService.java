package com.ims.service;

import com.ims.dao.poViewDao;
import com.ims.domain.PurchaseOrder;
import com.ims.domain.poView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marquis on 6/30/2017.
 */
@Service
@Transactional
public class poViewService
{
    @Autowired
    poViewDao dao;

//    public List<poView> getAllBySupplier() {return (List<poView>) dao.findAllBySupplier();}
//
//    public List<poView> getAllByRetailer() {return (List<poView>) dao.findAllByRetailer();}

    public List<poView> getAll() {return (List<poView>) dao.findAll();}
}
