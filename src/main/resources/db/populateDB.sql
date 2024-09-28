INSERT INTO users ( id, username, password, role)
VALUES ( 1, 'admin',      'QWERTY',    'ADMIN'),
       ( 2, 'Elon Musk',  'QWERTY',    'USER' ),
       ( 3, 'Jeff Bezos', 'QWERTY',    'USER' ),
       ( 4, 'Bill Gates', 'notQWERTY', 'USER' );

INSERT INTO menu (id, place_id, created_at)
VALUES (1, 1,  (now() - INTERVAL '1 days')),
       (2, 2,  (now() - INTERVAL '1 days')),
       (3, 3,  (now() - INTERVAL '1 days')),
       (4, 1,  now()),
       (5, 2,  now()),
       (6, 3,  now());


INSERT INTO menu_entry (id, menu_id,  price, created_at, name)
VALUES ( 01,  01,   0.30, (now() - INTERVAL '1 days')),'Asparagus'       ),
       ( 02,  01,   3.34, (now() - INTERVAL '1 days')),'Biscuits'        ),
       ( 03,  03,   1.30, (now() - INTERVAL '1 days')),'Bread'           ),
       ( 04,  02,   9.30, (now() - INTERVAL '1 days')),'Burrito',        ),
       ( 05,  01,   0.20, (now() - INTERVAL '1 days')),'Cabbage'         ),
       ( 06,  01,   5.49, (now() - INTERVAL '1 days')),'Mashed potatoes' ),
       ( 07,  03,  15.20, (now() - INTERVAL '1 days')),'Pork'            ),
       ( 08,  03,  16.10, (now() - INTERVAL '1 days')),'Fish'            ),
       ( 09,  02,   9.99, (now() - INTERVAL '1 days')),'Donut'           ),
       ( 10,  04,   5.49, now()                       ,'Mashed potatoes' ),
       ( 11,  04,  15.20, now()                       ,'Banana'          ),
       ( 12,  05,  16.11, now()                       ,'Peanut butter'   ),
       ( 13,  06,  16.10, now()                       ,'Fried worms'     );



INSERT INTO vote (user_id, place_id, created_at)
VALUES (2, 1, (now() - INTERVAL '1 days'))),
       (3, 2, (now() - INTERVAL '1 days'))),
       (4, 2, (now() - INTERVAL '1 days'))),
       (2, 1, now()),
	   (3, 1, now()),
       (4, 2, now());

INSERT INTO place (id, created_at, name)
VALUES (01,  now(), 'Home food court' ),
       (02,  now(), 'JunkDonalds'     ),
       (03,  now(), 'Allergy fryes'   );
