INSERT INTO users ( user_id, username, password, role)
VALUES ( 1, 'admin',      'QWERTY',    'ROLE_ADMIN'),
       ( 2, 'Elon Musk',  'QWERTY',    'ROLE_USER' ),
       ( 3, 'Jeff Bezos', 'QWERTY',    'ROLE_USER' ),
       ( 4, 'Bill Gates', 'notQWERTY', 'ROLE_USER' );

INSERT INTO menu (menu_id, place_id, created_at)
VALUES (1, 1,  (now() - INTERVAL '1 days')),
       (2, 2,  (now() - INTERVAL '1 days')),
       (3, 3,  (now() - INTERVAL '1 days')),
       (4, 1,  now()),
       (5, 2,  now()),
       (6, 3,  now());


INSERT INTO menu_items (menu_id,  price, created_at, food_name)
VALUES VALUES (  01,   0.30, (now() - INTERVAL '1 days')),'Asparagus'       ),
              (  01,   3.34, (now() - INTERVAL '1 days')),'Biscuits'        ),
              (  03,   1.30, (now() - INTERVAL '1 days')),'Bread'           ),
              (  02,   9.30, (now() - INTERVAL '1 days')),'Burrito',        ),
              (  01,   0.20, (now() - INTERVAL '1 days')),'Cabbage'         ),
              (  01,   5.49, (now() - INTERVAL '1 days')),'Mashed potatoes' ),
              (  03,  15.20, (now() - INTERVAL '1 days')),'Pork'            ),
              (  03,  16.10, (now() - INTERVAL '1 days')),'Fish'            ),
              (  02,   9.99, (now() - INTERVAL '1 days')),'Donut'           ),
              (  01,   5.49, (now() - INTERVAL '1 days')),'Mashed potatoes' ),
              (  04,  15.20, now()                       ,'Banana'          ),
              (  05,  16.10, now()                       ,'Peanut butter'   ),
              (  06,  16.10, now()                       ,'Fried worms'     );


INSERT INTO votes (user_id, place_id, created_at)
VALUES (2, 1, (now() - INTERVAL '1 days'))),
       (3, 2, (now() - INTERVAL '1 days'))),
       (4, 2, (now() - INTERVAL '1 days'))),
       (2, 1, now()),
	   (3, 1, now()),
       (4, 2, now());

INSERT INTO places (place_id, created_at, name)
VALUES (01,  now(), 'Home food court' ),
       (02,  now(), 'JunkDonalds'     ),
       (03,  now(), 'Allergy fryes'   );
