package com.mlucov.business.save;

import com.mlucov.business.save.models.BooksOutput;
import com.mlucov.models.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookUseCase implements IBookGatewayApi {
    private final IBookGateway gateway;

    public BookUseCase(IBookGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<BooksOutput> getAllBooks() {
        return this.gateway.getAllBooks().stream().map(x -> new BooksOutput(x.getId(), x.getName(), x.getISBN())).toList();
    }

    @Override
    public Integer saveBook(SaveBookInput input) {
        Book book = new Book();
        book.setName(input.name());
        book.setISBN(input.isbn());
        return this.gateway.saveBook(book).getId();
    }
}
