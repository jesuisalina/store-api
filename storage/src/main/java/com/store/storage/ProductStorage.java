package com.store.storage;

import java.io.IOException;
import java.util.List;

public interface ProductStorage {
    List<Product> getAll() throws IOException;
}
