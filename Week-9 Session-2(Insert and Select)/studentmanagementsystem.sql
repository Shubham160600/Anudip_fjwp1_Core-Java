create database student_management_system;

use student_management_system;

CREATE TABLE Student (
StudentID VARCHAR(10) PRIMARY KEY,
FirstName VARCHAR(25),
LastName VARCHAR(25),
DateOfBirth DateTime,
Gender VARCHAR(25),
Email VARCHAR(30) UNIQUE,
Phone VARCHAR(25)
);

CREATE TABLE Course (
CourseID VARCHAR(10) PRIMARY KEY,
CourseTitle VARCHAR(30),
Credits INT
);

CREATE TABLE Instructor (
InstructorID VARCHAR(10) PRIMARY KEY,
Email VARCHAR(30) UNIQUE,
FirstName VARCHAR(30),
LastName VARCHAR(30)
);

CREATE TABLE Enrollment (
EnrollmentID VARCHAR(10) PRIMARY KEY,
EnrollmentDate DATE,
StudentID VARCHAR(10),
CourseID VARCHAR(10),
InstructorID VARCHAR(10),
FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
FOREIGN KEY (CourseID) REFERENCES Course(CourseID),
FOREIGN KEY (InstructorID) REFERENCES Instructor(InstructorID)
);

CREATE TABLE Score(
ScoreID VARCHAR(10) PRIMARY KEY,
StudentID VARCHAR(10),
CourseID VARCHAR(10),
FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
FOREIGN KEY (CourseID) REFERENCES Course(CourseID),
CreditObtained VARCHAR(10),
DateOfExam DateTime
);

CREATE TABLE Feedback(
FeedbackID INT Auto_Increment PRIMARY KEY,
StudentID VARCHAR(10),
Date DATE,
InstructorName VARCHAR(30),
Feedback VARCHAR(100),
FOREIGN KEY (StudentID) REFERENCES Student(StudentID)
);

INSERT INTO Student (StudentID,FirstName,LastName,DateOfBirth,Gender,
Email,Phone) VALUES
('S101','John', 'Doe','2000-10-10','M', 'john@example.com','9878457945'),
('S102','Jane', 'Smith','2013-08-08','M', 'jane@example.com','9977457745'),
('S103','Alice', 'Johnson','2011-09-08','F', 'alice@example.com','9876457845'),
('S104','Anna', 'Doe','2011-07-08','F', 'Anna.doe@india.com','9876457842'),
('S105','Peter', 'Parker','2011-06-05','M', 'p_parker@example.com','9276457843');

SELECT * FROM Student;

Select FirstName from Student;

INSERT INTO Course (CourseID,CourseTitle,Credits) VALUES
('C101','Math101',12),
('C102','History101',13),
('C103','Computer Science101',11);

SELECT * FROM Course;

INSERT INTO Instructor (InstructorID ,Email,FirstName,LastName) VALUES
('I101','sunil@example.com','Sunil','Rawat'),
('I102','nida@example.com','Nida','Fatima'),
('I103','shiv@example.com','Shiv','Kumar');

SELECT * FROM Instructor;

INSERT INTO Enrollment (EnrollmentID, EnrollmentDate, StudentID, CourseID, InstructorID) VALUES
('E1001', '2023-08-28', 'S101', 'C101', 'I101'),
('E1002', '2023-08-18', 'S102', 'C101', 'I101'),
('E1003', '2023-08-25', 'S103', 'C102', 'I102');

SELECT * FROM Enrollment;

INSERT INTO Score
(ScoreID,StudentID,CourseID,CreditObtained,DateOfExam)VALUES
('SC101','S101','C101','12','2022-10-10'),
('SC102','S102','C101','10','2022-10-10');

SELECT * FROM Score;

INSERT INTO Feedback(StudentID, Date, InstructorName, Feedback) VALUES
('S101', '2023-08-18', 'I101', 'Session was good'),
('S102', '2024-01-20', 'I101', 'Topic was well explained'),
('S103', '2023-10-29', 'I102', 'Session was excellent');

SELECT * FROM Feedback;
