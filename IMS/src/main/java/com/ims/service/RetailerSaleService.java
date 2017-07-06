package com.ims.service;

import com.ims.dao.RetailerSaleDao;
import com.ims.domain.RetailerSale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Service
@Transactional
public class RetailerSaleService
{
    @Autowired
    RetailerSaleDao dao;

    public RetailerSale getById(Integer id){return dao.findOne(id);}

    public List<RetailerSale> getAll(){return (List<RetailerSale>)dao.findAll();}
}
