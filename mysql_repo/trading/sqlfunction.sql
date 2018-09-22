DELIMITER |; 
DROP FUNCTION IF EXISTS getTodaysDate;
CREATE FUNCTION getTodaysDate() RETURNS varchar(100)
BEGIN
DECLARE todaysdate date;
DECLARE yyyy varchar(50);
DECLARE m varchar(50);
DECLARE d varchar(50);
DECLARE stringdate varchar(50) ;
SET todaysdate=CURDATE();

SET yyyy=YEAR(todaysdate);
SET m=  month(todaysdate);
SET d= day(todaysdate);
SET stringdate=CONCAT(d,m,yyyy);

RETURN Stringdate;
END;
DELIMITER |: