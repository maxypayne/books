package com.mlucov.business.save;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageStorageGateway {
    String upload(MultipartFile file) throws IOException;
}