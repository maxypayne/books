package com.mlucov.repository.save;

import com.mlucov.business.save.ISaveBookRepositoryGateway;
import com.mlucov.models.Book;
import org.springframework.stereotype.Repository;

@Repository
public class SaveBookRepository implements ISaveBookRepositoryGateway {
    private final ISaveBookJpaRepository iSaveBookJpaRepository;

    public SaveBookRepository(ISaveBookJpaRepository iSaveBookJpaRepository) {
        this.iSaveBookJpaRepository = iSaveBookJpaRepository;
    }
    @Override
    public Book saveBook(Book book) {
        return this.iSaveBookJpaRepository.save(book);
    }
}
