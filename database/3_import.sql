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

INSERT INTO suvepidu.county (id, county) VALUES (default, 'Harju maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Hiiu maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Ida-Viru maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Jõgeva maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Järva maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Lääne-Viru maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Lääne maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Põlva maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Pärnu maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Rapla maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Saare maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Tartu maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Valga maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Viljandi maakond');
INSERT INTO suvepidu.county (id, county) VALUES (default, 'Võru maakond');

INSERT INTO suvepidu.main_event (id, business_id, title, description, image_data, status) VALUES (default, 1, 'Suvegrill 2024', 'description bla bla', 'asdasada', 'A');

INSERT INTO suvepidu.event_detail (id, main_event_id, county_id, date, start_time, end_time, address, longitude, latitude) VALUES (1, 1, 1, '2024-04-08', '13:44:12', '13:44:15', 'Aadress', 12.000000, 21.000000);