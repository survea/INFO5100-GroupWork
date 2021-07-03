/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person;

import java.util.List;
import model.person.alumniEmployment.EmploymentHistory;

/**
 *
 * @author Hp
 */
public class Alumni extends Student{
    private String employer;
    private List<EmploymentHistory> employmentHistory;

    public Alumni() {
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public List<EmploymentHistory> getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEmploymentHistory(List<EmploymentHistory> employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    
}
