package com.mlucov.controllers;

import com.mlucov.business.save.IBookGatewayApi;
import com.mlucov.business.save.SaveBookInput;
import com.mlucov.business.save.models.BooksOutput;
import com.mlucov.mappers.SaveBookMapper;
import com.mlucov.models.request.SaveBookRequest;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final IBookGatewayApi iBookGatewayApi;
    private final SaveBookMapper saveBookMapper;

    public BookController(
        IBookGatewayApi iBookGatewayApi,
        SaveBookMapper saveBookMapper
    ) {
        this.iBookGatewayApi = iBookGatewayApi;
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
}
