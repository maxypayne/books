-- 1. USERS
CREATE TABLE users
(
    id         SERIAL PRIMARY KEY,
    username   VARCHAR(50) UNIQUE  NOT NULL,
    email      VARCHAR(100) UNIQUE NOT NULL,
    password   VARCHAR(100)        NOT NULL,
    created_at TIMESTAMP DEFAULT NOW()
);

-- 2. PRODUCTS
CREATE TABLE products
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(100)   NOT NULL,
    description TEXT,
    price       DECIMAL(10, 2) NOT NULL,
    created_at  TIMESTAMP DEFAULT NOW()
);

-- 3. CATEGORIES
CREATE TABLE categories
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50) UNIQUE NOT NULL
);

-- 4. PRODUCT_CATEGORIES (many-to-many)
CREATE TABLE product_categories
(
    product_id  INT REFERENCES products (id),
    category_id INT REFERENCES categories (id),
    PRIMARY KEY (product_id, category_id)
);

-- 5. COMMENTS
CREATE TABLE comments
(
    id         SERIAL PRIMARY KEY,
    user_id    INT REFERENCES users (id),
    product_id INT REFERENCES products (id),
    content    TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT NOW()
);

-- 6. RATINGS
CREATE TABLE ratings
(
    id         SERIAL PRIMARY KEY,
    user_id    INT REFERENCES users (id),
    product_id INT REFERENCES products (id),
    score      INT CHECK (score >= 1 AND score <= 5),
    created_at TIMESTAMP DEFAULT NOW()
);

-- 7. ORDERS
CREATE TABLE orders
(
    id         SERIAL PRIMARY KEY,
    user_id    INT REFERENCES users (id),
    status     VARCHAR(20) DEFAULT 'PENDING',
    total      DECIMAL(10, 2),
    created_at TIMESTAMP   DEFAULT NOW()
);

-- 8. ORDER_ITEMS
CREATE TABLE order_items
(
    id         SERIAL PRIMARY KEY,
    order_id   INT REFERENCES orders (id),
    product_id INT REFERENCES products (id),
    quantity   INT            NOT NULL,
    unit_price DECIMAL(10, 2) NOT NULL
);

-- 9. ADDRESSES
CREATE TABLE addresses
(
    id          SERIAL PRIMARY KEY,
    user_id     INT REFERENCES users (id),
    line1       VARCHAR(100),
    line2       VARCHAR(100),
    city        VARCHAR(50),
    postal_code VARCHAR(20),
    country     VARCHAR(50)
);

-- 10. FAVORITES
CREATE TABLE favorites
(
    user_id    INT REFERENCES users (id),
    product_id INT REFERENCES products (id),
    PRIMARY KEY (user_id, product_id)
);
