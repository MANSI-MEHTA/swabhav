CREATE TABLE EMP (
 EMPNO               int NOT NULL,
 ENAME               varchar(10),
 JOB                 varchar(9),
 HIREDATE            DATETIME,
 SAL                 int,
 COMM                int,
 DEPTNO              int NOT NULL,
 CONSTRAINT EMP_FOREIGN_KEY FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO),
 CONSTRAINT EMP_PRIMARY_KEY PRIMARY KEY (EMPNO));