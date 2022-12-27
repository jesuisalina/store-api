package com.store_api.dba;

import com.store_api.rest.api.Product;
import com.store_api.rest.api.ProductCategory;

import java.io.IOException;
import java.util.List;

public interface ProductProvider {
    List<Product> GetByCategory(ProductCategory category) throws IOException;
}
