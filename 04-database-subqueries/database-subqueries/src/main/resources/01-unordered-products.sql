-- Write a query to get all products including the ProductID, and the ProductName that are not in the OrderItems table
-- Use a subquery to get the ProductID values from the OrderItems table.
-- Order the results by ProductID in ascending order.
select ProductID, ProductName

from products
where ProductID not in (select ProductID from OrderItems);