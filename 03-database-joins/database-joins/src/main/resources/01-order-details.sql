-- Write a query to retrieve the details of all orders, including the OrderID, and FirstName and LastName of the user
-- placing the order..
-- Use an INNER JOIN to combine data from the Orders and Users tables, so you can include the user's name with each order.
-- Order the results by OrderID in ascending order.

select OrderID, FirstName, LastName
from orders
INNER JOIN Users on Orders.UserID = Users.UserID;