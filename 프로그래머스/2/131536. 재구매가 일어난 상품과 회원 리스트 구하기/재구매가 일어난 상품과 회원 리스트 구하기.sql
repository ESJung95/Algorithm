-- ONLINE_SALE 테이블에서 동일한 회원이 동일한 상품을 재구매한 데이터를 구하여, 
-- 재구매한 회원 ID와 재구매한 상품 ID를 출력하는 SQL문을 작성해주세요. 
-- 결과는 회원 ID를 기준으로 오름차순 정렬해주시고 , 회원 ID가 같다면 상품 ID를 기준으로 내림차순 정렬해주세요.

SELECT DISTINCT o1.USER_ID, o1.PRODUCT_ID
FROM ONLINE_SALE o1
WHERE EXISTS (
        SELECT *
        FROM ONLINE_SALE o2
        WHERE o1.USER_ID = o2.USER_ID AND o1.PRODUCT_ID = o2.PRODUCT_ID
        GROUP BY USER_ID, PRODUCT_ID
        HAVING COUNT(*) > 1
)
ORDER BY  o1.USER_ID ASC, o1.PRODUCT_ID DESC
