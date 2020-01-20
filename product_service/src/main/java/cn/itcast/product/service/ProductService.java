package cn.itcast.product.service;

import cn.itcast.product.entity.Product;

import java.awt.print.Pageable;

/**
 * @parm By 2020/1/1
 */
public interface ProductService {

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    Product queryById (Long id);

}
