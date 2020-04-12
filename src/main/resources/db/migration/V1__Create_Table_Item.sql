drop table if exists item cascade;

drop sequence if exists hibernate_sequence;

create sequence hibernate_sequence start 1 increment 1;

create table item (id int8 not null, name varchar(255), primary key (id));
