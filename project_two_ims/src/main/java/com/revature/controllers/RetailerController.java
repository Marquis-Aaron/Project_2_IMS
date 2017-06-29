package com.revature.controllers;

import com.revature.dao.RetailerService;
import com.revature.domain.Retailer;
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
 * Created by ath73 on 6/28/2017.
 */
@RestController
public class RetailerController {
    @Autowired
    RetailerService service;

    @RequestMapping(value="/retailers/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Retailer> findById(@PathVariable Integer id){
        Retailer r = service.getById(id);
        return new ResponseEntity<Retailer>(r, HttpStatus.OK);
    }
}
