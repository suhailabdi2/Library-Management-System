/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library1;

/**
 *
 * @author Issene Halake
 */
public class Student extends User {
    private String studentId;
    private String smajor;

    public Student(String username, String password, String studentId,String smajor) {
        super(username, password);
        this.studentId = studentId;
        this.smajor = smajor;
    }

    public String getStudentId() {
        return studentId;
    }
}

