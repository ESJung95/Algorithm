-- 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회하는 SQL문을 작성해주세요. 
-- 결과는 총거래금액을 기준으로 오름차순 정렬해주세요.

SELECT 
    u.USER_ID,
    u.NICKNAME,
    SUM(b.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD b
JOIN USED_GOODS_USER u ON b.WRITER_ID = u.USER_ID
WHERE b.STATUS = 'DONE' 
GROUP BY u.USER_ID
HAVING SUM(b.PRICE) >= 700000
ORDER BY TOTAL_SALES ASC