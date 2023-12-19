CREATE SEQUENCE IF NOT EXISTS hibernate_sequence;
CREATE TABLE IF NOT EXISTS DEMO (
    id bigserial not null primary key,
    name varchar not null
);