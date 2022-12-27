package com.store.storage;

public record Product(
        int id,
        String title,
        String category,
        double price) {
}
