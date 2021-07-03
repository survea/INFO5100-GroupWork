/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.university;

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

    @Override
    public String toString() {
        return "University{" + "universityName=" + universityName + ", departmentList=" + departmentList + '}';
    }

}
