package com.mlucov.business.save;

import com.mlucov.business.save.models.BooksOutput;
import com.mlucov.models.Book;

import java.util.List;

public interface IBookGatewayApi {
    Integer saveBook(SaveBookInput input);
    List<BooksOutput> getAllBooks();
}
