-- Write a query to list all products, including their ProductID, ProductName, and CategoryName (from the Category
-- table.) Use a LEFT JOIN to ensure that products are displayed even if they do not have a category assigned.
-- Order the results by ProductID in ascending order.

select *
from Products
left join Categories
on Products.CategoryID = Categories.CategoryID
order by ProductID;