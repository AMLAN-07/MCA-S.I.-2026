package com.ems.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.ems.database.DBConnection;

public class EmployeeDao {
    public void addEmployee(Employee employee) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO employees(id, name,email,department,salary) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setString(3, employee.getEmail());
            ps.setString(4, employee.getDepartment());
            ps.setDouble(5, employee.getSalary());
            ps.executeUpdate();
            System.out.println("Employee Added Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void getAllEmployees() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM employees";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("email") + " " +
                        rs.getString("department") + " " +
                        rs.getDouble("salary")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateEmployee(Employee employee) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE employees SET department = ?, email = ?, salary = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, employee.getDepartment());
            ps.setString(2, employee.getEmail());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getId());
            ps.executeUpdate();
            System.out.println("Employee Updated Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    public void deleteEmployee(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM employees WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Employee Deleted Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void getEmployeeById(int id) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM employees WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("email") + " " +
                        rs.getString("department") + " " +
                        rs.getDouble("salary")
                );
            } else {
                System.out.println("Employee Not Found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
