package com.ims.service;

import com.ims.dao.RetailerDao;
import com.ims.domain.Retailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Service
@Transactional
public class RetailerService
{
    @Autowired
    RetailerDao dao;

    public Retailer getById(Integer id){return dao.findOne(id);}

    public List<Retailer> getAll(){return (List<Retailer>)dao.findAll();}
}
