package com.ims.dao;

import com.ims.domain.Retailer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Marquis on 6/29/2017.
 */
@Repository
public interface RetailerDao extends CrudRepository<Retailer, Integer>
{
}
