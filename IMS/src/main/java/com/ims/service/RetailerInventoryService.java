package com.ims.service;

import com.ims.dao.RetailerInventoryDao;
import com.ims.domain.RetailerInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Service
@Transactional
public class RetailerInventoryService
{
    @Autowired
    RetailerInventoryDao dao;

    public RetailerInventory getById(Integer id){return dao.findOne(id);}

    public List<RetailerInventory> getAll(){return (List<RetailerInventory>)dao.findAll();}

    public List<RetailerInventory> getSoldOut() {return dao.productSoldOutNotification();}
    public List<RetailerInventory> getNearThresehold() {return  dao.approachingThresholdNotification();}
    public List<RetailerInventory> getBelowThresehold() {return dao.belowThresholdNotification();}
}
