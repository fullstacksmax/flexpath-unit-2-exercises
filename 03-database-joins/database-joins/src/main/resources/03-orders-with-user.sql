-- Write a query to get all Orders including the order id, shipping address, and associated User's username.
-- Use a right join to also include a single row for users who have not placed any orders.
-- Order the results by OrderID in ascending order.
select Orders.orderID, Orders.ShippingAddress, Users.UserName
from Orders
RIGHT JOIN Users
on Users.UserID = Orders.UserID
order by OrderID;