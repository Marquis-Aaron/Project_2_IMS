package com.ims.controllers;

import com.ims.domain.Product;
import com.ims.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import javax.xml.ws.Response;
import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@RestController
public class ProductController
{
    @Autowired
    ProductService service;

    @RequestMapping(value="/product/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> getById(@PathVariable Integer id){
    Product p = service.getById(id);
    return new ResponseEntity<Product>(p, HttpStatus.OK);
    }

    @RequestMapping(value="/product/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> getAll(){
        List<Product> p = (List<Product>) service.getAll();
        return new ResponseEntity<List<Product>>(p, HttpStatus.OK);
    }
}
