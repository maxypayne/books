--liquibase formatted sql
--changeset maxim:my-book-table

CREATE TABLE book
(
    id  SERIAL PRIMARY KEY,
    name VARCHAR(255),
    isbn VARCHAR(255)
);

--rollback DROP TABLE book;