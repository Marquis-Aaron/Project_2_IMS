package com.ims.controllers;

import com.ims.domain.poView;
import com.ims.service.poViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Marquis on 6/30/2017.
 */
@RestController
public class poViewController
{

    @Autowired
    poViewService service;

//    @RequestMapping(value="/po/supp", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<poView>> getAllBySupp(){
//        List<poView> po = (List<poView>) service.getAllBySupplier();
//        return new ResponseEntity<List<poView>>(po, HttpStatus.OK);
//    }
//
//    @RequestMapping(value="/po/ret", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<List<poView>> getAllByRet(){
//        List<poView> po = (List<poView>) service.getAllByRetailer();
//        return new ResponseEntity<List<poView>>(po, HttpStatus.OK);
//    }

    @RequestMapping(value="/pov/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<poView>> getAll(){
        List<poView> pov = (List<poView>) service.getAll();
        return new ResponseEntity<List<poView>>(pov, HttpStatus.OK);
    }
}
