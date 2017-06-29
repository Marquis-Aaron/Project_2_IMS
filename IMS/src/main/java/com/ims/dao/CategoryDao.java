package com.ims.dao;

import com.ims.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Marquis on 6/29/2017.
 */
@Repository
public interface CategoryDao extends CrudRepository<Category, Integer>
{
}
