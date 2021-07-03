/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class StudentDirectory {

    public static List<Student> studentDir;

    public StudentDirectory() {
        studentDir = new ArrayList<>();
    }

    public static List<Student> addStudent(Student student) {
        studentDir.add(student);
        return studentDir;
    }
}
