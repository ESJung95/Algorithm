-- PRODUCT 테이블과 OFFLINE_SALE 테이블에서 상품코드 별 매출액(판매가 * 판매량) 합계를 출력하는 SQL문을 작성해주세요. 
-- 결과는 매출액을 기준으로 desc 정렬해주시고 매출액이 같다면 상품코드를 기준으로 asc 정렬해주세요.

SELECT 
    p.PRODUCT_CODE, 
    SUM(os.SALES_AMOUNT * p.PRICE) AS SALES
FROM PRODUCT p
JOIN OFFLINE_SALE os ON p.PRODUCT_ID = os.PRODUCT_ID
GROUP BY p.PRODUCT_CODE
ORDER BY SALES DESC, p.PRODUCT_CODE ASC