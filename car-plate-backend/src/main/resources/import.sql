INSERT INTO person (id, username, password,created_date) VALUES (1, 'ahmet', 'MyPassord','2001-07-13');
INSERT INTO person (id, username, password,created_date) VALUES (2, 'Metin', 'Thpassword','2001-07-13');
INSERT INTO plate (id, plate_number, star,star_count) VALUES (1, '42EGK79', '5',1);
INSERT INTO plate (id, plate_number, star,star_count) VALUES (2, '06EGK79', '5',1);
INSERT INTO plate (id, plate_number, star,star_count) VALUES (3, '07EGK79', 4.4,1);
INSERT INTO plate (id, plate_number, star,star_count) VALUES (4, '11EGK79', 3,1);
INSERT INTO plate (id, plate_number, star,star_count) VALUES (5, '34EGK79',2,1);
INSERT INTO plate (id, plate_number, star,star_count) VALUES (6, '42YG79', 3,1);
INSERT INTO plate (id, plate_number, star,star_count) VALUES (7, '06EGR78', 3,1);
INSERT INTO plate (id, plate_number, star,star_count) VALUES (8, '81RTG34', 8,2);
INSERT INTO comment (id, text, star) VALUES (1, 'Ehliyeti  kasaptan almış olsa gerek', 1);
INSERT INTO comment (id, text, star) VALUES (2, 'Ne desem ki', 1);

INSERT INTO plate_comment_list ( plate_id,comment_list_id) VALUES (1, 1);
INSERT INTO plate_comment_list ( plate_id,comment_list_id) VALUES (1, 2);