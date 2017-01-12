package com.sshdemo.ssh.service;

import com.sshdemo.ssh.dao.ProductDao;
import com.sshdemo.ssh.domain.Product;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wade1 on 2017-01-11.
 */
@Transactional
public class ProductService {

    private ProductDao productDao;
    //业务层注入Dao类
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void save(Product product){
        System.out.println("Service执行了。。。");
        productDao.save(product);
    }

}
