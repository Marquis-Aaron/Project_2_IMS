package com.ims.controllers;

import com.ims.domain.PurchaseOrder;
import com.ims.domain.PurchaseOrderLine;
import com.ims.service.ProductService;
import com.ims.service.PurchaseOrderLineService;
import com.ims.service.PurchaseOrderService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@RestController
public class PurchaseOrderLineController
{
    @Autowired
    PurchaseOrderLineService service;

    @Autowired
    ProductService pserv;

    @Autowired
    PurchaseOrderService pos;
    SessionFactory sf;

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


//    @RequestMapping(value="/submit/pol", method = RequestMethod.POST)
//    public ResponseEntity<PurchaseOrderLine> addPol(@RequestBody PurchaseOrderLine pol)
//    {
//    PurchaseOrderLine pol1 = new PurchaseOrderLine();
//        pol1.setProduct(pserv.getById(pol.getProduct().getId()));
//        pol1.setCost(pol.getCost());
//        pol1.setPurchaseOrder(pos.getById());
//        //pol1.setPurchaseOrder(pol.getId());
//        pol1.setQuantity(pol.getQuantity());
//        System.out.println(pol1);
//
//    service.addPol(pol1);
//    if(pol1 != null)
//        return new ResponseEntity<>(HttpStatus.CREATED);
//        else
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//
//    }


}
