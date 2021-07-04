/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.department;

import java.util.ArrayList;
import java.util.List;
import model.course.Course;
import model.course.CourseCatalog;
import model.employer.Employer;
import model.person.Alumni;
import model.person.AlumniDirectory;
import model.person.FacultyDirectory;
import model.person.Student;
import model.person.StudentDirectory;

/**
 *
 * @author Hp
 */
public class Department {

    private String departmentName;
    private CourseCatalog courseList;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    AlumniDirectory alumniDirectory;
    public List<Employer> employerList;

    public Department() {
        courseList = new CourseCatalog();
        employerList = new ArrayList<>();
        alumniDirectory = new AlumniDirectory();
        studentdirectory = new StudentDirectory(this);
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

    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }

    public void setStudentdirectory(StudentDirectory studentdirectory) {
        this.studentdirectory = studentdirectory;
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    public void setFacultydirectory(FacultyDirectory facultydirectory) {
        this.facultydirectory = facultydirectory;
    }

    public List<Employer> getEmployerList() {
        return employerList;
    }

    public void setEmployerList(List<Employer> employerList) {
        this.employerList = employerList;
    }

    public AlumniDirectory getAlumniDirectory() {
        return alumniDirectory;
    }

    public void setAlumniDirectory(AlumniDirectory alumniDirectory) {
        this.alumniDirectory = alumniDirectory;
    }

    public CourseCatalog addCourse(Course course) {
        courseList.addCourse(course);
        return courseList;
    }

    public List<Employer> addEmployer(Employer employer) {
        employerList.add(employer);
        return employerList;
    }

    public AlumniDirectory addAlumni(Alumni alumni) {
        alumniDirectory.addAlumni(alumni);
        return alumniDirectory;
    }
        public StudentDirectory addStudent(Student student) {
        studentdirectory.addStudent(student);
        return studentdirectory;
    }

    public void calculateCourseRatingPercent() {
        int courseAlumniCount = 0;
        for (Course course : courseList.getCourseList()) {
            for (Alumni alumni : alumniDirectory.getAlumniDir()) {
                if (alumni.getCourseCatalog().getCourseList().contains(course)) {
//                    courseAlumniCount++;
                    course.setCourseRating(course.getCourseRating() + 1);
//                    break;
                }
            }
            for (Employer employer : employerList) {
                for (String inDemandCourseContent : employer.getEmploymentCourses()) {
                    if (course.getCourseContentList().contains(inDemandCourseContent)) {
                        course.setCourseRating(course.getCourseRating() + 1);
                        break;
                    }
                }
            }
            course.setRatingPercent((course.getCourseRating()  * 100)/ (employerList.size() + alumniDirectory.getAlumniDir().size()));
        }
    }

    @Override
    public String toString() {
        return departmentName;
    }
    
}
