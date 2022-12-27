package com.store_api.dba;

import com.store.storage.Product;
import com.store.storage.ProductCategory;

import java.io.IOException;
import java.util.List;

public interface ProductProvider {
    List<Product> GetByCategory(ProductCategory category) throws IOException;
}
