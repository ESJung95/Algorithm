-- PATIENT, DOCTOR 그리고 APPOINTMENT 테이블에서 2022년 4월 13일 취소되지 않은 흉부외과(CS) 진료 예약 내역을 조회
-- 진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시 항목이 출력되도록 작성해주세요. 
-- 결과는 진료예약일시를 기준으로 오름차순 정렬해주세요.

SELECT 
    a.APNT_NO,
    p.PT_NAME,
    a.PT_NO,
    a.MCDP_CD,
    d.DR_NAME,
    a.APNT_YMD
FROM APPOINTMENT a
JOIN PATIENT p ON a.PT_NO = p.PT_NO
JOIN DOCTOR d ON d.DR_ID = a.MDDR_ID
WHERE DATE_FORMAT(a.APNT_YMD, '%Y-%m-%d') = '2022-04-13'
AND a.APNT_CNCL_YN = 'N'
AND a.MCDP_CD = 'CS'
ORDER BY a.APNT_YMD ASC
