package com.mlucov.models.response;

import java.util.List;

public record PaginatedResponse<T>(
    long total,
    List<T> data
) {
}
