package com.ims.dao;

import com.ims.domain.PurchaseOrder;
import com.ims.domain.poView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Marquis on 6/30/2017.
 */
@Repository
public interface poViewDao extends CrudRepository<poView, Integer>
{
//    public List<poView> findAllBySupplier();
//    public List<poView> findAllByRetailer();
}
