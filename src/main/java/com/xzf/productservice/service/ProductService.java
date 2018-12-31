package com.xzf.productservice.service;


import com.xzf.productservice.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);


}
