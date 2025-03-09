-- Using the Products and OrderItems tables, write a query to find the total revenue generated for
-- each product. The result should display the ProductID, ProductName, and the TotalRevenue
-- (calculated as the sum of Price * Quantity for each OrderItem entry for the product).
-- Order the results by ProductID in ascending order.

select Products.ProductID, ProductName, sum(OrderItems.Quantity * OrderItems.Price) as TotalRevenue
from Products
join OrderItems
on Products.ProductID = OrderItems.ProductID
group by Products.ProductID, Products.ProductName
order by OrderItems.ProductID;