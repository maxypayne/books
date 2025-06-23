package com.mlucov.models;

import java.util.List;

public record Paginated<T>(
    long total,
    List<T> data
) {
}
