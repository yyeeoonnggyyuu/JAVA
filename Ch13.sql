SELECT *
FROM 지하철공기질;
SELECT *
FROM 지하철승하차;


SELECT *, 
       RANK() OVER (ORDER BY 하차승객수 DESC) AS 순위
FROM 지하철승하차
WHERE 호선명 = '1호선' 
  AND 하차승객수 >= 50000;
  
ALTER TABLE 지하철공기질 MODIFY 호선명 VARCHAR(30);
ALTER TABLE 지하철공기질 MODIFY 역명 VARCHAR(30);
ALTER TABLE 지하철공기질 MODIFY 시도명 VARCHAR(30);
ALTER TABLE 지하철공기질 MODIFY 시군구명 VARCHAR(30);

ALTER TABLE 지하철승하차 MODIFY 사용일자 DATE;
ALTER TABLE 지하철승하차 MODIFY 호선명 VARCHAR(30);
ALTER TABLE 지하철승하차 MODIFY 역지하철승하차명 VARCHAR(30);

ALTER TABLE 지하철공기질 ADD PRIMARY KEY(호선명, 역명);
ALTER TABLE 지하철승하차 ADD PRIMARY KEY(사용일자, 호선명, 역명);

SELECT Count(*) AS 총건수
	,ROUND(AVG(미세먼지),1) AS 평균미세먼지
    ,ROUND(AVG(초미세먼지),1) AS 평균초미세먼지
    ,ROUND(AVG(이산화탄소),1) AS 평균이산화탄소
    ,ROUND(AVG(폼알데하이드),1) AS 평균폼알데하이드
    ,ROUND(AVG(일산화탄소),1) AS 평균일산화탄소
FROm 지하철공기질;

SELECT 호선명
	,ROUND(AVG(미세먼지),1) AS 평균미세먼지
    ,ROUND(AVG(초미세먼지),1) AS 평균초미세먼지
    ,ROUND(AVG(이산화탄소),1) AS 평균이산화탄소
    ,ROUND(AVG(폼알데하이드),1) AS 평균폼알데하이드
    ,ROUND(AVG(일산화탄소),1) AS 평균일산화탄소
FROM 지하철공기질
GROUP BY 호선명;

SELECT RANK() OVER(ORDER BY 미세먼지 DESC) AS 순위
	,역명
    ,미세먼지
from 지하철공기질
where 호선명 = '1호선'
LIMIT 10;

SELECT 호선명
	,역명
    ,미세먼지
FROM 지하철공기질
WHERE 미세먼지 > (
				SELECT AVG(미세먼지)
                FROM 지하철공기질
                WHERE 호선명 = '1호선'
                );
                
SELECT 시군구명
	,COUNT(*) AS 역개수
	,ROUND(AVG(미세먼지),1) AS 평균미세먼지
    ,ROUND(AVG(초미세먼지),1) AS 평균초미세먼지
    ,ROUND(AVG(이산화탄소),1) AS 평균이산화탄소
    ,ROUND(AVG(폼알데하이드),1) AS 평균폼알데하이드
    ,ROUND(AVG(일산화탄소),1) AS 평균일산화탄소
FROM 지하철공기질
GROUP BY 시군구명
ORDER BY 2 DESC;


SELECT 시군구명
      ,COUNT(DISTINCT 역명) AS 역개수
      ,GROUP_CONCAT(DISTINCT 역명) AS 역명
FROM 지하철공기질
GROUP BY 시군구명
ORDER BY 역개수 DESC;

SELECT 역명 AS 환승역
		,count(*) as 역개수
        ,group_concat(호선명) AS 호선명
from 지하철공기질
group by 역명
having count(*) >= 2
order by 2 desc;


with 환승역 as
(
select 역명
		,count(*) as 환승역수
from 지하철공기질
group by 역명
having count(*) >=2
)

select '환승역' as 구분
	,ROUND(AVG(미세먼지),1) AS 평균미세먼지
    ,ROUND(AVG(초미세먼지),1) AS 평균초미세먼지
    ,ROUND(AVG(이산화탄소),1) AS 평균이산화탄소
    ,ROUND(AVG(폼알데하이드),1) AS 평균폼알데하이드
    ,ROUND(AVG(일산화탄소),1) AS 평균일산화탄소
from 지하철공기질
where 역명 in (
				select 역명
                from 환승역
                )
                
	union
    
select '단일역'
	,ROUND(AVG(미세먼지),1) AS 평균미세먼지
    ,ROUND(AVG(초미세먼지),1) AS 평균초미세먼지
    ,ROUND(AVG(이산화탄소),1) AS 평균이산화탄소
    ,ROUND(AVG(폼알데하이드),1) AS 평균폼알데하이드
    ,ROUND(AVG(일산화탄소),1) AS 평균일산화탄소
from 지하철공기질
where 역명 not in (
				select 역명
                from 환승역
                );

    
select 호선명
	,역명
	,미세먼지
from 지하철공기질
where (호선명, 미세먼지) in (select 호선명, MAX(미세먼지)
						from 지하철공기질
                        group by 호선명);
                        
select 호선명
	,SUM(승차승객수) as 승차승객수합
    ,sum(하차승객수) as 하차승객수합
    ,sum(승차승객수 + 하차승객수) As 승하차승객수합
    ,rank() over(order by sum(승차승객수 + 하차승객수) desc ) AS 순위
from 지하철승하차
group by 호선명;

