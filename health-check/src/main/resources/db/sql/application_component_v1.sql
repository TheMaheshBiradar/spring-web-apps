--liquibase formatted sql

--changeset Mahesh:1
create table TABLE_COM_STATUS_URL (
    COMPONENT_ID VARCHAR2(10) NOT NULL ,
    ENVIONMENT_ID VARCHAR2(10) NOT NULL ,
    URL VARCHAR2(2048) NOT NULL ,
    ACTIVE_FL NUMBER  DEFAULT 1
);

--changeset Mahesh:5
insert into TABLE_COM_STATUS_URL(COMPONENT_ID,ENVIONMENT_ID,URL,ACTIVE_FL) VALUES ('GOOG','PROD','https://google.com',1);

