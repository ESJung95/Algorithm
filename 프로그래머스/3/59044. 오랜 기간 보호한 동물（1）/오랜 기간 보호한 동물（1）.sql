
-- 문제 : 아직 입양을 못 간 동물 중, 가장 오래 보호소에 있었던 동물 3마리의 이름과 보호 시작일을 조회하는 SQL문을 작성 결과는 -- 보호 시작일 순으로 조회해야 합니다.

SELECT NAME, DATETIME 
FROM ANIMAL_INS ai1
WHERE NOT EXISTS (
    SELECT 1 
    FROM ANIMAL_OUTS ao 
    WHERE ao.ANIMAL_ID = ai1.ANIMAL_ID
)
ORDER BY DATETIME ASC
LIMIT 3;