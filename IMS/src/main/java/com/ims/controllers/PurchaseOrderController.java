package com.ims.controllers;

import com.ims.domain.PurchaseOrder;
import com.ims.service.PurchaseOrderService;
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
public class PurchaseOrderController
{
    @Autowired
    PurchaseOrderService service;

    @RequestMapping(value="/po/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PurchaseOrder> getById(@PathVariable Integer id){
        PurchaseOrder po = service.getById(id);
        return new ResponseEntity<PurchaseOrder>(po, HttpStatus.OK);
    }

    @RequestMapping(value="/po/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PurchaseOrder>> getAll(){
        List<PurchaseOrder> po = (List<PurchaseOrder>) service.getAll();
        return new ResponseEntity<List<PurchaseOrder>>(po, HttpStatus.OK);
    }
}
