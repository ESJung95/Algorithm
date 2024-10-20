-- 모든 동물의 아이디, 이름, 보호 시작일 -> 이름순으로 + 이름이 같은 동물은 나중에 보호를 시작한 동물 먼저
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME ASC, DATETIME DESC