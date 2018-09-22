/* Display country name where their no location
SELECT c.COUNTRY_NAME 
FROM countries c
LEFT JOIN locations l
ON l.COUNTRY_ID=c.COUNTRY_ID
WHERE l.CITY IS NULL*/

/*Display regionwise number of country

SELECT r.region_name,COUNT(c.REGION_ID) AS COUNT
FROM countries c INNER JOIN regions r
ON c.REGION_ID =r.REGION_ID
GROUP BY c.REGION_ID
ORDER BY COUNT(c.REGION_ID)*/

/* Display regionwise countries no of location
SELECT R.region_name,R.region_id,C.COUNTRY_NAME,COUNT(L.CITY)
FROM regions R
INNER JOIN countries C 
ON R.region_id=C.REGION_ID
INNER JOIN locations L
ON C.COUNTRY_ID=L.COUNTRY_ID
GROUP BY R.region_id,C.COUNTRY_ID,L.LOCATION_ID*/

/*Display Regionname,countryname,locationname*/

SELECT R.region_name,C.COUNTRY_NAME,L.CITY
FROM regions R
LEFT JOIN countries C 
ON R.region_id=C.REGION_ID
LEFT JOIN locations L
ON C.COUNTRY_ID=L.COUNTRY_ID
GROUP BY R.region_id,C.COUNTRY_ID,L.LOCATION_ID




