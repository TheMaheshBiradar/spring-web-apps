ALTER TABLE HR.OPP_T_SETTING_COUNTRY DROP PRIMARY KEY CASCADE;

DROP TABLE HR.OPP_T_SETTING_COUNTRY CASCADE CONSTRAINTS;

CREATE TABLE HR.OPP_T_SETTING_COUNTRY (

COUNTRY_CD                    VARCHAR2(2 BYTE)  NOT NULL,
SETTING_TYPE_ID               VARCHAR2(100 BYTE)  NOT NULL,
VALUE                      VARCHAR2(1000 BYTE)  NOT NULL
);



CREATE UNIQUE INDEX HR.OPP_PK_SETTING_COUNTRY ON HR.OPP_T_SETTING_COUNTRY
(COUNTRY_CD,SETTING_TYPE_ID);

ALTER TABLE HR.OPP_T_SETTING_COUNTRY ADD (
CONSTRAINT OPP_PK_SETTING_COUNTRY
PRIMARY KEY
  (COUNTRY_CD,SETTING_TYPE_ID)
  ENABLE VALIDATE
);