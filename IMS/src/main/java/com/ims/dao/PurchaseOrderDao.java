package com.ims.dao;

import com.ims.domain.PurchaseOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Repository
public interface PurchaseOrderDao extends CrudRepository<PurchaseOrder, Integer>
{

}
