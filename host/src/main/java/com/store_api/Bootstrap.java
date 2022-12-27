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
        return CsvProductStorage
                .builder()
                .delimiter(",")
                .fileName("data/products.csv")
                .build();
    }
}
