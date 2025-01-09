package com.mlucov.repository.save;

import com.mlucov.business.save.ISaveBookRepositoryGateway;
import com.mlucov.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ISaveBookJpaRepository extends JpaRepository<Book, Integer> {
}
