package com.ims.service;

import com.ims.dao.SupplierDao;
import com.ims.domain.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */

@Service
@Transactional
public class SupplierService
{
    @Autowired
    SupplierDao dao;

    public Supplier getById(Integer id){return dao.findOne(id);}

    public List<Supplier> getAll(){return (List<Supplier>)dao.findAll();}
}
