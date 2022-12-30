package com.store_api;

import com.store.storage.CsvProductStorage;
import com.store.storage.ProductStorage;
import com.store_api.dba.ProductProvider;
import com.store_api.dba.ProductProviderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class Bootstrap {
    @Bean
    public ProductProvider productProvider() {
        return new ProductProviderImpl();
    }

    @Bean
    public ProductStorage storage() {
        var fileUrl = getClass()
                .getClassLoader()
                .getResource("products.csv");
        if(fileUrl == null) {
            throw new IllegalStateException("Not found file products.csv");
        }
        return CsvProductStorage
                .builder()
                .delimiter(",")
                .fileName(fileUrl.getPath())
                .build();
    }
}
