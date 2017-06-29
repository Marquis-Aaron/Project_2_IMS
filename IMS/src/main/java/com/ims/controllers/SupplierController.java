package com.ims.controllers;

import com.ims.domain.Supplier;
import com.ims.service.RetailerService;
import com.ims.service.SupplierService;
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
public class SupplierController
{
    @Autowired
    SupplierService service;

    @RequestMapping(value="/supplier/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Supplier> getById(@PathVariable Integer id){
        Supplier s = service.getById(id);
        return new ResponseEntity<Supplier>(s, HttpStatus.OK);
    }

    @RequestMapping(value="/supplier/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Supplier>> getAll(){
        List<Supplier> s = (List<Supplier>) service.getAll();
        return new ResponseEntity<List<Supplier>>(s, HttpStatus.OK);
    }
}
