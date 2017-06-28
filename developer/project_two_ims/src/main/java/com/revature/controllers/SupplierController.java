package com.revature.controllers;

import com.revature.dao.SupplierService;
import com.revature.domain.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * Created by ath73 on 6/28/2017.
 */
@RestController
public class SupplierController {
    @Autowired
    SupplierService service;

    @RequestMapping(value="/supplier/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Supplier getSupplierByName(@PathVariable String name){
        Supplier s = service.getByName(name);
        return s;
    }
}
