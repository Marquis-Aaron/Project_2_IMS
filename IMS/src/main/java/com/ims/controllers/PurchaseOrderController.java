package com.ims.controllers;

import com.ims.domain.FullPO;
import com.ims.domain.PurchaseOrder;
import com.ims.domain.PurchaseOrderLine;
import com.ims.service.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@RestController
public class PurchaseOrderController
{
    @Autowired
    PurchaseOrderService service;
    @Autowired
    RetailerService retailerService;
    @Autowired
    SupplierService supplierService;

    @Autowired
    PurchaseOrderLineService polservice;

    @Autowired
    ProductService pserv;

    @Autowired
    PurchaseOrderService pos;
    SessionFactory sf;

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


//    @RequestMapping(value = "/submitpo", method = RequestMethod.POST)
//    public  @ResponseBody
//    String saveCompany(@RequestParam("retailer") String ret,
//                       @RequestParam("supplier") String supp,
//                       @RequestParam("category") String cat,
//                       @RequestParam("product") String prod,
//                       @RequestParam("cost") Float cost,
//                       @RequestParam("quantity") Integer quant) {
//        //
//        // Code processing the input parameters
//        //
//        return "The purchase order with (Retailer: " + ret + ", Supplier: "+ supp + ", Category: " + cat + ", Cost: $" + String.valueOf( cost ) + ", Quantity: " + String.valueOf(quant) + ") is saved";
//    }

    @RequestMapping(value="/submit/po", method = RequestMethod.POST)
    public ResponseEntity<PurchaseOrder> addPol(@RequestBody FullPO fpo)
    {
            //add purchase order
        PurchaseOrder po1 = new PurchaseOrder();
        po1.setCost(fpo.getPo().getCost());
        po1.setTime(new Timestamp(System.currentTimeMillis()));
        po1.setRetailer(retailerService.getById(fpo.getPo().getRetailer().getId()));
        po1.setSupplier(supplierService.getById(fpo.getPo().getSupplier().getId()));
        System.out.println();
        System.out.println("PURCHASE ORDER:");
        System.out.print(po1);
        System.out.println();

        PurchaseOrder savedPO = service.addPo(po1);
        
        if(po1 == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);


        //add purchase order lines
        Boolean isSuccess = true;
        List<PurchaseOrderLine> poList = fpo.getPols();
        for (PurchaseOrderLine polReq: poList)
        {
            PurchaseOrderLine pol1 = new PurchaseOrderLine();
            pol1.setProduct(pserv.getById(polReq.getProduct().getId()));
            pol1.setCost(polReq.getCost());
            pol1.setPurchaseOrder(savedPO.getId());
            //pol1.setPurchaseOrder(pol.getId());
            pol1.setQuantity(polReq.getQuantity());

            System.out.println("PURCHASE ORDER LINE ");
            System.out.println();
            System.out.println(pol1);
            System.out.println(savedPO.getId());
             //poList.add(pol1);
            System.out.println();
            System.out.println();
            System.out.println("PURCHASE ORDER LINE LIST");
            System.out.println(poList);
            System.out.println();
            System.out.println();
            PurchaseOrderLine savedPOL = polservice.addPol(pol1);
            if(savedPOL == null){
                isSuccess = false;
            }
        }

        if(isSuccess)
            return new ResponseEntity<>(HttpStatus.CREATED);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);



    }


}
