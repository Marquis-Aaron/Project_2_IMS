package com.ims.dao;

import com.ims.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Marquis on 6/29/2017.
 */
@Repository
public interface ProductDao extends CrudRepository<Product, Integer>
{

}
