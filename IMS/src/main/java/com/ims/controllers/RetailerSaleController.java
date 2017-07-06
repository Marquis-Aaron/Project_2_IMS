package com.ims.controllers;

import com.ims.domain.RetailerSale;
import com.ims.service.RetailerSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Created by Marquis on 6/29/2017.
 */
@RestController
public class RetailerSaleController
{
    @Autowired
    RetailerSaleService service;

    @RequestMapping(value="/rs/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RetailerSale> getById(@PathVariable Integer id){
        RetailerSale rs = service.getById(id);
        return new ResponseEntity<RetailerSale>(rs, HttpStatus.OK);
    }

    @RequestMapping(value="/rs/all", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RetailerSale>> getAll(){
        List<RetailerSale> rs = (List<RetailerSale>) service.getAll();
        return new ResponseEntity<List<RetailerSale>>(rs, HttpStatus.OK);
    }
}
