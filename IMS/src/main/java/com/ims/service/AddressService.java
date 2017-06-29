package com.ims.service;

import com.ims.dao.AddressDao;
import com.ims.domain.Address;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

/**
 * Created by Marquis on 6/28/2017.
 */
@Service
@Transactional
public class AddressService
{
    @Autowired
    AddressDao dao;

    public Address getById(Integer id){return dao.findOne(id);}

    public List<Address> getAll(){return (List<Address>)dao.findAll();}
}
