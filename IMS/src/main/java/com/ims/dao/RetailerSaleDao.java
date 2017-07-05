package com.ims.dao;

import com.ims.domain.RetailerSale;
import org.hibernate.type.descriptor.java.JdbcTimestampTypeDescriptor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Marquis on 6/29/2017.
 */
@Repository
public interface RetailerSaleDao extends CrudRepository<RetailerSale, Integer>
{
}
