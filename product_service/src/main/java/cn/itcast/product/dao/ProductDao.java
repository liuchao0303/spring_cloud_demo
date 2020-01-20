package cn.itcast.product.dao;

import cn.itcast.product.entity.Product;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @parm By 2020/1/1
 */
public interface ProductDao extends JpaRepository<Product,Long> , JpaSpecificationExecutor<Product> {
}
