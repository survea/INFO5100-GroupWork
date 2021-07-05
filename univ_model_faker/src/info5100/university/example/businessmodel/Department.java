package info5100.university.example.businessmodel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Moumita
 */
public class Department {
    String departmentId;
    String departmentName;
    List<Course> listOfCoursesInTheDepartment;
    List<Faculty> listOfFaculties;

    public Department(String departmentId, String departmentName){
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        listOfCoursesInTheDepartment = new ArrayList<>();
        listOfFaculties = new ArrayList<>();
    }

    public void addCoursesInDepartment(Course course){
        listOfCoursesInTheDepartment.add(course);
    }

    public void addFacultiesInDepartment(Faculty faculty){
        listOfFaculties.add(faculty);
    }

    public List<Course> getListOfCourses(){
        Collections.sort(listOfCoursesInTheDepartment);
        return listOfCoursesInTheDepartment;
    }


    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' + "\n" +
                ", departmentName='" + departmentName + '\'' + "\n" +
                ", listOfCoursesInTheDepartment=" + listOfCoursesInTheDepartment + "\n" +
                ", listOfFaculties=" + listOfFaculties + "\n" +
                '}';
    }

    public String getName() {
        return departmentName;
    }

    public String getId() {
        return departmentId;
    }

    public List<Faculty> getFaculties() {
        return listOfFaculties;
    }
}
