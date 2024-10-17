package csc215.mycoursesthissemester;

/*

File: MyCoursesThisSemester.java
By: AJ Arce
Date: September 12th, 2024

Description: This program displays all of my Fall 2024 courses throughout the week from Monday to Friday.

*/

public class MyCoursesThisSemester {

    public static void main(String[] args) {
        String course1 = "2:00PM-3:15PM - MATH.227: Calculus II Lecture";
        String course2 = "11:00AM-12:15PM - CSC.215: Intermed Computer Science";
        String course3 = "2:00PM-3:15PM - PHYS.220: General Physics Lecture";
        String course4 = "3:30PM-6:15PM - PHYS.220: General Physics Lab With Calculus I";
        String course5 = "3:30PM-4:45PM - ERTH.115: History Of Life";
        String course6 = "3:00PM-3:50PM - MATH.227: Calculus II Seminar";
        
        
        System.out.println("List of classes for Fall 2024 Semester: ");
        
        //Monday Classes
        System.out.println("Mondays: ");
        System.out.println(course2);
        System.out.println(course1);
        System.out.println();
        
        //Tuesday Classes
        System.out.println("Tuesdays: ");
        System.out.println(course3);
        System.out.println(course5);
        System.out.println();
        
        //Wednesday Classes
        System.out.println("Wednesdays: ");
        System.out.println(course2);
        System.out.println(course1);
        System.out.println(course4);
        System.out.println();
        
        //Thursday Classes
        System.out.println("Thursdays");
        System.out.println(course3);
        System.out.println(course5);
        System.out.println();
        
        //Friday Classes
        System.out.println("Fridays");
        System.out.println(course6);
                
    }
}
