# Student Record Management System (Java)

Project Information
-------------------
- Course: Java Programming Lab
- Faculty: Dr. Manish Kumar
- Assignment: Lab Assignment 1 – Student Class Design & Basic Operations
- Student Name: Aditya Shibu
- Roll No: 2401201047
- GitHub: https://github.com/Vic-41148

Problem Statement
-----------------
Create a Student Record Management System that allows users to:
1. Input student details
2. Display student records
3. Calculate grades based on marks

The system should follow Object-Oriented Programming principles and handle multiple student records.

Objectives
----------
- Implement class-based structure in Java
- Use constructors, methods, arrays/ArrayList
- Perform input/output operations using Scanner
- Apply conditional statements & loops

Class Hierarchy
---------------
- Person (Base Class)
  - Field: name

- Student (Inherits Person)
  - Fields: rollNo, course, marks, grade
  - Methods:
    - inputDetails() → Takes input from user
    - calculateGrade() → Assigns grade based on marks
    - displayDetails() → Prints student details

- StudentRecordSystem (Main Class)
  - Menu-driven system for adding and displaying students

Menu Example
------------
===== Student Record Menu =====
1. Add Student
2. Display All Students
3. Exit
Enter your choice: 1
Enter Roll No: 101
Enter Name: Rahul
Enter Course: B.Tech
Enter Marks (0-100): 87.0
Student added successfully!

===== Student Record Menu =====
1. Add Student
2. Display All Students
3. Exit
Enter your choice: 2
Roll No: 101
Name: Rahul
Course: B.Tech
Marks: 87.0
Grade: B
-------------------------

How to Run
----------
1. Clone the repository:
   git clone https://github.com/Vic-41148/StudentRecordSystem.git
   cd StudentRecordSystem

2. Compile the program:
   javac StudentRecordSystem.java

3. Run the program:
   java StudentRecordSystem

Grading Logic
-------------
- A → Marks ≥ 90
- B → Marks ≥ 75
- C → Marks ≥ 60
- D → Marks ≥ 40
- F → Marks < 40

Features
--------
- Add unlimited students using ArrayList
- Validates marks between 0–100
- Calculates grades automatically
- Simple text-based menu system

Future Improvements
-------------------
- Use HashMap for faster student lookup by roll number
- Add update/delete functionality
- Store student records in a file/database

Developed by Aditya Shibu (Roll No: 2401201047)
