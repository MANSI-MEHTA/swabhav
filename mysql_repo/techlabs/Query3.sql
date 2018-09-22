/* Display top 5 employee with highest salary*/
SELECT * FROM emp 
GROUP BY SAL 
ORDER BY SAL  DESC 
LIMIT 5