INSERT INTO users ( user_id, username, password, role, created_at)
VALUES ( 1, 'admin',      'admin',     'ROLE_ADMIN', now()),
       ( 2, 'Elon Musk',  'QWERTY',    'ROLE_USER',  now()),
       ( 3, 'Jeff Bezos', 'QWERTY',    'ROLE_USER',  now()),
       ( 4, 'Bill Gates', 'notQWERTY', 'ROLE_USER',  now());

INSERT INTO menu (menu_id, place_id, created_at)
VALUES (1, 1,  now()),
       (2, 2,  now()),
       (3, 3,  now());

INSERT INTO menu_items (menu_id,  price, created_at, food_name)
VALUES (  01,   0.30, now(),'Asparagus'       ),
       (  01,   3.34, now(),'Biscuits'        ),
       (  03,   1.30, now(),'Bread'           ),
       (  02,   9.30, now(),'Burrito',        ),
       (  01,   0.20, now(),'Cabbage'         ),
       (  01,   5.49, now(),'Mashed potatoes' ),
       (  03,  15.20, now(),'Pork'            ),
       (  03,  16.10, now(),'Fish'            ),
       (  02,   9.99, now(),'Donut'           );

INSERT INTO votes (user_id, place_id, created_at)
VALUES (2, 1, now()),
       (3, 2, now()),
       (4, 2, now());

INSERT INTO places (place_id, created_at, name)
VALUES (01,  now(), 'Home food court' ),
       (02,  now(), 'JunkDonalds'     ),
       (03,  now(), 'Allergy fryes'   );
