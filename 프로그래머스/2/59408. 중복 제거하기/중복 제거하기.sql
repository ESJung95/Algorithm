-- 동물의 이름은 몇개인지 조회 + NULL은 집계하지 않고 중복되는 이름은 하나로 조회
SELECT COUNT(DISTINCT NAME) AS count
FROM ANIMAL_INS
WHERE NAME IS NOT NULL