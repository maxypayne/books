package com.mlucov.business.save;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public record SaveBookInput(
    String name,
    String isbn
//    List<MultipartFile> files
) {
}
