package com.ems;

import java.util.Scanner;
import com.ems.DAO.Employee;
import com.ems.DAO.EmployeeDao;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDao dao = new EmployeeDao();
        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. View Employee by ID");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Department: ");
                    String department = sc.nextLine();
                    System.out.print("Enter Employee Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    dao.addEmployee(new Employee(id, name, email, department, salary));
                }

                case 2 -> dao.getAllEmployees();

                case 3 -> {
                    System.out.print("Enter Employee ID to Update: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Employee Department: ");
                    String department = sc.nextLine();
                    System.out.print("Enter Employee Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    dao.updateEmployee(new Employee(id, null, email, department, salary));
                }
                case 4 -> {
                    System.out.print("Enter Employee ID to Delete: ");
                    int id = sc.nextInt();
                    dao.deleteEmployee(id);
                }

                case 5 -> {
                    System.out.print("Enter Employee ID to View: ");
                    int id = sc.nextInt();
                    dao.getEmployeeById(id);
                }

                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid Choice! Please Try Again.");
            }
        }
     
    }
}