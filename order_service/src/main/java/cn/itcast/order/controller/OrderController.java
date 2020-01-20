package cn.itcast.order.controller;

import cn.itcast.order.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @parm By 2020/1/1
 */
@RequestMapping("/order")
@RestController
public class OrderController {


    @Autowired
    private RestTemplate restTemplate;

    /**
     * 注入springCloud提供的获取提供服务的工具类
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @RequestMapping(value = "/buy/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable Long id){
        //使用discoveryClient工具类获取服务对象
        //List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
        //Product forObject = restTemplate.getForObject("http://192.0.0.1:9001/product/"+id, Product.class);
        //Product forObject = restTemplate.getForObject("http://"+instances.get(0).getHost()+":"+instances.get(0).getPort()+"/product/"+id,Product.class);
        System.out.println("访问地址："+ip);
        Product forObject = restTemplate.getForObject("http://service-product/product" + id, Product.class);
        return forObject;
    }
}
