package com.mlucov.repository.save;

import com.mlucov.business.save.IBookGateway;
import com.mlucov.models.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository implements IBookGateway {
    private final IBookJpaRepository repository;

    public BookRepository(IBookJpaRepository repository) {
        this.repository = repository;
    }
    @Override
    public Book saveBook(com.mlucov.models.Book book) {
        return this.repository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }
}
