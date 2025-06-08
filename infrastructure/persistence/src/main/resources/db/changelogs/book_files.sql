--liquibase formatted sql
--changeset maxim:my-test

CREATE TABLE file
(
    id        SERIAL PRIMARY KEY,
    file_name VARCHAR(255),
    book_id   INTEGER REFERENCES book (id) ON DELETE CASCADE
);

--rollback DROP TABLE book;