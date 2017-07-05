package com.ims.dao;

import com.ims.domain.RetailerInventory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Repository
public interface RetailerInventoryDao extends CrudRepository<RetailerInventory, Integer>
{
    @Query(value = "SELECT * FROM RETAILERINVENTORY WHERE RIPRODUCTQUANTITY BETWEEN 1 AND RIPRODUCTTHRESHOLD", nativeQuery = true)
    public List<RetailerInventory> belowThresholdNotification ();

    @Query(value = "SELECT * FROM RETAILERINVENTORY WHERE RIPRODUCTQUANTITY = 0", nativeQuery = true)
    public List<RetailerInventory> productSoldOutNotification();

    @Query(value = "SELECT * FROM RETAILERINVENTORY WHERE RIPRODUCTQUANTITY BETWEEN RIPRODUCTTHRESHOLD AND RIPRODUCTTHRESHOLD + 10", nativeQuery = true)
    public List<RetailerInventory> approachingThresholdNotification();
}
