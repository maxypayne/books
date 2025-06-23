package com.mlucov.business;

import java.util.List;

public record PaginatedOutput<T>(
    long total,
    List<T> data
) {
}
