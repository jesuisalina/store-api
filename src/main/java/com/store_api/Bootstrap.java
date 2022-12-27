package com.store_api;

import com.store_api.dba.ProductProvider;
import com.store_api.dba.ProductProviderImpl;
import com.store_api.dba.storage.CsvProductStorage;
import com.store_api.dba.storage.ProductStorage;
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
        return CsvProductStorage
                .builder()
                .delimiter(",")
                .fileName("data/products.csv")
                .build();
    }
}
