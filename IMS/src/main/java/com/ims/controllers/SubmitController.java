package com.ims.controllers;

import com.ims.domain.PurchaseOrder;
import com.ims.service.PurchaseOrderLineService;
import com.ims.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import com.ims.*;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by Marquis on 7/3/2017.
 */
@RestController
public class SubmitController
{
    //@Autowired
    //PurchaseOrderService poservice;
    //PurchaseOrderLineService polservice;

//    @RequestMapping(value = "/submitpo", method = RequestMethod.POST)
//    public  @ResponseBody String saveCompany( @RequestParam("retailer") String ret,
//                                              @RequestParam("supplier") String supp,
//                                              @RequestParam("category") String cat,
//                                              @RequestParam("product") String prod,
//                                              @RequestParam("cost") Float cost,
//                                              @RequestParam("quantity") Integer quant) {
//        //
//        // Code processing the input parameters
//        //
//        return "The purchase order with (Retailer: " + ret + ", Supplier: "+ supp + ", Category: " + cat + ", Cost: $" + String.valueOf( cost ) + ", Quantity: " + String.valueOf(quant) + ") is saved";
//    }

//    @RequestMapping(value = "/submit", method = RequestMethod.POST)
//    public ResponseEntity<Void> createUser(@RequestBody PurchaseOrder po, UriComponentsBuilder ucBuilder) {
//        System.out.println("Creating User " + po.getId());
//
//
//    }


//    @RequestMapping(path = "/submit", method = RequestMethod.POST)
//    public ModelAndView process(WebRequest req)
//{
//        //do stuff with valueOne variable here
////    System.out.println(req.getParameter("") );
////    System.out.println(req.getParameter("") );
////    System.out.println(req.getParameter("") );
//
//    return new ModelAndView();
//
//
//    }
}
