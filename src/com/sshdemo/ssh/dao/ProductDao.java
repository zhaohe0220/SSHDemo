package com.sshdemo.ssh.dao;

import com.sshdemo.ssh.domain.Product;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by wade1 on 2017-01-11.
 */
public class ProductDao extends HibernateDaoSupport {

    public void save(Product product){
        System.out.println("DAO 中的save方法执行了。。。");
        this.getHibernateTemplate().save(product);
    }

}
