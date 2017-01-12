package com.sshdemo.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sshdemo.ssh.domain.Product;
import com.sshdemo.ssh.service.ProductService;

/**
 * Created by wade1 on 2017-01-11.
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product> {
    //模型驱动使用的类
    private Product product = new Product();

    @Override
    public Product getModel() {
        return product;
    }
    //按名称自动注入业务层类
    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public String save(){
        System.out.println("Action执行完成...");
        productService.save(product);
        return NONE;
    }

}
