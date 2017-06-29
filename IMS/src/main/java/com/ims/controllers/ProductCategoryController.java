package com.ims.controllers;

import com.ims.domain.ProductCategory;
import com.ims.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@RestController
public class ProductCategoryController
{
    @Autowired
    ProductCategoryService service;

    @RequestMapping(value="/pc/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductCategory> getById(@PathVariable Integer id){
        ProductCategory pc = service.getById(id);
        return new ResponseEntity<ProductCategory>(pc, HttpStatus.OK);
    }

    @RequestMapping(value="/pc/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProductCategory>> getAll(){
        List<ProductCategory> pc = (List<ProductCategory>) service.getAll();
        return new ResponseEntity<List<ProductCategory>>(pc, HttpStatus.OK);
    }
}
