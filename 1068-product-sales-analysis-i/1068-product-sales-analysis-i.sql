SELECT Product.product_name, Sales.year, Sales.price
FROM SALES
LEFT OUTER JOIN PRODUCT ON
SALES.PRODUCT_ID= PRODUCT.PRODUCT_ID;