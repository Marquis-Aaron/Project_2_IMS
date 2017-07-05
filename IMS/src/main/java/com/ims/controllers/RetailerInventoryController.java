package com.ims.controllers;

import com.ims.domain.RetailerInventory;
import com.ims.service.RetailerInventoryService;
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
public class RetailerInventoryController
{
    @Autowired
    RetailerInventoryService service;

    @RequestMapping(value="/ri/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RetailerInventory> getById(@PathVariable Integer id){
        RetailerInventory ri = service.getById(id);
        return new ResponseEntity<RetailerInventory>(ri, HttpStatus.OK);
    }

    @RequestMapping(value="/ri/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RetailerInventory>> getAll(){
        List<RetailerInventory> ri = (List<RetailerInventory>) service.getAll();
        return new ResponseEntity<List<RetailerInventory>>(ri, HttpStatus.OK);
    }
    @RequestMapping(value="/ri/soldOut", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RetailerInventory>> getSoldOut(){
        List<RetailerInventory> ri = service.getSoldOut();
        return new ResponseEntity<List<RetailerInventory>>(ri, HttpStatus.OK);
    }
    @RequestMapping(value="/ri/below", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RetailerInventory>> getBelow(){
        List<RetailerInventory> ri = service.getBelowThresehold();
        return new ResponseEntity<List<RetailerInventory>>(ri, HttpStatus.OK);
    }
    @RequestMapping(value="/ri/near", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RetailerInventory>> getNear(){
        List<RetailerInventory> ri = service.getNearThresehold();
        return new ResponseEntity<List<RetailerInventory>>(ri, HttpStatus.OK);
    }

}
