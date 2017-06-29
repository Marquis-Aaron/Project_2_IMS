package com.ims.dao;

import com.ims.domain.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by Marquis on 6/28/2017.
 */
@Repository
public interface AddressDao extends CrudRepository<Address, Integer>
{
}
