INSERT INTO suvepidu.role (id, name) VALUES (default, 'tavakasutaja');
INSERT INTO suvepidu.role (id, name) VALUES (default, 'korraldaja');

INSERT INTO suvepidu."user" (id, role_id, username, password, status) VALUES (default, 1, 'maarek', '123', 'A');
INSERT INTO suvepidu."user" (id, role_id, username, password, status) VALUES (default, 2, 'admin', '123', 'A');
INSERT INTO suvepidu."user" (id, role_id, username, password, status) VALUES (default, 1, 'rain', '123', 'D');

