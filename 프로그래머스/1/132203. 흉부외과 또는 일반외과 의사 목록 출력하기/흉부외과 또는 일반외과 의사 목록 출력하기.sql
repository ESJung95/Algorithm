-- 진료과가 CS , GS 인 의사이름, 의사ID, 진료과, 고용일자 조회
-- 고용일자를 기준으로 내림차순 정렬 + 고용일자 동일 시 이름 기준 오름차순 정렬

SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD = 'CS' OR MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME

-- 날짜 포맷 맞춰주기
