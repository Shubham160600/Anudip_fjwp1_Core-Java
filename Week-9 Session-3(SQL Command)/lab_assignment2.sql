create database lab_assignment2;

use lab_assignment2;

CREATE TABLE Employee (
emp_id VARCHAR(10) PRIMARY KEY,
first_name VARCHAR(25),
last_name VARCHAR(25),
age int(2),
email VARCHAR(30) UNIQUE
);

INSERT INTO Employee (emp_id, first_name, last_name, age, email)
VALUES
(1, 'John', 'Doe', 32, 'john.doe@example.com'),
(2, 'Jane', 'Smith', 28, 'jane.smith@example.com'),
(3, 'Bob', 'Johnson', 35, 'bob.johnson@example.com');

select * from Employee;

SELECT first_name, last_name FROM Employee;

SELECT first_name, last_name, age FROM Employee
WHERE age > 30;
