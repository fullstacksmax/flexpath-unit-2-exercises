-- Using the Users table, write a query to list all the unique cities where users are located, and sort
-- the list in alphabetical order.

select  distinct City
from users
order by city asc;

