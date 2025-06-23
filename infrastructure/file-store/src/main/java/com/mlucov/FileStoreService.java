package com.mlucov;

import com.mlucov.business.upload.ImageStorageGateway;
import com.mlucov.exception.FileStorageException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.S3Exception;

import java.io.IOException;
import java.util.UUID;

@Component
public class FileStoreService implements ImageStorageGateway {
    private final S3Client s3Client;
    @Value("${aws.s3.bucket}")
    private String bucketName;

    public FileStoreService(S3Client s3Client) {
        this.s3Client = s3Client;
    }

    @Override
    public String upload(MultipartFile file) {
        String key = UUID.randomUUID() + "_" + file.getOriginalFilename();

        PutObjectRequest request = PutObjectRequest.builder()
            .bucket(bucketName)
            .key(key)
            .contentType(file.getContentType())
            .build();
        try {
            s3Client.putObject(request, RequestBody.fromBytes(file.getBytes()));
            return key;
        } catch (S3Exception e) {
            throw new FileStorageException("Failed to upload file to S3", e);
        } catch (IOException e) {
            throw new FileStorageException("Failed to process file content", e);
        }
    }
}
