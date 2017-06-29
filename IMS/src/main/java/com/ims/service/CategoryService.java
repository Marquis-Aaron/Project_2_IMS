package com.ims.service;

import com.ims.dao.CategoryDao;
import com.ims.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */

@Service
@Transactional
public class CategoryService
{
    @Autowired
    CategoryDao dao;

    public Category getById(Integer id){return dao.findOne(id);}

    public List<Category> getAll(){return (List<Category>)dao.findAll();}
}
