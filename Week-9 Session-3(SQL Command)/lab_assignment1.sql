create database lab_assignment1;

use lab_assignment1;

CREATE TABLE Student (
StudentID VARCHAR(10) PRIMARY KEY,
FirstName VARCHAR(25),
LastName VARCHAR(25),
DateOfBirth DateTime,
Gender VARCHAR(25),
Email VARCHAR(30) UNIQUE,
Phone VARCHAR(25)
);

CREATE TABLE Instructor (
    InstructorID VARCHAR(10) PRIMARY KEY,
    Email VARCHAR(30) UNIQUE,
    FirstName VARCHAR(30),
    LastName VARCHAR(30)
);

INSERT INTO Student (StudentID,FirstName,LastName,DateOfBirth,Gender,
Email,Phone) VALUES
('S101','John', 'Doe','2000-10-10','M', 'john@example.com','9878457945'),
('S102','Jane', 'Smith','2013-08-08','M', 'jane@example.com','9977457745'),
('S103','Alice', 'Johnson','2011-09-08','F', 'alice@example.com','9876457845'),
('S104','Anna', 'Doe','2011-07-08','F', 'Anna.doe@india.com','9876457842'),
('S105','Peter', 'Parker','2011-06-05','M', 'p_parker@example.com','9276457843');

SELECT * FROM Student;

UPDATE Student
SET Email = 'jane_Smith@example.com'
WHERE StudentID = 'S102'; 

SELECT * FROM Student;

DELETE from student
WHERE StudentID = 'S102';

SELECT * FROM Student;

SELECT * FROM Student
WHERE FirstName LIKE 'J%';

INSERT INTO Instructor (InstructorID ,Email,FirstName,LastName) VALUES
('I101','sunil@example.com','Sunil','Rawat'),
('I102','nida@example.com','Nida','Fatima'),
('I103','shiv@example.com','Shiv','Kumar');

SELECT * FROM Instructor;

UPDATE Instructor
SET Email = 'sunilrawat@example.com'
WHERE InstructorID = 'I101'; 

SELECT * FROM Instructor;


