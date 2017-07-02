package com.ims.controllers;

import com.ims.domain.PurchaseOrderLine;
import com.ims.service.PurchaseOrderLineService;
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
public class PurchaseOrderLineController
{
    @Autowired
    PurchaseOrderLineService service;

    @RequestMapping(value="/pol/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PurchaseOrderLine> getById(@PathVariable Integer id){
        PurchaseOrderLine pol = service.getById(id);
        return new ResponseEntity<PurchaseOrderLine>(pol, HttpStatus.OK);
    }

    @RequestMapping(value="/pol/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PurchaseOrderLine>> getAll(){
        List<PurchaseOrderLine> pol = (List<PurchaseOrderLine>) service.getAll();
        return new ResponseEntity<List<PurchaseOrderLine>>(pol, HttpStatus.OK);
    }

    @RequestMapping(value="/pol/poid/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PurchaseOrderLine>> getPOById(@PathVariable Integer id){
        List<PurchaseOrderLine> pol = service.getPOById(id);
        return new ResponseEntity<List<PurchaseOrderLine>>(pol, HttpStatus.OK);
    }
}
