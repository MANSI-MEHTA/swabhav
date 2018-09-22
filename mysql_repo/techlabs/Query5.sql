/*display employee name and department name using inner join
SELECT emp.ENAME,dept.DNAME
FROM emp
INNER JOIN dept ON emp.DEPTNO=dept.DEPTNO;*/

/*Display All department and All employee using full outer join*/


/*Display department Name with no employee
SELECT *
FROM dept D
WHERE
 NOT EXISTS (SELECT * FROM emp E WHERE D.DEPTNO = E.DEPTNO)*/
 
 