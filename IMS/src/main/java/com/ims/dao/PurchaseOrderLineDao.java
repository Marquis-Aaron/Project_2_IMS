package com.ims.dao;

import com.ims.domain.PurchaseOrderLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marquis on 6/29/2017.
 */
@Repository
public interface PurchaseOrderLineDao extends CrudRepository<PurchaseOrderLine, Integer>
{
}
