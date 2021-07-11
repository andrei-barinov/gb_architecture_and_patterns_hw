drop table if exists users cascade;
create table users(
                      id bigserial primary key,
                      first_name varchar(255) not null,
                      last_name varchar(255) not null,
                      login varchar(255) not null,
                      password varchar(255) not null,
                      phone_number varchar(255),
                      password_2 varchar(255) not null
);

INSERT INTO users VALUES (1,
                          'Иванов',
                          'Сергей',
                          'ivanov_sergey@mail.com',
                          '$2a$10$8XBuvrPULsABNRyTkCZ8we5pm7pHU2DvPu5s6uU6KNQYvVKVEV5my',
                          '+79503743875',
                          'manager1');