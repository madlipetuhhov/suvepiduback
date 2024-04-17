INSERT INTO suvepidu.role (id, name) VALUES (default, 'tavakasutaja');
INSERT INTO suvepidu.role (id, name) VALUES (default, 'korraldaja');

INSERT INTO suvepidu."user" (id, role_id, username, password, status) VALUES (default, 1, 'maarek', '123', 'A');
INSERT INTO suvepidu."user" (id, role_id, username, password, status) VALUES (default, 2, 'admin', '123', 'A');
INSERT INTO suvepidu."user" (id, role_id, username, password, status) VALUES (default, 1, 'rain', '123', 'D');

INSERT INTO suvepidu.business (id, user_id, company_name, phone, email, registry_code, vat_number, status) VALUES (default, 2, 'maarek OÜ', '123', 'maarek@maarek.ee', '123', '123', 'A');
