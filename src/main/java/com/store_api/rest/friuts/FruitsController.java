package com.store_api.rest.friuts;

import com.store_api.dba.ProductProvider;
import com.store_api.rest.api.ProductCategory;
import com.store_api.rest.friuts.api.Fruit;
import com.store_api.rest.friuts.api.FruitMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/fruits")
public class FruitsController {
    final ProductProvider productProvider;
    final FruitMapper mapper;

    public FruitsController(ProductProvider productProvider, FruitMapper mapper) {
        this.productProvider = productProvider;
        this.mapper = mapper;
    }

    @GetMapping
    public List<Fruit> GetAll() throws IOException {
        var products = productProvider.GetByCategory(ProductCategory.Fruit);
        var fruits = products.stream().map(mapper::map);
        return fruits.toList();
    }
}
