package com.mlucov.business.save;

import com.mlucov.business.save.models.BooksOutput;
import com.mlucov.models.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@Transactional
public class BookUseCase implements IBookGatewayApi {
    private final IBookGateway gateway;
    private final ImageStorageGateway imageStorageGateway;

    public BookUseCase(IBookGateway gateway, ImageStorageGateway imageStorageGateway) {
        this.gateway = gateway;
        this.imageStorageGateway = imageStorageGateway;
    }

    @Override
    public List<BooksOutput> getAllBooks() {
        return this.gateway.getAllBooks().stream().map(x -> new BooksOutput(x.getId(), x.getName(), x.getISBN())).toList();
    }

    @Override
    public Integer saveBook(SaveBookInput input) {
//        String imagKey = this.imageStorageGateway.upload();

        Book book = new Book();
        book.setName(input.name());
        book.setISBN(input.isbn());
//        for (MultipartFile file: input.files()) {
//            String imagKey = this.imageStorageGateway.upload();

//        }
        return this.gateway.saveBook(book).getId();
    }
}
