package com.mlucov.business.save;

import com.mlucov.models.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SaveBookUseCase implements ISaveBookGatewayApi {
    private final ISaveBookRepositoryGateway iSaveBookRepositoryGateway;

    public SaveBookUseCase(ISaveBookRepositoryGateway iSaveBookRepositoryGateway) {
        this.iSaveBookRepositoryGateway = iSaveBookRepositoryGateway;
    }

    @Override
    public Integer saveBook(SaveBookInput input) {
        Book book = new Book();
        book.setName(input.name());
        book.setISBN(input.isbn());
        return this.iSaveBookRepositoryGateway.saveBook(book).getId();
    }
}
