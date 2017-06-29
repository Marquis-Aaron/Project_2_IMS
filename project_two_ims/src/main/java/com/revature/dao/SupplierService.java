package com.revature.dao;

import com.revature.domain.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by ath73 on 6/28/2017.
 */
@Service
@Transactional
public class SupplierService {

    @Autowired
    SupplierDao dao;

    public Supplier getByName(String name) {return  dao.findByName(name);}
}
