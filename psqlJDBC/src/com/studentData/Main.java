package com.studentData;

import java.util.Scanner;

import com.studentData.StudentCURD.StudentDAO;
import com.studentData.DAO.Student;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        
        

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. View Student by ID");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1->{
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    dao.addStudent(new Student(id, name, course));
                }

                case 2->{
                    dao.getAllStudents();
                }

                case 3->{
                    System.out.print("Enter ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    dao.updateStudent(new Student(updateId, null, newCourse));
                }

                case 4->{
                    System.out.print("Enter ID: ");
                    int deleteId = sc.nextInt();

                    dao.deleteStudent(new Student(deleteId, null, null));
                }

                case 5->{
                    System.out.print("Enter ID: ");
                    int viewId = sc.nextInt();
                    dao.getStudentById(viewId);
                }

                case 6->{
                    System.out.println("Thank You! visit again.");
                    sc.close();
                    System.exit(0);}

                default->{
                    System.out.println("Invalid Choice!");}
            }
        }
    }
}