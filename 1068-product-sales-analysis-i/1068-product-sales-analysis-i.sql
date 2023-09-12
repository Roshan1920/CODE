Select PRODUCT.product_name, SALES.year, SALES.price
FROM Sales
INNER JOIN Product
ON Sales.product_id= Product.product_id;