create database studentmanagementsystem;

use studentmanagementsystem;

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
Feedback VARCHAR(100)
);

select * from Student;

select * from Course;

select * from Instructor;

select * from Enrollment;

select * from Score;

select * from Feedback;
