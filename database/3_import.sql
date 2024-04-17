INSERT INTO suvepidu.role (id, name) VALUES (default, 'tavakasutaja');
INSERT INTO suvepidu.role (id, name) VALUES (default, 'korraldaja');

INSERT INTO suvepidu."user" (id, role_id, username, password, status) VALUES (default, 1, 'maarek', '123', 'A');
INSERT INTO suvepidu."user" (id, role_id, username, password, status) VALUES (default, 2, 'korraldaja', '123', 'A');
INSERT INTO suvepidu."user" (id, role_id, username, password, status) VALUES (default, 1, 'rain', '123', 'D');

INSERT INTO suvepidu.business (id, user_id, company_name, phone, email, registry_code, vat_number, status) VALUES (default, 2, 'maarek OÜ', '123', 'maarek@maarek.ee', '123', '123', 'A');
INSERT INTO suvepidu.business (id, user_id, company_name, phone, email, registry_code, vat_number, status) VALUES (default, 2, 'riigo OÜ', '321', 'riigo@riigo.ee', '321', '321', 'A');

INSERT INTO suvepidu.feature (id, name) VALUES (default, 'parkimine');
INSERT INTO suvepidu.feature (id, name) VALUES (default, 'toitlustus');
INSERT INTO suvepidu.feature (id, name) VALUES (default, 'lõbustused lastele');
INSERT INTO suvepidu.feature (id, name) VALUES (default, 'loomad lubatud');
INSERT INTO suvepidu.feature (id, name) VALUES (default, 'vanusepiiranguga');
INSERT INTO suvepidu.feature (id, name) VALUES (default, 'alkohol lubatud');

INSERT INTO suvepidu.category (id, name) VALUES (default, 'muusika');
INSERT INTO suvepidu.category (id, name) VALUES (default, 'teater');
INSERT INTO suvepidu.category (id, name) VALUES (default, 'töötuba');
INSERT INTO suvepidu.category (id, name) VALUES (default, 'festival');
INSERT INTO suvepidu.category (id, name) VALUES (default, 'sport');
INSERT INTO suvepidu.category (id, name) VALUES (default, 'loodus');

