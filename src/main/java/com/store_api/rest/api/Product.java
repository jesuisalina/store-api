package com.store_api.rest.api;

public record Product(
        int id,
        String title,
        String category,
        double price) {
}
