-- 젊은 동물의 아이디와 이름을 조회, 아이디 순으로 나열
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION !='Aged'
ORDER BY ANIMAL_ID 