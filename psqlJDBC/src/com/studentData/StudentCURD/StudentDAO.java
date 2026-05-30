package com.studentData.StudentCURD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.studentData.Database.DBConnection;
import com.studentData.DAO.Student;

public class StudentDAO {

    public void addStudent(Student student) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO student(id, name, course) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getCourse());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Added Successfully!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void getAllStudents() {

    try {
        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM student";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("course")
            );
        }

        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public void updateStudent(Student student) {

    try {
        Connection con = DBConnection.getConnection();

        String sql = "UPDATE student SET course = ? WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, student.getCourse());
        ps.setInt(2, student.getId());

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Student Updated Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }

        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public void deleteStudent(Student student) {

    try {
        Connection con = DBConnection.getConnection();

        String sql = "DELETE FROM student WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, student.getId());

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }

        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public void getStudentById(int id) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM student WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getString("course")
                );
            } else {
                System.out.println("Student Not Found!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
