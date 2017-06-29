package com.ims.service;

import com.ims.dao.ProductDao;
import com.ims.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Service
@Transactional
public class ProductService {

    @Autowired
    ProductDao dao;

    public Product getById(Integer id){return dao.findOne(id);}

    public List<Product> getAll(){return (List<Product>)dao.findAll();}

}
