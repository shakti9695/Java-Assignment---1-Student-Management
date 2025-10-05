/*
----------------------------------------------------------
Java Programming Lab Assignment 1
Student Record Management System

Submitted by: Aditya Shibu
Roll No: 2401201047
GitHub: https://github.com/Vic-41148
Faculty: Dr. Manish Kumar
----------------------------------------------------------
*/

import java.util.ArrayList;
import java.util.Scanner;

// Person class (base class)
class Person {
    protected String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }
}

// Student class inheriting Person
class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private char grade;

    // Default constructor
    public Student() {
        super();
        this.rollNo = 0;
        this.course = "";
        this.marks = 0.0;
        this.grade = ' ';
    }

    // Parameterized constructor
    public Student(int rollNo, String name, String course, double marks) {
        super(name);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    // Input student details
    public void inputDetails(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();

        do {
            System.out.print("Enter Marks (0-100): ");
            marks = sc.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
            }
        } while (marks < 0 || marks > 100);

        calculateGrade();
    }

    // Calculate grade based on marks
    public void calculateGrade() {
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 60) grade = 'C';
        else if (marks >= 40) grade = 'D';
        else grade = 'F';
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }
}

public class StudentRecordSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add student
    public void addStudent() {
        Student s = new Student();
        s.inputDetails(sc);
        students.add(s);
        System.out.println("Student added successfully!\n");
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available!\n");
        } else {
            for (Student s : students) {
                s.displayDetails();
            }
        }
    }

    // Menu system
    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n===== Student Record Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayAllStudents();
                case 3 -> System.out.println("Exiting the application. Goodbye!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println(" Student Record Management System");
        System.out.println(" Submitted by: Aditya Shibu");
        System.out.println(" Roll No: 2401201047");
        System.out.println(" GitHub: https://github.com/Vic-41148");
        System.out.println("---------------------------------------------------\n");

        StudentRecordSystem app = new StudentRecordSystem();
        app.mainMenu();
    }
}
