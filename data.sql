--------------------------------------------------------
--  文件已创建 - 星期四-七月-25-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table Message
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."Message" 
   (	"Id" CHAR(8 BYTE), 
	"Mcontext" VARCHAR2(120 BYTE), 
	"Acontext" VARCHAR2(120 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table MessageOfLesson
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."MessageOfLesson" 
   (	"Cid" CHAR(8 BYTE), 
	"ProcessChart" VARCHAR2(120 BYTE), 
	"Outline" VARCHAR2(120 BYTE), 
	"ExperimentInstructer" VARCHAR2(120 BYTE), 
	"Click_rate" NUMBER(*,0) DEFAULT 0, 
	"Cname" VARCHAR2(20 BYTE), 
	"UploadTime" DATE, 
	"Ststus" CHAR(1 BYTE) DEFAULT 0, 
	"Label" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table MessageOfLessonOfStu
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."MessageOfLessonOfStu" 
   (	"Cid" CHAR(8 BYTE), 
	"Sid" CHAR(8 BYTE), 
	"Grade" NUMBER(*,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table Teacher_class
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."Teacher_class" 
   (	"Tid" CHAR(8 BYTE), 
	"Cid" CHAR(8 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TEST_USER
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."TEST_USER" 
   (	"USERNAME" VARCHAR2(20 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table USERS
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."USERS" 
   (	"ID" VARCHAR2(20 BYTE), 
	"PWD" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table InformationOfTea
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."InformationOfTea" 
   (	"Tid" CHAR(8 BYTE), 
	"Tname" VARCHAR2(20 BYTE), 
	"Tpwd" VARCHAR2(120 BYTE), 
	"Tpic" VARCHAR2(120 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table InformationOfStu
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."InformationOfStu" 
   (	"Sid" CHAR(8 BYTE), 
	"Sname" VARCHAR2(20 BYTE), 
	"Spwd" VARCHAR2(120 BYTE), 
	"Spic" VARCHAR2(120 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table IdOfBlog
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."IdOfBlog" 
   (	"Id" CHAR(8 BYTE), 
	"Pri_page" VARCHAR2(120 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table Excellent_class
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."Excellent_class" 
   (	"Cid" CHAR(8 BYTE), 
	"Work_label" VARCHAR2(120 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table Blog
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."Blog" 
   (	"Bid" CHAR(10 BYTE), 
	"Id" CHAR(8 BYTE), 
	"Blog" VARCHAR2(120 BYTE), 
	"Click_rate" NUMBER(*,0), 
	"SGrade" FLOAT(126) DEFAULT 0.0, 
	"Cname" VARCHAR2(30 BYTE), 
	"Cid" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ActivityOfStudent
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."ActivityOfStudent" 
   (	"Sid" CHAR(8 BYTE), 
	"Cid" CHAR(8 BYTE), 
	"Work_name" VARCHAR2(120 BYTE), 
	"Work_picture1" VARCHAR2(120 BYTE), 
	"Work_picture2" VARCHAR2(120 BYTE), 
	"Work_picture3" VARCHAR2(120 BYTE), 
	"Work_code" VARCHAR2(120 BYTE), 
	"Work_word" VARCHAR2(120 BYTE), 
	"Uploadtime" DATE, 
	"Grade" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table AboutLesson
--------------------------------------------------------

  CREATE TABLE "ZIYUAN"."AboutLesson" 
   (	"Cid" CHAR(8 BYTE), 
	"ppt" VARCHAR2(120 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into ZIYUAN."Message"
SET DEFINE OFF;
Insert into ZIYUAN."Message" ("Id","Mcontext","Acontext") values ('20144444',null,null);
Insert into ZIYUAN."Message" ("Id","Mcontext","Acontext") values ('20160748','jibuib','嘻嘻');
Insert into ZIYUAN."Message" ("Id","Mcontext","Acontext") values ('20155555','擦擦擦','阿达');
Insert into ZIYUAN."Message" ("Id","Mcontext","Acontext") values ('20166666',null,null);
Insert into ZIYUAN."Message" ("Id","Mcontext","Acontext") values ('20177777',null,null);
Insert into ZIYUAN."Message" ("Id","Mcontext","Acontext") values ('20160000',null,null);
Insert into ZIYUAN."Message" ("Id","Mcontext","Acontext") values ('10011111','dsad','大声道无');
Insert into ZIYUAN."Message" ("Id","Mcontext","Acontext") values ('10022222',null,null);
Insert into ZIYUAN."Message" ("Id","Mcontext","Acontext") values ('10033333',null,null);
Insert into ZIYUAN."Message" ("Id","Mcontext","Acontext") values ('10044444',null,null);
REM INSERTING into ZIYUAN."MessageOfLesson"
SET DEFINE OFF;
Insert into ZIYUAN."MessageOfLesson" ("Cid","ProcessChart","Outline","ExperimentInstructer","Click_rate","Cname","UploadTime","Ststus","Label") values ('002     ',null,null,null,7,'TypeScript',to_date('10-6月 -19','DD-MON-RR'),'1','语言');
Insert into ZIYUAN."MessageOfLesson" ("Cid","ProcessChart","Outline","ExperimentInstructer","Click_rate","Cname","UploadTime","Ststus","Label") values ('003     ',null,null,null,6,'python爬虫',to_date('10-6月 -19','DD-MON-RR'),'1','数据挖掘');
Insert into ZIYUAN."MessageOfLesson" ("Cid","ProcessChart","Outline","ExperimentInstructer","Click_rate","Cname","UploadTime","Ststus","Label") values ('005     ','胡苠杨柴顺李伟捷 sunny旅游管理系统.pdf','序列图协作图.docx','软件工程Sunny旅游系统实验报告_乐韦杨陆丁吴.wps',0,'软件工程',to_date('14-6月 -19','DD-MON-RR'),'1','实践');
Insert into ZIYUAN."MessageOfLesson" ("Cid","ProcessChart","Outline","ExperimentInstructer","Click_rate","Cname","UploadTime","Ststus","Label") values ('004     ','20160748胡苠杨实验八 图形编程.docx','20160748胡苠杨实验一基本命令的使用.docx','20160648 胡苠杨 20160786 彭阳 20161897 李伟捷 高级图形编程.rar',0,'linux',to_date('14-6月 -19','DD-MON-RR'),'1','语言');
Insert into ZIYUAN."MessageOfLesson" ("Cid","ProcessChart","Outline","ExperimentInstructer","Click_rate","Cname","UploadTime","Ststus","Label") values ('006     ','xxx__xxxx_张三 实验6-Pandas模块数据处理.doc','Python语言程序设计-大作业要求和评分标准.docx','6-上机实验1.py',0,'爬虫',to_date('17-6月 -19','DD-MON-RR'),'1','语言');
Insert into ZIYUAN."MessageOfLesson" ("Cid","ProcessChart","Outline","ExperimentInstructer","Click_rate","Cname","UploadTime","Ststus","Label") values ('001     ',null,null,null,5,'Oracle',to_date('10-6月 -19','DD-MON-RR'),'1','数据库');
REM INSERTING into ZIYUAN."MessageOfLessonOfStu"
SET DEFINE OFF;
REM INSERTING into ZIYUAN."Teacher_class"
SET DEFINE OFF;
Insert into ZIYUAN."Teacher_class" ("Tid","Cid") values ('10011111','001     ');
Insert into ZIYUAN."Teacher_class" ("Tid","Cid") values ('10011111','002     ');
Insert into ZIYUAN."Teacher_class" ("Tid","Cid") values ('10033333','003     ');
Insert into ZIYUAN."Teacher_class" ("Tid","Cid") values ('10044444','003     ');
Insert into ZIYUAN."Teacher_class" ("Tid","Cid") values ('10044444','004     ');
Insert into ZIYUAN."Teacher_class" ("Tid","Cid") values ('10044444','005     ');
Insert into ZIYUAN."Teacher_class" ("Tid","Cid") values ('10044444','006     ');
REM INSERTING into ZIYUAN.TEST_USER
SET DEFINE OFF;
Insert into ZIYUAN.TEST_USER (USERNAME,PASSWORD) values ('3123','啦啦');
Insert into ZIYUAN.TEST_USER (USERNAME,PASSWORD) values ('20160748','19971101');
Insert into ZIYUAN.TEST_USER (USERNAME,PASSWORD) values ('1513','1561135');
REM INSERTING into ZIYUAN.USERS
SET DEFINE OFF;
Insert into ZIYUAN.USERS (ID,PWD) values ('20160748','amd7749123');
Insert into ZIYUAN.USERS (ID,PWD) values ('001','123456');
REM INSERTING into ZIYUAN."InformationOfTea"
SET DEFINE OFF;
Insert into ZIYUAN."InformationOfTea" ("Tid","Tname","Tpwd","Tpic") values ('10011111','渣蓝','111111',null);
Insert into ZIYUAN."InformationOfTea" ("Tid","Tname","Tpwd","Tpic") values ('10022222','爪哇','222222',null);
Insert into ZIYUAN."InformationOfTea" ("Tid","Tname","Tpwd","Tpic") values ('10033333','x摄','333333',null);
Insert into ZIYUAN."InformationOfTea" ("Tid","Tname","Tpwd","Tpic") values ('10044444','吉安娜','444444',null);
REM INSERTING into ZIYUAN."InformationOfStu"
SET DEFINE OFF;
Insert into ZIYUAN."InformationOfStu" ("Sid","Sname","Spwd","Spic") values ('20166666','李狗蛋','666666',null);
Insert into ZIYUAN."InformationOfStu" ("Sid","Sname","Spwd","Spic") values ('20177777','古尔丹','777777',null);
Insert into ZIYUAN."InformationOfStu" ("Sid","Sname","Spwd","Spic") values ('20155555','凯恩','555555',null);
Insert into ZIYUAN."InformationOfStu" ("Sid","Sname","Spwd","Spic") values ('20160000','小黑','000000',null);
Insert into ZIYUAN."InformationOfStu" ("Sid","Sname","Spwd","Spic") values ('20144444','黑狼王','444444',null);
Insert into ZIYUAN."InformationOfStu" ("Sid","Sname","Spwd","Spic") values ('20160748','汪','amd7749123',null);
REM INSERTING into ZIYUAN."IdOfBlog"
SET DEFINE OFF;
Insert into ZIYUAN."IdOfBlog" ("Id","Pri_page") values ('20166666',null);
Insert into ZIYUAN."IdOfBlog" ("Id","Pri_page") values ('10011111','gfdgdfgdfgdfgd');
Insert into ZIYUAN."IdOfBlog" ("Id","Pri_page") values ('10022222',null);
Insert into ZIYUAN."IdOfBlog" ("Id","Pri_page") values ('10033333',null);
Insert into ZIYUAN."IdOfBlog" ("Id","Pri_page") values ('20177777',null);
Insert into ZIYUAN."IdOfBlog" ("Id","Pri_page") values ('10044444','fsdfdsfdsf');
Insert into ZIYUAN."IdOfBlog" ("Id","Pri_page") values ('20155555','cxbvcxb');
Insert into ZIYUAN."IdOfBlog" ("Id","Pri_page") values ('20160000',null);
Insert into ZIYUAN."IdOfBlog" ("Id","Pri_page") values ('20144444',null);
Insert into ZIYUAN."IdOfBlog" ("Id","Pri_page") values ('20160748','dsadsada');
REM INSERTING into ZIYUAN."Excellent_class"
SET DEFINE OFF;
Insert into ZIYUAN."Excellent_class" ("Cid","Work_label") values ('001     ','数据库');
Insert into ZIYUAN."Excellent_class" ("Cid","Work_label") values ('002     ','语言');
Insert into ZIYUAN."Excellent_class" ("Cid","Work_label") values ('004     ','语言');
REM INSERTING into ZIYUAN."Blog"
SET DEFINE OFF;
Insert into ZIYUAN."Blog" ("Bid","Id","Blog","Click_rate","SGrade","Cname","Cid") values ('7         ','10011111','牟老师课上的不错',null,84.8,'Oracle','001');
Insert into ZIYUAN."Blog" ("Bid","Id","Blog","Click_rate","SGrade","Cname","Cid") values ('6         ','20160748','数据库教的很不错',null,89,'Oracle','001');
Insert into ZIYUAN."Blog" ("Bid","Id","Blog","Click_rate","SGrade","Cname","Cid") values ('3         ',null,null,null,0,null,null);
REM INSERTING into ZIYUAN."ActivityOfStudent"
SET DEFINE OFF;
Insert into ZIYUAN."ActivityOfStudent" ("Sid","Cid","Work_name","Work_picture1","Work_picture2","Work_picture3","Work_code","Work_word","Uploadtime","Grade") values ('20160748','002     ',null,null,null,null,null,null,null,null);
Insert into ZIYUAN."ActivityOfStudent" ("Sid","Cid","Work_name","Work_picture1","Work_picture2","Work_picture3","Work_code","Work_word","Uploadtime","Grade") values ('20160748','006     ',null,null,null,null,null,null,null,null);
Insert into ZIYUAN."ActivityOfStudent" ("Sid","Cid","Work_name","Work_picture1","Work_picture2","Work_picture3","Work_code","Work_word","Uploadtime","Grade") values ('20160748','005     ',null,null,null,null,null,null,null,null);
Insert into ZIYUAN."ActivityOfStudent" ("Sid","Cid","Work_name","Work_picture1","Work_picture2","Work_picture3","Work_code","Work_word","Uploadtime","Grade") values ('20160748','003     ',null,null,null,null,null,null,null,null);
Insert into ZIYUAN."ActivityOfStudent" ("Sid","Cid","Work_name","Work_picture1","Work_picture2","Work_picture3","Work_code","Work_word","Uploadtime","Grade") values ('20160748','001     ',null,null,null,null,'新建 Microsoft Word 文档.docx','6-上机实验1.py',to_date('17-6月 -19','DD-MON-RR'),85);
REM INSERTING into ZIYUAN."AboutLesson"
SET DEFINE OFF;
Insert into ZIYUAN."AboutLesson" ("Cid","ppt") values ('002     ',null);
Insert into ZIYUAN."AboutLesson" ("Cid","ppt") values ('005     ','胡苠杨柴顺李伟捷 sunny旅游管理系统.pdf');
Insert into ZIYUAN."AboutLesson" ("Cid","ppt") values ('001     ','20160748胡苠杨实验四+Linux系统C开发工具.docx');
Insert into ZIYUAN."AboutLesson" ("Cid","ppt") values ('003     ','Python语言程序设计-大作业要求和评分标准.docx');
Insert into ZIYUAN."AboutLesson" ("Cid","ppt") values ('006     ','Python语言程序设计-大作业要求和评分标准.docx');
--------------------------------------------------------
--  DDL for Index PK_MESSAGEOFLESSON
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."PK_MESSAGEOFLESSON" ON "ZIYUAN"."MessageOfLesson" ("Cid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_MESSAGEOFLESSONOFSTU
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."PK_MESSAGEOFLESSONOFSTU" ON "ZIYUAN"."MessageOfLessonOfStu" ("Cid", "Sid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TEACHER_CLASS
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."PK_TEACHER_CLASS" ON "ZIYUAN"."Teacher_class" ("Tid", "Cid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index Teacher_class_FK
--------------------------------------------------------

  CREATE INDEX "ZIYUAN"."Teacher_class_FK" ON "ZIYUAN"."Teacher_class" ("Tid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index 教授_FK
--------------------------------------------------------

  CREATE INDEX "ZIYUAN"."教授_FK" ON "ZIYUAN"."Teacher_class" ("Cid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index U_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."U_PK" ON "ZIYUAN"."USERS" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_INFORMATIONOFTEA
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."PK_INFORMATIONOFTEA" ON "ZIYUAN"."InformationOfTea" ("Tid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_INFORMATIONOFSTU
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."PK_INFORMATIONOFSTU" ON "ZIYUAN"."InformationOfStu" ("Sid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_IDOFBLOG
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."PK_IDOFBLOG" ON "ZIYUAN"."IdOfBlog" ("Id") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_EXCELLENT_CLASS
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."PK_EXCELLENT_CLASS" ON "ZIYUAN"."Excellent_class" ("Cid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_BLOG
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."PK_BLOG" ON "ZIYUAN"."Blog" ("Bid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index id_blog_FK
--------------------------------------------------------

  CREATE INDEX "ZIYUAN"."id_blog_FK" ON "ZIYUAN"."Blog" ("Id") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_ACTIVITYOFSTUDENT
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."PK_ACTIVITYOFSTUDENT" ON "ZIYUAN"."ActivityOfStudent" ("Sid", "Cid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_ABOUTLESSON
--------------------------------------------------------

  CREATE UNIQUE INDEX "ZIYUAN"."PK_ABOUTLESSON" ON "ZIYUAN"."AboutLesson" ("Cid") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Trigger TRI_CLASS_DEL
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ZIYUAN"."TRI_CLASS_DEL" 
AFTER DELETE ON "MessageOfLesson" 
for each row
BEGIN
  delete "AboutLesson" where "Cid"=:old."Cid";
  delete "ActivityOfStudent" where "Cid"=:old."Cid";
  delete "Excellent_class" where "Cid"=:old."Cid";
  delete "MessageOfLessonOfStu" where "Cid"=:old."Cid";
END;
/
ALTER TRIGGER "ZIYUAN"."TRI_CLASS_DEL" ENABLE;
--------------------------------------------------------
--  DDL for Trigger TRI_TID_ID
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ZIYUAN"."TRI_TID_ID" 
BEFORE DELETE OR INSERT OR UPDATE OF "Tid" ON "InformationOfTea" 
for each row
BEGIN
  if inserting then
  insert into "IdOfBlog"("Id")  values(:new."Tid");
    insert into "Message"("Id")  values(:new."Tid");
  elsif deleting then
  delete "IdOfBlog" where "Id"=:old."Tid";
    delete "Message" where "Id"=:old."Tid";
  elsif updating then
  delete "IdOfBlog" where "Id"=:old."Tid";
    delete "Message" where "Id"=:old."Tid";
  insert into "IdOfBlog"("Id") values(:new."Tid");
    insert into "Message"("Id") values(:new."Tid");
  end if;
END;
/
ALTER TRIGGER "ZIYUAN"."TRI_TID_ID" ENABLE;
--------------------------------------------------------
--  DDL for Trigger TRI_SID_ID
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "ZIYUAN"."TRI_SID_ID" BEFORE DELETE OR INSERT OR UPDATE OF "Sid" ON "InformationOfStu" 
for each row
BEGIN
  if inserting then
  insert into "IdOfBlog"("Id")  values(:new."Sid");
  insert into "Message"("Id")  values(:new."Sid");
  elsif deleting then
  delete "IdOfBlog" where "Id"=:old."Sid";
  delete "Message" where "Id"=:old."Sid";
  elsif updating then
  delete "IdOfBlog" where "Id"=:old."Sid";
  delete "Message" where "Id"=:old."Sid";
  insert into "IdOfBlog"("Id") values(:new."Sid");
  insert into "Message"("Id") values(:new."Sid");
  end if;
END;
/
ALTER TRIGGER "ZIYUAN"."TRI_SID_ID" ENABLE;
--------------------------------------------------------
--  Constraints for Table Message
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."Message" MODIFY ("Id" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MessageOfLesson
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."MessageOfLesson" ADD CONSTRAINT "PK_MESSAGEOFLESSON" PRIMARY KEY ("Cid")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ZIYUAN"."MessageOfLesson" MODIFY ("Cid" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MessageOfLessonOfStu
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."MessageOfLessonOfStu" ADD CONSTRAINT "PK_MESSAGEOFLESSONOFSTU" PRIMARY KEY ("Cid", "Sid")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ZIYUAN"."MessageOfLessonOfStu" MODIFY ("Cid" NOT NULL ENABLE);
 
  ALTER TABLE "ZIYUAN"."MessageOfLessonOfStu" MODIFY ("Sid" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table Teacher_class
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."Teacher_class" ADD CONSTRAINT "PK_TEACHER_CLASS" PRIMARY KEY ("Tid", "Cid")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ZIYUAN"."Teacher_class" MODIFY ("Tid" NOT NULL ENABLE);
 
  ALTER TABLE "ZIYUAN"."Teacher_class" MODIFY ("Cid" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table USERS
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."USERS" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "ZIYUAN"."USERS" ADD CONSTRAINT "U_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table InformationOfTea
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."InformationOfTea" ADD CONSTRAINT "PK_INFORMATIONOFTEA" PRIMARY KEY ("Tid")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ZIYUAN"."InformationOfTea" MODIFY ("Tid" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table InformationOfStu
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."InformationOfStu" ADD CONSTRAINT "PK_INFORMATIONOFSTU" PRIMARY KEY ("Sid")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ZIYUAN"."InformationOfStu" MODIFY ("Sid" NOT NULL ENABLE);
 
  ALTER TABLE "ZIYUAN"."InformationOfStu" MODIFY ("Sname" NOT NULL ENABLE);
 
  ALTER TABLE "ZIYUAN"."InformationOfStu" MODIFY ("Spwd" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table IdOfBlog
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."IdOfBlog" ADD CONSTRAINT "PK_IDOFBLOG" PRIMARY KEY ("Id")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ZIYUAN"."IdOfBlog" MODIFY ("Id" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table Excellent_class
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."Excellent_class" ADD CONSTRAINT "PK_EXCELLENT_CLASS" PRIMARY KEY ("Cid")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ZIYUAN"."Excellent_class" MODIFY ("Cid" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table Blog
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."Blog" ADD CONSTRAINT "PK_BLOG" PRIMARY KEY ("Bid")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ZIYUAN"."Blog" MODIFY ("Bid" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ActivityOfStudent
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."ActivityOfStudent" ADD CONSTRAINT "PK_ACTIVITYOFSTUDENT" PRIMARY KEY ("Sid", "Cid")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ZIYUAN"."ActivityOfStudent" MODIFY ("Sid" NOT NULL ENABLE);
 
  ALTER TABLE "ZIYUAN"."ActivityOfStudent" MODIFY ("Cid" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table AboutLesson
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."AboutLesson" ADD CONSTRAINT "PK_ABOUTLESSON" PRIMARY KEY ("Cid")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "ZIYUAN"."AboutLesson" MODIFY ("Cid" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table Message
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."Message" ADD CONSTRAINT "FK_MESSAGE_REFERENCE_IDOFBLOG" FOREIGN KEY ("Id")
	  REFERENCES "ZIYUAN"."IdOfBlog" ("Id") DISABLE;
--------------------------------------------------------
--  Ref Constraints for Table MessageOfLessonOfStu
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."MessageOfLessonOfStu" ADD CONSTRAINT "FK_MESSAGEO_REFERENCE_INFORMAT" FOREIGN KEY ("Sid")
	  REFERENCES "ZIYUAN"."InformationOfStu" ("Sid") ENABLE;
 
  ALTER TABLE "ZIYUAN"."MessageOfLessonOfStu" ADD CONSTRAINT "FK_MESSAGEO_REFERENCE_MESSAGEO" FOREIGN KEY ("Cid")
	  REFERENCES "ZIYUAN"."MessageOfLesson" ("Cid") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table Excellent_class
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."Excellent_class" ADD CONSTRAINT "FK_EXCELLEN_ISEXCELLE_MESSAGEO" FOREIGN KEY ("Cid")
	  REFERENCES "ZIYUAN"."MessageOfLesson" ("Cid") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table Blog
--------------------------------------------------------

  ALTER TABLE "ZIYUAN"."Blog" ADD CONSTRAINT "FK_BLOG_ID_BLOG_IDOFBLOG" FOREIGN KEY ("Id")
	  REFERENCES "ZIYUAN"."IdOfBlog" ("Id") ENABLE;
