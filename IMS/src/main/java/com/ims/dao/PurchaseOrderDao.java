package com.ims.dao;

import com.ims.domain.PurchaseOrder;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate5.*;
import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Repository
public interface PurchaseOrderDao extends CrudRepository<PurchaseOrder, Integer>
{

}
