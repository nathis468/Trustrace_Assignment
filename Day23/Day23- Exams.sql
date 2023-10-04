CREATE DATABASE Day23_Exams;

USE Day23_Exams;

CREATE TABLE Student(
		StudentId INT PRIMARY KEY,
		Name VARCHAR(30)
);

CREATE TABLE Course(
		CourseNo INT PRIMARY KEY,
		CourseName VARCHAR(30),
		Department VARCHAR(20)
);

CREATE TABLE Room(
		RoomNo INT PRIMARY KEY,
		Capacity INT,
		Building VARCHAR(50)
);

CREATE TABLE Exams(
		ExamId INT PRIMARY KEY,
		Time DATETIME,
		RoomNo INT,
		FOREIGN KEY (RoomNo) REFERENCES Room(RoomNo)
);	

CREATE TABLE Section(
		SectionNo INT PRIMARY KEY,
		StudentId INT,
		CourseNo INT,
		ExamId INT,
		Enrollment VARCHAR(30),
		FOREIGN KEY (StudentId) REFERENCES Student(StudentId),
		FOREIGN KEY (CourseNo) REFERENCES Course(CourseNo),
		FOREIGN KEY (ExamId) REFERENCES Exams(ExamId)
);	