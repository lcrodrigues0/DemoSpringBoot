create table if not exists demo
(
    id          bigint auto_increment primary key,
    file_name   varchar(255),
    data        blob,
    content_type varchar(255)
);