package com.store_api.rest.friuts.api;

import com.store_api.rest.api.Product;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface FruitMapper {
    Fruit map(Product product);
}
