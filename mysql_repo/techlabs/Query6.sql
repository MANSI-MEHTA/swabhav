/* Display Employee With their respective boss name
SELECT x.ENAME AS NAME ,Y.ENAME AS BOSS,z.DNAME
FROM EMP x
INNER JOIN EMP y ON IFNULL(x.MGR,x.EMPNO)=y.EMPNO*/

/*Display Employee With their respective boss name AND department name
SELECT x.ENAME AS NAME ,Y.ENAME AS BOSS,z.DNAME
FROM EMP x
INNER JOIN EMP y ON IFNULL(x.MGR,x.EMPNO)=y.EMPNO
INNER JOIN dept z ON x.DEPTNO=z.DEPTNO*/