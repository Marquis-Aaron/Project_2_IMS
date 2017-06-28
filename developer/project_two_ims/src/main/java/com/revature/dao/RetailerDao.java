package com.revature.dao;

import com.revature.domain.Retailer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by ath73 on 6/28/2017.
 */
@Repository
public interface RetailerDao extends CrudRepository<Retailer, Integer> {
    public Retailer findById(Integer id);
}
