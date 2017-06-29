package com.ims.service;

import com.ims.dao.ProductCategoryDao;
import com.ims.domain.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Service
@Transactional
public class ProductCategoryService
{
    @Autowired
    ProductCategoryDao dao;

    public ProductCategory getById(Integer id){return dao.findOne(id);}

    public List<ProductCategory> getAll(){return (List<ProductCategory>)dao.findAll();}

}
