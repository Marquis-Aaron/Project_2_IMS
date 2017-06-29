package com.ims.controllers;

import com.ims.domain.Retailer;
import com.ims.service.RetailerService;
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
public class RetailerController
{
    @Autowired
    RetailerService service;

    @RequestMapping(value="/retailer/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Retailer> getById(@PathVariable Integer id){
        Retailer r = service.getById(id);
        return new ResponseEntity<Retailer>(r, HttpStatus.OK);
    }

    @RequestMapping(value="/retailer/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Retailer>> getAll(){
        List<Retailer> r = (List<Retailer>) service.getAll();
        return new ResponseEntity<List<Retailer>>(r, HttpStatus.OK);
    }
}
