/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.util.Formatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.course.Course;
import model.department.Department;
import model.employer.Employer;
import model.person.Alumni;
import model.person.Faculty;
import model.person.Student;
import model.university.University;

/**
 *
 * @author dhairyasheel
 */
public class DepartmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DepartmentJPanel
     */
    JPanel mainWorkArea;

    public DepartmentJPanel(JPanel mainWorkArea) {

    }
    University university;

    DepartmentJPanel(JPanel mainWorkArea, University university) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.university = university;
        populateDepartmentCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRole2 = new javax.swing.JLabel();
        cmbDepartment = new javax.swing.JComboBox<>();
        lblRole1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        CoursePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        btnAddCourse = new javax.swing.JButton();
        btnUpdateCourse = new javax.swing.JButton();
        AlumniPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAlumni = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        EmpPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        FacultyPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblFaculty = new javax.swing.JTable();
        StudentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblRole3 = new javax.swing.JLabel();
        lblRole4 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDeptCourseRating = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 252, 251));

        lblRole2.setBackground(new java.awt.Color(254, 254, 254));
        lblRole2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblRole2.setForeground(new java.awt.Color(37, 106, 162));
        lblRole2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole2.setText("University Name");

        cmbDepartment.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        cmbDepartment.setForeground(new java.awt.Color(65, 82, 118));
        cmbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartmentActionPerformed(evt);
            }
        });

        lblRole1.setBackground(new java.awt.Color(254, 254, 254));
        lblRole1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblRole1.setForeground(new java.awt.Color(114, 150, 180));
        lblRole1.setText("Department :");

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        CoursePanel.setBackground(new java.awt.Color(254, 254, 254));

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course Code", "Course Name", "Keywords", "Course Ranking"
            }
        ));
        jScrollPane2.setViewportView(tblCourse);

        btnAddCourse.setBackground(new java.awt.Color(254, 254, 254));
        btnAddCourse.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAddCourse.setForeground(new java.awt.Color(100, 149, 162));
        btnAddCourse.setText("Add Course");
        btnAddCourse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        btnUpdateCourse.setBackground(new java.awt.Color(254, 254, 254));
        btnUpdateCourse.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnUpdateCourse.setForeground(new java.awt.Color(100, 149, 162));
        btnUpdateCourse.setText("Update Course");
        btnUpdateCourse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CoursePanelLayout = new javax.swing.GroupLayout(CoursePanel);
        CoursePanel.setLayout(CoursePanelLayout);
        CoursePanelLayout.setHorizontalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursePanelLayout.createSequentialGroup()
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CoursePanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CoursePanelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        CoursePanelLayout.setVerticalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Course Details", CoursePanel);

        AlumniPanel.setBackground(new java.awt.Color(254, 254, 254));

        tblAlumni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student", "Courses", "GPA", "Employer", "Salary", "EmploymentRating"
            }
        ));
        jScrollPane3.setViewportView(tblAlumni);

        btnView.setBackground(new java.awt.Color(254, 254, 254));
        btnView.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnView.setForeground(new java.awt.Color(100, 149, 162));
        btnView.setText("View ");
        btnView.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlumniPanelLayout = new javax.swing.GroupLayout(AlumniPanel);
        AlumniPanel.setLayout(AlumniPanelLayout);
        AlumniPanelLayout.setHorizontalGroup(
            AlumniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlumniPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(AlumniPanelLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AlumniPanelLayout.setVerticalGroup(
            AlumniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alumni Details", AlumniPanel);

        EmpPanel.setBackground(new java.awt.Color(254, 254, 254));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employer Name", "Courses", "Salary Offered"
            }
        ));
        jScrollPane4.setViewportView(tblEmployee);

        javax.swing.GroupLayout EmpPanelLayout = new javax.swing.GroupLayout(EmpPanel);
        EmpPanel.setLayout(EmpPanelLayout);
        EmpPanelLayout.setHorizontalGroup(
            EmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        EmpPanelLayout.setVerticalGroup(
            EmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Employer Details", EmpPanel);

        FacultyPanel.setBackground(new java.awt.Color(254, 254, 254));

        tblFaculty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Faculty Name", "Course", "Postition", "Rating"
            }
        ));
        jScrollPane5.setViewportView(tblFaculty);

        javax.swing.GroupLayout FacultyPanelLayout = new javax.swing.GroupLayout(FacultyPanel);
        FacultyPanel.setLayout(FacultyPanelLayout);
        FacultyPanelLayout.setHorizontalGroup(
            FacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacultyPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        FacultyPanelLayout.setVerticalGroup(
            FacultyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacultyPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Faculty Details", FacultyPanel);

        StudentPanel.setBackground(new java.awt.Color(254, 254, 254));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Courses", "GPA"
            }
        ));
        jScrollPane1.setViewportView(tblStudent);

        javax.swing.GroupLayout StudentPanelLayout = new javax.swing.GroupLayout(StudentPanel);
        StudentPanel.setLayout(StudentPanelLayout);
        StudentPanelLayout.setHorizontalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        StudentPanelLayout.setVerticalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Students Details", StudentPanel);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRole3.setBackground(new java.awt.Color(254, 254, 254));
        lblRole3.setFont(new java.awt.Font("Ubuntu", 1, 60)); // NOI18N
        lblRole3.setForeground(new java.awt.Color(232, 54, 39));
        lblRole3.setText("2");

        lblRole4.setBackground(new java.awt.Color(254, 254, 254));
        lblRole4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblRole4.setForeground(new java.awt.Color(114, 150, 180));
        lblRole4.setText("University Rank");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRole3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblRole4)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRole3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole4)
                .addGap(24, 24, 24))
        );

        btnLogout.setBackground(new java.awt.Color(254, 254, 254));
        btnLogout.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(229, 70, 69));
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(103, 130, 167));
        jLabel1.setText("Course Ranking(Market Trend):");

        txtDeptCourseRating.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtDeptCourseRating.setForeground(new java.awt.Color(211, 64, 71));
        txtDeptCourseRating.setText("98.0%");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(103, 130, 167));
        jLabel3.setText("Faculty Ranking:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(211, 64, 71));
        jLabel4.setText("98.0%");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(103, 130, 167));
        jLabel5.setText("Employment Ranking(Placement):");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(211, 64, 71));
        jLabel6.setText("98.0%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblRole2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtDeptCourseRating))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblRole1)
                                .addGap(18, 18, 18)
                                .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRole1))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDeptCourseRating))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartmentActionPerformed
        // TODO add your handling code here:
        populateCourseTable();
        populateAlumniTable();
        populateEmployerTable();
        populateFacultyTable();
        populateStudentsTable();
        Formatter dobleFormatter = new Formatter();
        dobleFormatter.format("%.2f", ((Department) cmbDepartment.getSelectedItem()).calculateDeptCoursesRating());
        txtDeptCourseRating.setText(String.valueOf(dobleFormatter) + "%");
    }//GEN-LAST:event_cmbDepartmentActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginScreen loginScreen = new LoginScreen(mainWorkArea);
        mainWorkArea.add("LoginScreen", loginScreen);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        // TODO add your handling code here:
        CoursesJPanel courseJPanel = new CoursesJPanel(mainWorkArea);
        mainWorkArea.add("CourseJPanel", courseJPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnUpdateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCourseActionPerformed
        // TODO add your handling code here:

        CourseUpdateJPanel1 courseJPanel = new CourseUpdateJPanel1(mainWorkArea);
        mainWorkArea.add("CourseJPanel", courseJPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnUpdateCourseActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        AlumniJPanel aluminiJPanel = new AlumniJPanel(mainWorkArea);
        mainWorkArea.add("AluminiJPanel", aluminiJPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnViewActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        int index = jTabbedPane1.getSelectedIndex();
        if (index == 0) {
            populateCourseTable();
        } else if (index == 1) {
            populateAlumniTable();
        } else if (index == 2) {
            populateEmployerTable();
        } else if (index == 3) {
            populateFacultyTable();
        } else if (index == 4) {
            populateStudentsTable();
        }

    }//GEN-LAST:event_jTabbedPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlumniPanel;
    private javax.swing.JPanel CoursePanel;
    private javax.swing.JPanel EmpPanel;
    private javax.swing.JPanel FacultyPanel;
    private javax.swing.JPanel StudentPanel;
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdateCourse;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<Object> cmbDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblRole1;
    private javax.swing.JLabel lblRole2;
    private javax.swing.JLabel lblRole3;
    private javax.swing.JLabel lblRole4;
    private javax.swing.JTable tblAlumni;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTable tblFaculty;
    private javax.swing.JTable tblStudent;
    private javax.swing.JLabel txtDeptCourseRating;
    // End of variables declaration//GEN-END:variables

    private void populateCourseTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
            model.setRowCount(0);
            for (Course course : ((Department) cmbDepartment.getSelectedItem()).getCourseList().getCourseList()) {
                StringBuffer sb = new StringBuffer();

                for (String courceContent : course.getCourseContentList()) {
                    sb.append(courceContent);
                    sb.append(", ");
                }
                Formatter formatRatingPercent = new Formatter();
                formatRatingPercent.format("%.2f", course.getRatingPercent());
                String courseContentString = sb.toString();
                Object row[] = new Object[4];
                row[0] = course.getCourseCode();
                row[1] = course.getCourseName();
                row[2] = courseContentString;
                row[3] = String.valueOf(formatRatingPercent);
                model.addRow(row);
            }
        } catch (Exception e) {

        }
    }

    private void populateDepartmentCombo() {
        cmbDepartment.removeAllItems();
        for (Department dept : university.getDepartmentList()) {
            cmbDepartment.addItem(dept);
        }
    }

    private void populateAlumniTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblAlumni.getModel();
            model.setRowCount(0);
            for (Alumni alumni : ((Department) cmbDepartment.getSelectedItem()).getAlumniDirectory().getAlumniDir()) {
                StringBuffer sb = new StringBuffer();

                for (Course course : alumni.getCourseCatalog().getCourseList()) {
                    sb.append(course.getCourseCode());
                    sb.append(", ");
                }
                String courseNameString = sb.toString();
                Object row[] = new Object[6];
                row[0] = String.valueOf(alumni.getFirstName() + " " + alumni.getLastName());
                row[1] = courseNameString;
                row[2] = String.valueOf(alumni.getGpa());
                row[3] = alumni.getEmployer();
                row[4] = String.valueOf(alumni.getSalary());
                row[5] = String.valueOf(alumni.getEmploymentRatingPercent());
                model.addRow(row);
            }
        } catch (Exception e) {

        }
    }

    private void populateEmployerTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
            model.setRowCount(0);
            for (Employer employer : ((Department) cmbDepartment.getSelectedItem()).getEmployerList()) {
                StringBuffer sb = new StringBuffer();

                for (String courceContent : employer.getEmploymentCourses()) {
                    sb.append(courceContent);
                    sb.append(", ");
                }
                String courseContentString = sb.toString();
                Object row[] = new Object[4];
                row[0] = employer.getName();
                row[1] = courseContentString;
//                row[2] = courseContentString;
//                row[3] = String.valueOf(course.getRatingPercent());
                model.addRow(row);
            }
        } catch (Exception e) {

        }
    }

    private void populateFacultyTable() {
                try {
            DefaultTableModel model = (DefaultTableModel) tblFaculty.getModel();
            model.setRowCount(0);
            for (Faculty faculty : ((Department) cmbDepartment.getSelectedItem()).getFacultydirectory().getFacultyList()) {
                StringBuffer sb = new StringBuffer();

                for (Course course : faculty.getCourseList().getCourseList()) {
                    sb.append(course.getCourseCode());
                    sb.append(", ");
                }
                faculty.calcRating();
                String courseNameString = sb.toString();
                Object row[] = new Object[4];
                row[0] = String.valueOf(faculty.getFirstName() + " " + faculty.getLastName());
                row[1] = courseNameString;
//                row[2] = courseContentString;
                row[3] = String.valueOf(faculty.getRating());
                model.addRow(row);
            }
        } catch (Exception e) {

        }
    }

    private void populateStudentsTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
            model.setRowCount(0);
            for (Student student : ((Department) cmbDepartment.getSelectedItem()).getStudentdirectory().studentList) {
                StringBuffer sb = new StringBuffer();

                for (Course course : student.getCourseCatalog().getCourseList()) {
                    sb.append(course.getCourseCode());
                    sb.append(", ");
                }
                String courseNameString = sb.toString();
                Object row[] = new Object[4];
                row[0] = String.valueOf(student.getId());
                row[1] = String.valueOf(student.getFirstName() + " " + student.getLastName());
                row[2] = courseNameString;
                row[3] = String.valueOf(student.getGpa());
//                row[3] = alumni.getEmployer();
//                row[4] = String.valueOf(alumni.getSalary());
                model.addRow(row);
            }
        } catch (Exception e) {

        }
    }
}
