package cn.itcast.product.service.impl;

import cn.itcast.product.dao.ProductDao;
import cn.itcast.product.entity.Product;
import cn.itcast.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @parm By 2020/1/1
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao dao;

    @Override
    public Product queryById(Long id) {
        return dao.findById(id).get();
    }
}
