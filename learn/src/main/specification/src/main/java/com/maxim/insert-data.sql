-- USERS (5 users)
INSERT INTO users (username, email, password)
VALUES ('alice', 'alice@example.com', 'hashed_pwd1'),
       ('bob', 'bob@example.com', 'hashed_pwd2'),
       ('carol', 'carol@example.com', 'hashed_pwd3'),
       ('dave', 'dave@example.com', 'hashed_pwd4'),
       ('eve', 'eve@example.com', 'hashed_pwd5');

-- CATEGORIES (5)
INSERT INTO categories (name)
VALUES ('Electronics'),
       ('Books'),
       ('Home'),
       ('Fashion'),
       ('Toys');

-- PRODUCTS (10)
INSERT INTO products (name, description, price)
VALUES ('Smartphone', 'Latest model smartphone', 699.99),
       ('Laptop', 'Powerful laptop for work and play', 1299.00),
       ('Coffee Maker', 'Brew perfect coffee every morning', 89.90),
       ('T-shirt', 'Comfortable cotton T-shirt', 19.99),
       ('Board Game', 'Fun for the whole family', 34.50),
       ('Headphones', 'Wireless noise-cancelling headphones', 149.95),
       ('Backpack', 'Waterproof backpack for travel', 59.00),
       ('Cookbook', '100+ delicious recipes', 24.99),
       ('Smartwatch', 'Fitness and health tracking', 199.00),
       ('Desk Lamp', 'LED lamp with touch controls', 29.99);

-- PRODUCT_CATEGORIES (20)
INSERT INTO product_categories (product_id, category_id)
VALUES (1, 1),
       (2, 1),
       (3, 3),
       (4, 4),
       (5, 5),
       (6, 1),
       (7, 3),
       (8, 2),
       (9, 1),
       (10, 3),
       (1, 3),
       (4, 3),
       (5, 3),
       (6, 4),
       (7, 4),
       (2, 3),
       (3, 1),
       (9, 4),
       (8, 4),
       (10, 1);

-- ADDRESSES (5)
INSERT INTO addresses (user_id, line1, city, postal_code, country)
VALUES (1, '123 Main St', 'Paris', '75001', 'France'),
       (2, '456 Rue de Lyon', 'Lyon', '69000', 'France'),
       (3, '789 Bd Haussmann', 'Paris', '75008', 'France'),
       (4, '10 Downing St', 'London', 'SW1A 2AA', 'UK'),
       (5, '1600 Pennsylvania Ave', 'Washington', '20500', 'USA');

-- FAVORITES (10)
INSERT INTO favorites (user_id, product_id)
VALUES (1, 1),
       (1, 2),
       (2, 2),
       (2, 3),
       (3, 4),
       (3, 5),
       (4, 6),
       (4, 1),
       (5, 9),
       (5, 10);

-- COMMENTS (20)
INSERT INTO comments (user_id, product_id, content)
VALUES (1, 1, 'Great product!'),
       (2, 1, 'Loved it.'),
       (3, 2, 'Too expensive for me.'),
       (4, 2, 'Perfect for my needs.'),
       (5, 3, 'Makes great coffee.'),
       (1, 4, 'Not bad.'),
       (2, 5, 'Fun game!'),
       (3, 6, 'Sound quality is amazing.'),
       (4, 7, 'Very practical.'),
       (5, 8, 'Nice layout and pictures.'),
       (1, 9, 'Helps track fitness goals.'),
       (2, 10, 'Light and adjustable.'),
       (3, 5, 'Great for kids.'),
       (4, 1, 'Decent for the price.'),
       (5, 3, 'Better than expected.'),
       (1, 6, 'Love the design.'),
       (2, 8, 'Recipes are simple.'),
       (3, 9, 'Battery lasts long.'),
       (4, 10, 'Good for study room.'),
       (5, 4, 'Very comfortable.');

-- RATINGS (20)
INSERT INTO ratings (user_id, product_id, score)
VALUES (1, 1, 5),
       (2, 1, 4),
       (3, 2, 3),
       (4, 2, 5),
       (5, 3, 4),
       (1, 4, 3),
       (2, 5, 5),
       (3, 6, 5),
       (4, 7, 4),
       (5, 8, 3),
       (1, 9, 4),
       (2, 10, 5),
       (3, 5, 4),
       (4, 1, 3),
       (5, 3, 5),
       (1, 6, 4),
       (2, 8, 3),
       (3, 9, 5),
       (4, 10, 4),
       (5, 4, 4);

-- ORDERS (10)
INSERT INTO orders (user_id, status, total)
VALUES (1, 'PENDING', 719.98),
       (2, 'SHIPPED', 1398.90),
       (3, 'DELIVERED', 109.89),
       (4, 'PENDING', 54.49),
       (5, 'CANCELLED', 199.00),
       (1, 'DELIVERED', 89.90),
       (2, 'SHIPPED', 99.99),
       (3, 'PENDING', 124.49),
       (4, 'DELIVERED', 34.50),
       (5, 'PENDING', 259.95);

-- ORDER_ITEMS (15)
INSERT INTO order_items (order_id, product_id, quantity, unit_price)
VALUES (1, 1, 1, 699.99),
       (1, 10, 1, 19.99),
       (2, 2, 1, 1299.00),
       (2, 3, 1, 99.90),
       (3, 3, 1, 89.90),
       (3, 4, 1, 19.99),
       (4, 5, 1, 34.50),
       (4, 6, 1, 19.99),
       (5, 9, 1, 199.00),
       (6, 3, 1, 89.90),
       (7, 7, 1, 59.00),
       (7, 4, 2, 20.49),
       (8, 8, 1, 24.99),
       (8, 5, 1, 99.50),
       (9, 5, 1, 34.50);
