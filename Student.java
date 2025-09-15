/*Problem Statement:-Write a class Student with attributes: name, rollNo, and marks. Include methods to input data
and display the student's result.*/

import java.util.Scanner;

//Class
public class Student {
    String name;
    int rollNo;
    int marks;

    // Constructor
    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Input Function
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the Student:- ");
        name = sc.nextLine();
        System.out.println("Enter roll number of the Student:- ");
        rollNo = sc.nextInt();
        System.out.println("Enter marks of the Student:- ");
        marks = sc.nextInt();
    }

    // Display Function
    void display() {
        System.out.println("Student Result with Details:- ");
        System.out.println("Name:- " + name);
        System.out.println("Roll no.:- " + rollNo);
        System.out.println("Marks:- " + marks);
    }

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Students to be entered:- ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            students[i] = new Student("", 0, 0);
            students[i].input();
        }

        System.out.println("Student result with Details: ");
        for (int i = 0; i < n; i++) {
            students[i].display();
            System.out.println();
        }
        sc.close();
    }
}
