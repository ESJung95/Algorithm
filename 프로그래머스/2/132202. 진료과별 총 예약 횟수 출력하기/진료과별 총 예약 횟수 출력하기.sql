-- 22년 5월에 예약한 환자수를 진료과 코드별로 조회 + 컬럼명 : 진료과 코드, 5월 예약 건수
-- 진료과별 예약한 환자 수를 기준으로 오름차순 + 환자수가 같다면 진료과 코드 기준으로 오름차순

SELECT MCDP_CD AS '진료과코드', COUNT(MCDP_CD) AS '5월예약건수'
FROM APPOINTMENT
WHERE APNT_YMD LIKE '2022-05%'
GROUP BY MCDP_CD
ORDER BY COUNT(MCDP_CD) ASC, MCDP_CD ASC