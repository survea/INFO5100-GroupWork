/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.department;

import java.util.List;
import model.course.Course;
import model.course.CourseCatalog;
import model.person.FacultyDirectory;
import model.person.StudentDirectory;

/**
 *
 * @author Hp
 */
public class Department {

    private String departmentName;
    private CourseCatalog  courseList;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;

    public Department() {
        courseList = new CourseCatalog();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public CourseCatalog getCourseList() {
        return courseList;
    }

    public void setCourseList(CourseCatalog courseList) {
        this.courseList = courseList;
    }

    public CourseCatalog addCourse(Course course) {
        courseList.addCourse(course);
        return courseList;
    }
}
