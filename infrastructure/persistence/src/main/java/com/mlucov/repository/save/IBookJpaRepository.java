package com.mlucov.repository.save;

import com.mlucov.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IBookJpaRepository extends JpaRepository<Book, Integer> {
}
