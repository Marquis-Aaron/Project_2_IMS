package com.ims.controllers;

import com.ims.domain.Address;
import com.ims.service.AddressService;
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
 * Created by Marquis on 6/28/2017.
 */
@RestController
public class AddressController
{

    @Autowired
    AddressService service;

    @RequestMapping(value="/address/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Address> getById(@PathVariable Integer id){
        Address a = service.getById(id);
        return new ResponseEntity<Address>(a, HttpStatus.OK);
    }

    @RequestMapping(value="/address/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Address>> getAll(){
        List<Address> p = (List<Address>) service.getAll();
        return new ResponseEntity<List<Address>>(p, HttpStatus.OK);
    }
}
