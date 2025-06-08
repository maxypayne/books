package com.mlucov.controllers;

import com.mlucov.business.save.IBookGatewayApi;
import com.mlucov.business.save.SaveBookInput;
import com.mlucov.business.save.UploadImageApi;
import com.mlucov.business.save.models.BooksOutput;
import com.mlucov.mappers.SaveBookMapper;
import com.mlucov.models.request.SaveBookRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final IBookGatewayApi iBookGatewayApi;
    private final UploadImageApi uploadImageApi;
    private final SaveBookMapper saveBookMapper;

    public BookController(
        IBookGatewayApi iBookGatewayApi, UploadImageApi uploadImageApi,
        SaveBookMapper saveBookMapper
    ) {
        this.iBookGatewayApi = iBookGatewayApi;
        this.uploadImageApi = uploadImageApi;
        this.saveBookMapper = saveBookMapper;
    }

    @GetMapping
    public List<BooksOutput> getAllBooks() {
        return this.iBookGatewayApi.getAllBooks();
    }

    @PostMapping("/save")
    public Integer saveBook(@RequestBody SaveBookRequest request) {
        SaveBookInput input = this.saveBookMapper.toSaveBookInput(request);
        return this.iBookGatewayApi.saveBook(input);
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            String res = this.uploadImageApi.upload(file);
            System.out.println(res);
            return ResponseEntity.ok("File uploaded successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Upload failed: " + e.getMessage());
        }
    }
}
