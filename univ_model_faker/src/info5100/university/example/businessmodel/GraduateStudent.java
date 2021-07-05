package info5100.university.example.businessmodel;

import java.util.List;

/**
 * @author Moumita
 */
public class GraduateStudent {
    String studentId;
    String studentName;

    String universityId;
    String departmentId;
    String courseId;

    double gpa;

    List<Employment> employmentList;

    public GraduateStudent(String studentId,
            String studentName,
            String universityId,
            String departmentId,
            String courseId,
            double gpa,
            List<Employment> employmentList){
        this.studentId = studentId;
        this.studentName = studentName;
        this.universityId = universityId;
        this.departmentId = departmentId;
        this.courseId = courseId;
        this.gpa = gpa;

        this.employmentList = employmentList;
    }

    public List<Employment> getEmploymentList(){
        return employmentList;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "studentId='" + studentId + '\'' + "\n" +
                ", studentName='" + studentName + '\'' + "\n" +
                ", universityId='" + universityId + '\'' + "\n" +
                ", departmentId='" + departmentId + '\'' + "\n" +
                ", courseId='" + courseId + '\'' + "\n" +
                ", gpa=" + gpa + "\n" +
                ", employmentList=" + employmentList + "\n" +
                '}';
    }

    public String getName() {
        return studentName;
    }

    public String getCourseId() {
        return courseId;
    }
}
