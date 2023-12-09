--Query a list of CITY names from STATION for cities that have an even ID number.
--Print the results in any order, but exclude duplicates from the answer.

-- 포인트는 짝수
select distinct CITY from STATION where MOD(ID,2) = 0;

-- 또는
select distinct CITY from STATION where ID%2 = 0;
