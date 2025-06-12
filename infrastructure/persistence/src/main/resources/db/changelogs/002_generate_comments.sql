-- liquibase formatted sql
-- changeset maxim:my-book-table2

DO $$
    DECLARE
        i INT;
        product_id_loop INT;
        num_comments INT;
        random_user_id INT;
        random_rating DECIMAL(2,1);
        comment_title VARCHAR(255);
        comment_content TEXT;
        is_recommended_bool BOOLEAN;
    BEGIN
        FOR product_id_loop IN 1..100 LOOP
                -- Generate between 1 and 5 comments per product
                num_comments := floor(random() * 5) + 1; -- 1 to 5 comments

                FOR i IN 1..num_comments LOOP
                        -- Random user ID from 1 to 10
                        random_user_id := floor(random() * 10) + 1;

                        -- Random rating between 1.0 and 5.0 in 0.5 increments
                        random_rating := (floor(random() * 9) + 2) * 0.5; -- Generates 1.0, 1.5, ..., 5.0

                        -- Determine title and content based on rating
                        IF random_rating >= 4.0 THEN
                            comment_title := (ARRAY['Excellent!', 'Highly Recommend', 'Fantastic Product', 'Love it!', 'Great Value'])[floor(random() * 5) + 1];
                            comment_content := (ARRAY['Absolutely love this product! It works perfectly and is exactly what I needed. Highly recommended!',
                                'Amazing quality and features. Exceeded my expectations. Will definitely buy again.',
                                'Couldn''t be happier with this purchase. Flawless performance and great design.',
                                'This product is a game-changer! So glad I bought it.',
                                'Performs wonderfully. A solid purchase and worth every penny.'])[floor(random() * 5) + 1];
                            is_recommended_bool := TRUE;
                        ELSIF random_rating >= 2.5 AND random_rating <= 3.5 THEN
                            comment_title := (ARRAY['Decent, but flaws', 'Could be better', 'Average Product', 'Okay for the price', 'Mixed feelings'])[floor(random() * 5) + 1];
                            comment_content := (ARRAY['It''s alright, does the job but nothing special. Expected a bit more given the price.',
                                'Works, but has some noticeable issues. Not sure if I''d buy again.',
                                'Serviceable, but not groundbreaking. You get what you pay for.',
                                'Not bad, but not great either. It meets basic needs.',
                                'Has its pros and cons. Weigh your options before buying.'])[floor(random() * 5) + 1];
                            is_recommended_bool := (random() > 0.5); -- 50/50 chance
                        ELSE -- random_rating < 2.5
                            comment_title := (ARRAY['Disappointing', 'Not as expected', 'Poor Quality', 'Avoid This', 'Waste of Money'])[floor(random() * 5) + 1];
                            comment_content := (ARRAY['The product broke quickly and didn''t meet my expectations. Very unhappy with this purchase.',
                                'Received damaged, functionality is poor.',
                                'Waste of money, would not recommend.',
                                'Terrible experience. This product did not work at all for me.',
                                'Very disappointed with the quality and performance.'])[floor(random() * 5) + 1];
                            is_recommended_bool := FALSE; -- Almost always FALSE for low ratings
                        END IF;

                        INSERT INTO comment (user_id, product_id, content, rating, title, is_recommended) VALUES
                            (random_user_id, product_id_loop, comment_content, random_rating, comment_title, is_recommended_bool);
                    END LOOP;
            END LOOP;
    END $$;