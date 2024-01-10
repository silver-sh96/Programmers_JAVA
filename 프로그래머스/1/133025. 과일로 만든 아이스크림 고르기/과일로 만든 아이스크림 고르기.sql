-- 코드를 입력하세요
SELECT
    f.FLAVOR
FROM
    FIRST_HALF AS f
JOIN
    ICECREAM_INFO AS i
ON
    f.FLAVOR = i.FLAVOR
WHERE
    i.INGREDIENT_TYPE = 'fruit_based' 
    AND
    f.TOTAL_ORDER > 3000;