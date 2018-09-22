/*Display second highest salary employee
SELECT MAX(SAL) FROM emp WHERE SAL NOT IN (SELECT MAX(SAL) FROM emp)*/

/*Display sum of salary of all employee
SELECT SUM(SAL) AS SUM_OF_SALARY
FROM emp*/

/*Display current Date
SELECT CURDATE()*/

/*Display count of employeee
SELECT COUNT(EMPNO)
FROM emp*/

/*Display DEPTWISE Number of employees
SELECT DEPTNO,COUNT(DEPTNO) AS NUMBER_OF_EMP_IN_DEPT
FROM emp
GROUP BY DEPTNO
ORDER BY DEPTNO*/

/*Display Jobwise number of employees
SELECT JOB,COUNT(JOB)
FROM emp
GROUP BY JOB
ORDER BY COUNT(JOB)*/

/*Display deptwise jobwise number of employees
SELECT DEPTNO,JOB,COUNT(JOB)
FROM emp
GROUP BY DEPTNO,JOB
ORDER BY COUNT(JOB)
*/
/* Display deptwise jobwise number of employees with employee >=2
SELECT DEPTNO,JOB,COUNT(JOB)
FROM emp
GROUP BY DEPTNO,JOB
HAVING COUNT(JOB)>=2
ORDER BY COUNT(JOB)





