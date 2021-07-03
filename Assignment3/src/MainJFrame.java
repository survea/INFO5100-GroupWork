
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.course.Course;
import model.course.CourseCatalog;
import model.employer.Employer;
import model.employer.EmployerDirectory;
import model.person.Alumni;
import model.person.AlumniDirectory;
import model.person.Person;
import model.person.PersonDirectory;
import model.person.Student;
import model.person.StudentDirectory;
import model.university.University;
import model.university.UniversityDirectory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hp
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    EmployerDirectory empDir;
    CourseCatalog courseCatalog;
    StudentDirectory studDir;
    PersonDirectory personDir;
    AlumniDirectory alumniDirectory;
    UniversityDirectory univDir;

    public MainJFrame() {
        initComponents();
        empDir = new EmployerDirectory();
        courseCatalog = new CourseCatalog();
        studDir = new StudentDirectory();
        personDir = new PersonDirectory();
        alumniDirectory = new AlumniDirectory();
        univDir = new UniversityDirectory();
        final String COMMA_DELIMITER = ",";
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
            "INFO5100,AED,info sys course,4,3.75",
            "INFO5001,User interface,info sys course,4,3.85",
            "CSYE6200,OOPs,computer science course,4,3.80"
        };
        String[] employeeList = {
            "Amazon",
            "Flipkart",
            "Linkdln",
            "Walmart"
        };
        String[] emp1Courses = {
            "INFO5100",
            "csye6200"
        };

        List<String> csvEmployeeList = new ArrayList<>(Arrays.asList(employeeList));
        List<String> csvEmp1Courses = new ArrayList<>(Arrays.asList(emp1Courses));

        Employer employ1 = new Employer(csvEmployeeList.get(0), csvEmp1Courses);
        Employer employ2 = new Employer(csvEmployeeList.get(1), csvEmp1Courses);
        Employer employ3 = new Employer(csvEmployeeList.get(2), csvEmp1Courses);
        EmployerDirectory.addEmployer(employ1);
        EmployerDirectory.addEmployer(employ2);
        EmployerDirectory.addEmployer(employ3);

        List<String> csvCourseList = new ArrayList<>(Arrays.asList(newCourseList));
        for (String course : newCourseList) {
            String[] tokens = course.split(COMMA_DELIMITER);
            Course courseDetails = new Course(tokens[0], tokens[1],
                    tokens[2], Integer.parseInt(tokens[3]));
            CourseCatalog.addList(courseDetails);
        }

        List<String> csvStudentList = new ArrayList<>(Arrays.asList(newStudents));
        for (String student : csvStudentList) {
            String[] tokens = student.split(COMMA_DELIMITER);
            Student studentDetails = new Student(CourseCatalog.getCourseList(), Double.parseDouble(tokens[4]), Integer.parseInt(tokens[0]), tokens[2], tokens[3], Integer.parseInt(tokens[1]));
            StudentDirectory.addStudent(studentDetails);
            PersonDirectory.addPerson(studentDetails);
        }

        List<String> csvAlumniList = new ArrayList<>(Arrays.asList(alumniStudents));
        for (String student : csvAlumniList) {
            String[] tokens = student.split(COMMA_DELIMITER);
            Alumni alumniDetails = new Alumni("Employee1", null, CourseCatalog.getCourseList(), Double.parseDouble(tokens[4]), Integer.parseInt(tokens[0]), tokens[2], tokens[3], Integer.parseInt(tokens[1]));
            AlumniDirectory.addAlumni(alumniDetails);
            PersonDirectory.addPerson(alumniDetails);
        }

        University northeastern = new University();
        northeastern.setUniversityName("Northeastern University");
//        northeastern.setDepartmentList(departmentList);
        UniversityDirectory.addUniversity(northeastern);
        UniversityDirectory.getUniversityList().forEach(System.out::println);

        PersonDirectory.getPersonDir().forEach(System.out::println);
//        AlumniDirectory.alumniDir.forEach(System.out::println);
        CourseCatalog.getCourseList().forEach(System.out::println);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
