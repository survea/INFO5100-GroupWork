/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Hp
 */
public class UniversityDirectory {

    private static List<University> universityList;

    public UniversityDirectory() {
        universityList = new ArrayList<>();
    }

    public static List<University> getUniversityList() {
        return universityList;
    }

    public static void setUniversityList(List<University> universityList) {
        UniversityDirectory.universityList = universityList;
    }

    public static List<University> addUniversity(University university) {
        universityList.add(university);
        return universityList;
    }
    public static void sortUniversities(Comparator<University> c) {
		// TODO Auto-generated method stub
		      Collections.sort(universityList, c);
		universityList.forEach(System.out::println);
	}
}
