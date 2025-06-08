package com.mlucov.business.save;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@Transactional
public class UploadImageUseCase implements UploadImageApi {
    private final ImageStorageGateway imageStorageGateway;

    public UploadImageUseCase(ImageStorageGateway imageStorageGateway) {
        this.imageStorageGateway = imageStorageGateway;
    }

    @Override
    public String upload(MultipartFile file) throws IOException {
        return imageStorageGateway.upload(file);
    }
}
