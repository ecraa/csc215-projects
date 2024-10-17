/*

File: StudentClient_AJArce.java
By: AJ Arce
Date: October 11th, 2024

Description: This program allows the user to manage student information for a group
             of students. The user first inputs the names and GPAs of three students.
             The program then displays all the student details that were given, and
             the user can choose a student to update their name and GPA. The final
             updated student info is then displayed to the console.
 */

package asmt05;

import java.util.Scanner;

/**
 * Please implement class StudentClient by adding code to it.
 * Please DO NOT change the provided code. ONLY add more code.
 * 
 * Class:       StudentClient
 * File Name:   StudentClient_AJArce.java
 *
 * @author Duc Ta
 */
public class StudentClient_AJArce {
    static Scanner input = new Scanner(System.in);
    static final int totalStudents = 3;
    public static void addStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("- Enter a name for student #" + (i + 1) + ": ");
            students[i].setName(input.nextLine());
            System.out.print("- Enter a GPA for student #" + (i + 1) + ": ");
            students[i].setGpa(input.nextDouble());
            input.nextLine();
            System.out.println();
        }
    }

    public static void displayStudentInfo(Student student) {
        System.out.println("'this' student---");
        System.out.println("name: " + student.getName());
        System.out.printf("gpa: %.1f", student.getGpa());
    }

    public static void displayAllStudents(Student[] students) {
        for (Student student : students) {
            displayStudentInfo(student);
            System.out.println();
        }
    }

    public static void updateStudentInfo(Student[] students, String nameToUpdate) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(nameToUpdate)) {
                System.out.print("[-] Enter new student name: ");
                student.setName(input.nextLine());
                System.out.print("[-] Enter new student gpa: ");
                student.setGpa(input.nextDouble());
                input.nextLine();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[totalStudents];
        System.out.println("[+] Creating " + totalStudents + " students...");
        addStudents(students);
        System.out.println();

        System.out.println("[+] The " + totalStudents + " students created:");
        displayAllStudents(students);
        System.out.println();

        System.out.print("[-] Enter a student's full name to update the student: ");
        String nameToUpdate = input.nextLine();
        updateStudentInfo(students, nameToUpdate);
        System.out.println();

        System.out.println("[+] The " + totalStudents + " students updated: ");
        displayAllStudents(students);

    }
}
