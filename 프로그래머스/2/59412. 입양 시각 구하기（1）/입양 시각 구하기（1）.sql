-- 몇시에 입양이 가장 활발했는지
-- 시간대별로 입양이 몇건이나 발생했는지 조회
-- 정렬조건 시간대 순 오름차순

SELECT 
    HOUR(DATETIME) AS HOUR , COUNT(DATETIME) AS COUNT
FROM ANIMAL_OUTS 
WHERE HOUR(DATETIME) >= 9 AND HOUR(DATETIME) <= 19
GROUP BY HOUR
ORDER BY HOUR ASC