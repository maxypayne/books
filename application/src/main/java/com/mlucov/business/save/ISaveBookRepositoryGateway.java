package com.mlucov.business.save;

import com.mlucov.models.Book;

public interface ISaveBookRepositoryGateway {
    Book saveBook(Book book);
}
