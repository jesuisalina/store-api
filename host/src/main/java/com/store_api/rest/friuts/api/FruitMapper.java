package com.store_api.rest.friuts.api;

import com.store.storage.Product;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface FruitMapper {
    Fruit map(Product product);
}
