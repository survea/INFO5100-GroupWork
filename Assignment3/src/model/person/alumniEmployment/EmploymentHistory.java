/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person.alumniEmployment;

import java.util.List;

/**
 *
 * @author Hp
 */
public class EmploymentHistory {
    private List<Employment> employmentList;

    public EmploymentHistory() {
    }

    public List<Employment> getEmploymentList() {
        return employmentList;
    }

    public void setEmploymentList(List<Employment> employmentList) {
        this.employmentList = employmentList;
    }
    
}
