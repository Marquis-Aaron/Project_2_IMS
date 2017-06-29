package com.ims.controllers;

import com.ims.domain.Category;
import com.ims.service.CategoryService;
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
public class CategoryController
{

    @Autowired
    CategoryService service;

    @RequestMapping(value="/category/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Category> getById(@PathVariable Integer id){
        Category c = service.getById(id);
        return new ResponseEntity<Category>(c, HttpStatus.OK);
    }

    @RequestMapping(value="/Category/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Category>> getAll(){
        List<Category> c = (List<Category>) service.getAll();
        return new ResponseEntity<List<Category>>(c, HttpStatus.OK);
    }
}
