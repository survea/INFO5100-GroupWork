package info5100.university.example.businessmodel;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Moumita
 */
public class University {
    String name;
    String id;

    List<Department> listOfDepartments;
    List<GraduateStudent> listOfGraduateStudents;

    public University(String name, String id){
        this.id = id;
        this.name = name;
        listOfDepartments = new ArrayList<>();
        listOfGraduateStudents = new ArrayList<>();
    }

    public void addADepartment(Department department){
        listOfDepartments.add(department);
    }

    public void addAGraduateStudent(GraduateStudent graduateStudent){

        listOfGraduateStudents.add(graduateStudent);
    }

    public List<Department> getDepartments(){
        return listOfDepartments;
    }

    public List<GraduateStudent> getGraduates(){
        return listOfGraduateStudents;
    }

    public List<Employer> getListOfAllEmployers(){
        List<Employer> employers = new ArrayList<>();

        listOfGraduateStudents.forEach(graduateStudent -> {
            graduateStudent.getEmploymentList().forEach(x -> {
                employers.add(x.getEmployer());
            });
        });

        return employers.stream().distinct().collect(Collectors.toList());
    }

    public List<Employer> getListOfReputedEmployers(){
        Collections.sort(getListOfAllEmployers());
        return getListOfAllEmployers().subList(0, 2);
    }

    public HashMap<Employer, String> getListOfReputedEmployersAndRelevantCourses(){
        HashMap<Employer, String> list = new HashMap<>();

        listOfGraduateStudents.forEach(graduateStudent -> {
            graduateStudent.employmentList.forEach(e -> {
                if(getListOfReputedEmployers().contains(e.getEmployer()))
                    list.put(e.getEmployer(), findCourseName(graduateStudent.getCourseId()));
            });
        });

        return list;
    }

    private String findCourseName(String courseId) {
        String[] courseName = {""};
        getDepartments().forEach(department -> {
            department.getListOfCourses().forEach(course -> {
                if(course.getCourseId().equals(courseId)){
                    courseName[0] = course.getCourseName();
                }
            });
        });

        return courseName[0];
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' + "\n" +
                ", id='" + id + '\'' + "\n" +
                ", listOfDepartments=" + listOfDepartments + "\n" +
                ", listOfGraduateStudents=" + listOfGraduateStudents + "\n" +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
