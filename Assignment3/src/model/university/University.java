/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.university;

import java.util.ArrayList;
import java.util.List;
import model.department.Department;

/**
 *
 * @author Hp
 */
public class University {

    private String universityName;
    private List<Department> departmentList;

    public University() {
        departmentList = new ArrayList<>();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public List<Department> addDepartment(Department department) {
        departmentList.add(department);
        return departmentList;
    }

    public double calculateUniCoursesRating() {
        double uniCourseRankingSum = 0;
        for (Department dept : departmentList) {
            uniCourseRankingSum = uniCourseRankingSum + dept.calculateDeptCoursesRating();
        }
        return (uniCourseRankingSum / departmentList.size());
    }

    @Override
    public String toString() {
        return universityName; //To change body of generated methods, choose Tools | Templates.
    }

}
