create database lab_assignment3;

use lab_assignment3;

CREATE TABLE BankAccount (
account_id VARCHAR(10) PRIMARY KEY,
account_holder_name VARCHAR(30),
account_balance int
);

INSERT INTO BankAccount (account_id, account_holder_name, account_balance)
VALUES
(101, 'John Doe', 50000),
(102, 'Jane Smith', 35000),
(103, 'Bob Johnson', 45000);

select * from BankAccount;

SELECT account_holder_name, account_balance FROM BankAccount;

SELECT account_holder_name, account_balance FROM BankAccount
WHERE account_balance > 30000;
