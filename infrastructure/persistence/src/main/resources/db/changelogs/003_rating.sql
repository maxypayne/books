--liquibase formatted sql
--changeset maxim:rating

CREATE TABLE rating
(
    id         SERIAL PRIMARY KEY,
    product_id INTEGER REFERENCES product (id) ON DELETE CASCADE,
    user_id    INTEGER REFERENCES "user" (id) ON DELETE CASCADE,
    score      INTEGER NOT NULL CHECK (score BETWEEN 1 AND 5),
    comment    TEXT,
    UNIQUE (user_id, product_id)
);

--rollback DROP TABLE rating;