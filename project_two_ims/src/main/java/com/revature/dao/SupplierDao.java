package com.revature.dao;

import com.revature.domain.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ath73 on 6/28/2017.
 */
@Repository
public interface SupplierDao extends CrudRepository<Supplier, Integer> {
    public Supplier findByName(String name);
}
