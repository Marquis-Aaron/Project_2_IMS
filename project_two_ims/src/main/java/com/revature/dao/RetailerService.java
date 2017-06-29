package com.revature.dao;

import com.revature.domain.Retailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

/**
 * Created by ath73 on 6/28/2017.
 */
@Service
@Transactional
public class RetailerService {
    @Autowired
    RetailerDao dao;

    public Retailer getById(Integer id){ return dao.findRetailerById(id);}
}
