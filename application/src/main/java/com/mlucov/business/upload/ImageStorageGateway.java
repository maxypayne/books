package com.mlucov.business.upload;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageStorageGateway {
    String upload(MultipartFile file);
}