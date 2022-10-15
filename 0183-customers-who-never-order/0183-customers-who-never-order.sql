# Write your MySQL query statement below
# Select  name as Customers
# From Customers C
# Left Join Orders O
# On C.id = O.customerId
# Where O.customerId IS NULL;

Select name as Customers
From customers 
where customers.id NOT IN
(
select customerid from orders
);