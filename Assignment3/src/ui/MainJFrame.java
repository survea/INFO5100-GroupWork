
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.course.Course;
import model.course.CourseCatalog;
import model.department.Department;
import model.employer.Employer;
import model.employer.EmployerDirectory;
import model.person.Alumni;
import model.person.AlumniDirectory;
import model.person.PersonDirectory;
import model.person.Student;
import model.person.StudentDirectory;
import model.person.alumniEmployment.EmploymentHistory;
import model.university.University;
import model.university.UniversityDirectory;

/**
 *
 * @author archil
 */
public class MainJFrame extends javax.swing.JFrame {

       /**
     * Creates new form Main
     */
    EmployerDirectory empDir;
    CourseCatalog courseCatalog;
    StudentDirectory studDir;
    PersonDirectory personDir;
    AlumniDirectory alumniDirectory;
    UniversityDirectory univDir;
    final String COMMA_DELIMITER = ",";

    public MainJFrame() {
        initComponents();
        setSize(800,700);
        setResizable(false);
       
        
        setLoginScreen();
        empDir = new EmployerDirectory();
        courseCatalog = new CourseCatalog();
        personDir = new PersonDirectory();
        alumniDirectory = new AlumniDirectory();
        univDir = new UniversityDirectory();

        String[] newStudents = {
            "1,47,Dan,Peters,3.75",
            "3,37,Allan,Simpson,3.85",
            "2,27,Don,Johnson,3.80"
        };
        String[] alumniStudents = {
            "4,47,Dan1,Peters,3.75",
            "5,37,Allan1,Simpson,3.85",
            "6,27,Don1,Johnson,3.80"
        };
        String[] newCourseList = {
            "INFO5100,AED,info sys course,4,0",
            "INFO5001,User interface,info sys course,4,0",
            "CSYE6200,OOPs,computer science course,4,0"
        };
        String[] employeeList = {
            "Amazon",
            "Flipkart",
            "Linkdln",
            "Walmart"
        };
        String[] emp1Courses = {
            "Java",
            "Angular",
            "HTML"
        };
        University northeastern = new University();
        List<String> csvCourseList = new ArrayList<>(Arrays.asList(newCourseList));
        northeastern.setUniversityName("Northeastern University");

        Department infoSys = new Department();
        studDir = new StudentDirectory(infoSys);
        infoSys.setDepartmentName("Information system");

        addDepartmentCourses(infoSys, csvCourseList);
        addDepartmentStudents(infoSys, studDir, newStudents);
        addDepartmentEmployers(infoSys, employeeList, emp1Courses);
        addDepartmentAlumni(infoSys, alumniStudents);

        northeastern.addDepartment(infoSys);
        UniversityDirectory.addUniversity(northeastern);
        UniversityDirectory.getUniversityList().forEach(System.out::println);

        calculateRating();

        PersonDirectory.getPersonDir().forEach(System.out::println);
        courseCatalog.getCourseList().forEach(System.out::println);
        EmployerDirectory.employerList.forEach(System.out::println);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainWorkArea.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    private void setLoginScreen() {

       LoginScreen loginScreen = new LoginScreen(mainWorkArea);
       mainWorkArea.add("LoginScreen", loginScreen);
       CardLayout layout = (CardLayout) mainWorkArea.getLayout();
       layout.next(mainWorkArea);

    }

    private void addDepartmentCourses(Department infoSys, List<String> csvCourseList) {
        String[] tokens = csvCourseList.get(0).split(COMMA_DELIMITER);
        Course info5100 = new Course(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]));
        info5100.addCourseContent("Java");
        info5100.addCourseContent("HTML");
        info5100.addCourseContent("Javascript");
        infoSys.addCourse(info5100);

        tokens = csvCourseList.get(1).split(COMMA_DELIMITER);
        Course INFO5001 = new Course(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]));
        INFO5001.addCourseContent("Angular");
        INFO5001.addCourseContent("React");
        INFO5001.addCourseContent("NodeJS");
        infoSys.addCourse(INFO5001);

        tokens = csvCourseList.get(2).split(COMMA_DELIMITER);
        Course CSYE6200 = new Course(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]));
        CSYE6200.addCourseContent("sql");
        CSYE6200.addCourseContent("mongoDB");
        infoSys.addCourse(CSYE6200);
    }

    private void addDepartmentStudents(Department dept, StudentDirectory studDir, String[] newStudents) {
        List<String> csvStudentList = new ArrayList<>(Arrays.asList(newStudents));
        for (String student : csvStudentList) {
            String[] tokens = student.split(COMMA_DELIMITER);
            Student studentDetails = new Student(Double.parseDouble(tokens[4]), Integer.parseInt(tokens[0]), tokens[2], tokens[3], Integer.parseInt(tokens[1]));

            studentDetails.addStudentCourse(dept.getCourseList().getCourseList().get(0));
            studentDetails.addStudentCourse(dept.getCourseList().getCourseList().get(0));
            studDir.addStudent(studentDetails);
            PersonDirectory.addPerson(studentDetails);
        }
    }

    private void addDepartmentEmployers(Department dept, String[] employeeList, String[] emp1Courses) {
        List<String> csvEmployeeList = new ArrayList<>(Arrays.asList(employeeList));
        List<String> csvEmp1Courses = new ArrayList<>(Arrays.asList(emp1Courses));

        Employer employ1 = new Employer(csvEmployeeList.get(0), csvEmp1Courses);
        Employer employ2 = new Employer(csvEmployeeList.get(1), csvEmp1Courses);
        Employer employ3 = new Employer(csvEmployeeList.get(2), csvEmp1Courses);
        dept.addEmployer(employ1);
        dept.addEmployer(employ2);
        dept.addEmployer(employ3);
        EmployerDirectory.addEmployer(employ1);
        EmployerDirectory.addEmployer(employ2);
        EmployerDirectory.addEmployer(employ3);
    }

    private void addDepartmentAlumni(Department dept, String[] alumniStudents) {
        List<String> csvAlumniList = new ArrayList<>(Arrays.asList(alumniStudents));
        for (String student : csvAlumniList) {
            String[] tokens = student.split(COMMA_DELIMITER);
            CourseCatalog alumniCourseCatalog = new CourseCatalog();
            alumniCourseCatalog.addCourse(dept.getCourseList().getCourseList().get(1));

            alumniCourseCatalog.addCourse(dept.getCourseList().getCourseList().get(1));
            Alumni alumniDetails = new Alumni("Employee1", null, alumniCourseCatalog, Double.parseDouble(tokens[4]), Integer.parseInt(tokens[0]), tokens[2], tokens[3], Integer.parseInt(tokens[1]));
            dept.addAlumni(alumniDetails);
//            AlumniDirectory.addAlumni(alumniDetails);
            PersonDirectory.addPerson(alumniDetails);
        }
    }

    private void calculateRating() {
        Department infosysDept = UniversityDirectory.getUniversityList().get(0).getDepartmentList().get(0);

        UniversityDirectory.getUniversityList().get(0).getDepartmentList().forEach(dept -> {
//            dept.getCourseList().getCourseList().forEach(course -> {
//                for (Employer employer : infosysDept.getEmployerList()) {
//                    for (String inDemandCourseContent : employer.getEmploymentCourses()) {
//                        if (course.getCourseContentList().contains(inDemandCourseContent)) {
//                            course.setCourseRating(course.getCourseRating() + 1);
//                            break;
//                        }
//                    }
//                }
//            });
            dept.calculateCourseRatingPercent();
            dept.getCourseList().getCourseList().forEach(System.out::println);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainWorkArea;
    // End of variables declaration//GEN-END:variables

  
}
