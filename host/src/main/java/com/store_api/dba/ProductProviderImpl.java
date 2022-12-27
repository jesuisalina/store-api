package com.store_api.dba;

import com.store.storage.Product;
import com.store.storage.ProductCategory;
import com.store.storage.ProductStorage;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class ProductProviderImpl implements ProductProvider {
    @Autowired
    ProductStorage productStorage;

    @Override
    public List<Product> GetByCategory(ProductCategory category) throws IOException {
        var products = productStorage.getAll();
        return products.stream().filter(c -> Objects.equals(c.category(), "Fruit")).toList();
    }
}
