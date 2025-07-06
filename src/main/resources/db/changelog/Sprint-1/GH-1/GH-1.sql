-- liquibase formatted sql

--changeset Rushikesh Malvadkar:1-create-test-table
CREATE TABLE test (
    id bigint auto_increment primary key,
    name VARCHAR(100) NOT NULL UNIQUE
);