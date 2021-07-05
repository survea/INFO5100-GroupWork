package info5100.university.example.businessmodel;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author Moumita
 */
public class Application {

    public static void main(String[] args) {
        University university = new University("Northeastern University", "1");
        Department department = new Department("1", "College Of Engineering");
        Course course = new Course("1", "Information Systems");
        course.popularity = Popularity.Excellent;
        Faculty faculty = new Faculty("1", "Robin H");
        faculty.updateCoursesTaught(course);
        faculty.updateCourseRating(course.courseId, Popularity.Excellent);

        department.addCoursesInDepartment(course);
        department.addFacultiesInDepartment(faculty);

        // dummy
        Course course1 = new Course("2", "Computer Systems Engineering");
        course1.popularity = Popularity.Good;
        Faculty faculty1 = new Faculty("2", "Kal B");
        faculty1.updateCoursesTaught(course1);
        faculty1.updateCourseRating(course1.courseId, Popularity.Average);

        department.addCoursesInDepartment(course1);
        department.addFacultiesInDepartment(faculty1);
        // end dummy.

        university.addADepartment(department);

        Employer employer = new Employer("1",
                "Google", "www.google.com",
                "Internet Services and Retailing",
                Reputation.FortuneTopTen);

        Employment employment = new Employment("1",
                employer, "24", "Senior Software Engineer", 2);

        GraduateStudent graduateStudent = new GraduateStudent(
                "1", "Name", "1", "1",
                "1", 4.0, new ArrayList<>(Arrays.asList(employment)));

        university.addAGraduateStudent(graduateStudent);

        // dummy
        Employer employer2 = new Employer("1",
                "Honeywell", "www.honeywell.com",
                "Electronics",
                Reputation.FortuneTopHundred);

        Employment employment1 = new Employment("1",
                employer2, "24", "Software Engineer", 0);

        GraduateStudent graduateStudent1 = new GraduateStudent(
                "2", "Name", "1", "1",
                "2", 3.5, new ArrayList<>(Arrays.asList(employment1)));
        university.addAGraduateStudent(graduateStudent1);

        // end dummy.

        System.out.println(university);
    }
}
