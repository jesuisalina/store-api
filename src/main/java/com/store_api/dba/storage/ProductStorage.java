package com.store_api.dba.storage;

import com.store_api.rest.api.Product;
import java.io.IOException;
import java.util.List;

public interface ProductStorage {
    List<Product> getAll() throws IOException;
}
