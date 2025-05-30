-- 동물의 아이디, 이름, 중성화 여부 + 아이디 순으로 조회
        
SELECT ANIMAL_ID, NAME,
    CASE
        WHEN SEX_UPON_INTAKE LIKE 'Neutered%' THEN 'O'
        WHEN SEX_UPON_INTAKE LIKE 'Spayed%' THEN 'O'
        ELSE 'X'
    END AS '중성화'
    
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC;