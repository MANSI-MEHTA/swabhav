/*Display all employeee whose commission is null
SELECT * FROM emp WHERE COMM IS NULL*/

/*Display all employee in Dept 10 and job is manager
SELECT * FROM emp WHERE DEPTNO=10 AND JOB="MANAGER"*/

/*Display annual Salary of All employee
SELECT *,((SAL+IFNULL(COMM,0))*12) AS ANNUAL_SAL FROM emp*/

/*display all employee who has same salary of scott
SELECT * FROM emp WHERE SAL IN(SELECT SAL FROM emp WHERE ENAME="SCOTT")*/

/*Display all employee has same dept of
SELECT * FROM emp WHERE DEPTNO IN(SELECT DEPTNO FROM emp WHERE ENAME="SCOTT")*/ 
