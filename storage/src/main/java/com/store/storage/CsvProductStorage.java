package com.store.storage;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Builder
@AllArgsConstructor
public class CsvProductStorage implements ProductStorage {
    final private String delimiter;
    final private String fileName;


    @Override
    public List<Product> getAll() throws IOException {
        var products = new LinkedList<Product>();
        try (var br = new BufferedReader(new FileReader(fileName))) {
            br.lines().forEach(line -> {
                String[] values = line.split(delimiter);
                var product = map(values);
                products.add(product);
            });
        }
        return products;
    }

    private Product map(String[] values) {
        return new Product(
                Integer.parseInt(values[0]),
                values[1],
                values[2].replaceAll("\\s", ""),
                Double.parseDouble(values[3])
        );
    }
}
