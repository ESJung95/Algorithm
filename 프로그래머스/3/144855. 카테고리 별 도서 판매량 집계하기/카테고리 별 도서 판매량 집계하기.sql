-- 2022년 1월의 카테고리 별 도서 판매량을 합산하고, 카테고리(CATEGORY), 총 판매량(TOTAL_SALES) 리스트를 출력하는 SQL
-- 결과는 카테고리명을 기준으로 오름차순 정렬해주세요.

SELECT 
    b.CATEGORY,
    SUM(bs.SALES) AS TOTAL_SALES
FROM BOOK b
JOIN BOOK_SALES bs ON b.BOOK_ID = bs.BOOK_ID
WHERE bs.SALES_DATE >= '2022-01-01'
AND bs.SALES_DATE < '2022-02-01'
GROUP BY b.CATEGORY
ORDER BY b.CATEGORY ASC
