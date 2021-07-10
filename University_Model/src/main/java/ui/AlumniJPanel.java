/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.department.Department;
import model.person.Alumni;
import model.university.University;

/**
 *
 * @author dhairyasheel
 */
public class AlumniJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AlumniJPanel
     */
   JPanel mainWorkArea;
   University university;
   Alumni alumni;
   Department department;
   String view;
    public AlumniJPanel( JPanel mainWorkArea,University university, Alumni alumni,Department department, String view) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.university= university;
        this. alumni =alumni;
        this.department =department;
        this.view = view;
        
        if(view.equals("student")){
            btnAddAlumni.setEnabled(false);
        }
        txtStudentID.setText(String.valueOf(alumni.getId()));
        txtName.setText(String.valueOf(alumni.getFirstName() + " " + alumni.getLastName()));
        txtGpa.setText(String.valueOf(alumni.getGpa()));
        StringBuilder sb = new StringBuilder();
        alumni.getCourseCatalog().getCourseList().stream().map(course -> {
            sb.append(course.getCourseCode());
           return course;
       }).forEachOrdered(_item -> {
           sb.append(", ");
       });
        String courseNameString = sb.toString();
        txtCourses.setText(courseNameString);
        poplulateEmpHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        addjPanel3 = new javax.swing.JPanel();
        lblCourseCode = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        lblCourseName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblkeywords = new javax.swing.JLabel();
        lblCredits = new javax.swing.JLabel();
        txtGpa = new javax.swing.JTextField();
        txtCourses = new javax.swing.JTextField();
        txtGpa1 = new javax.swing.JTextField();
        lblCredits1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        addjPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnAddAlumni = new javax.swing.JButton();
        addjPanel5 = new javax.swing.JPanel();
        btnFeedback = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 254, 254));

        lblTitle.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(78, 105, 151));
        lblTitle.setText("Alumni Information");

        addjPanel3.setBackground(new java.awt.Color(254, 254, 254));
        addjPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Profile", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 15), new java.awt.Color(95, 139, 162))); // NOI18N

        lblCourseCode.setBackground(new java.awt.Color(254, 254, 254));
        lblCourseCode.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCourseCode.setForeground(new java.awt.Color(114, 150, 180));
        lblCourseCode.setText("Student ID:");

        txtStudentID.setDisabledTextColor(new java.awt.Color(41, 35, 28));
        txtStudentID.setEnabled(false);
        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });

        lblCourseName.setBackground(new java.awt.Color(254, 254, 254));
        lblCourseName.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCourseName.setForeground(new java.awt.Color(114, 150, 180));
        lblCourseName.setText("Name:");

        txtName.setDisabledTextColor(new java.awt.Color(41, 35, 28));
        txtName.setEnabled(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblkeywords.setBackground(new java.awt.Color(254, 254, 254));
        lblkeywords.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblkeywords.setForeground(new java.awt.Color(114, 150, 180));
        lblkeywords.setText("Courses:");

        lblCredits.setBackground(new java.awt.Color(254, 254, 254));
        lblCredits.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCredits.setForeground(new java.awt.Color(114, 150, 180));
        lblCredits.setText("GPA:");

        txtGpa.setDisabledTextColor(new java.awt.Color(41, 35, 28));
        txtGpa.setEnabled(false);

        txtCourses.setDisabledTextColor(new java.awt.Color(41, 35, 28));
        txtCourses.setEnabled(false);
        txtCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoursesActionPerformed(evt);
            }
        });

        txtGpa1.setDisabledTextColor(new java.awt.Color(41, 35, 28));
        txtGpa1.setEnabled(false);

        lblCredits1.setBackground(new java.awt.Color(254, 254, 254));
        lblCredits1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblCredits1.setForeground(new java.awt.Color(114, 150, 180));
        lblCredits1.setText("Graduate Year:");

        javax.swing.GroupLayout addjPanel3Layout = new javax.swing.GroupLayout(addjPanel3);
        addjPanel3.setLayout(addjPanel3Layout);
        addjPanel3Layout.setHorizontalGroup(
            addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addjPanel3Layout.createSequentialGroup()
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addjPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblCourseCode))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addjPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblkeywords)))
                .addGap(18, 18, 18)
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(txtCourses))
                .addGap(93, 93, 93)
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addjPanel3Layout.createSequentialGroup()
                        .addComponent(lblCredits)
                        .addGap(18, 18, 18)
                        .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addjPanel3Layout.createSequentialGroup()
                        .addComponent(lblCourseName)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(lblCredits1)
                .addGap(18, 18, 18)
                .addComponent(txtGpa1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        addjPanel3Layout.setVerticalGroup(
            addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addjPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseCode)
                    .addComponent(lblCourseName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkeywords)
                    .addComponent(txtCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addjPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCredits1)
                        .addComponent(txtGpa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCredits)))
                .addGap(46, 46, 46))
        );

        btnBack.setBackground(new java.awt.Color(254, 254, 254));
        btnBack.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnBack.setForeground(new java.awt.Color(100, 149, 162));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        addjPanel4.setBackground(new java.awt.Color(254, 254, 254));
        addjPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Employment History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 15), new java.awt.Color(95, 139, 162))); // NOI18N

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Employer", "Position", "Date of Joining", "Date of Resignation", "Salary "
            }
        ));
        jScrollPane4.setViewportView(tblEmployee);

        btnAddAlumni.setBackground(new java.awt.Color(254, 254, 254));
        btnAddAlumni.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAddAlumni.setForeground(new java.awt.Color(100, 149, 162));
        btnAddAlumni.setText("Add");
        btnAddAlumni.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddAlumni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAlumniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addjPanel4Layout = new javax.swing.GroupLayout(addjPanel4);
        addjPanel4.setLayout(addjPanel4Layout);
        addjPanel4Layout.setHorizontalGroup(
            addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addjPanel4Layout.createSequentialGroup()
                .addGroup(addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addjPanel4Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(btnAddAlumni, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addjPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        addjPanel4Layout.setVerticalGroup(
            addjPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addjPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddAlumni, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        addjPanel5.setBackground(new java.awt.Color(254, 254, 254));
        addjPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Alumni Feedback", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 15), new java.awt.Color(95, 139, 162))); // NOI18N

        btnFeedback.setBackground(new java.awt.Color(254, 254, 254));
        btnFeedback.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnFeedback.setForeground(new java.awt.Color(100, 149, 162));
        btnFeedback.setText("View Feedback");
        btnFeedback.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addjPanel5Layout = new javax.swing.GroupLayout(addjPanel5);
        addjPanel5.setLayout(addjPanel5Layout);
        addjPanel5Layout.setHorizontalGroup(
            addjPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addjPanel5Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(btnFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addjPanel5Layout.setVerticalGroup(
            addjPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addjPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addjPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addjPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addjPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addjPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addjPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addjPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        backMethod();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddAlumniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlumniActionPerformed
        // TODO add your handling code here:
        EmploymentHistoryJPanel aluminiJPanel = new EmploymentHistoryJPanel(mainWorkArea,university,alumni,department, view);
        mainWorkArea.add("AluminiJPanel", aluminiJPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnAddAlumniActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        // TODO add your handling code here:

        AlumniFeedbackJPanel aluminiFeedback = new AlumniFeedbackJPanel(mainWorkArea,university,alumni,department, view);
        mainWorkArea.add("AlumniFeedbackJPanel", aluminiFeedback);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void txtCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoursesActionPerformed

    private void backMethod() {
        DepartmentJPanel courseJPanel = new DepartmentJPanel(mainWorkArea, university, view);
       mainWorkArea.add("DepartmentJPanel", courseJPanel);
       CardLayout layout = (CardLayout) mainWorkArea.getLayout();
       layout.next(mainWorkArea);
         }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addjPanel3;
    private javax.swing.JPanel addjPanel4;
    private javax.swing.JPanel addjPanel5;
    private javax.swing.JButton btnAddAlumni;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCourseCode;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblCredits1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblkeywords;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtCourses;
    private javax.swing.JTextField txtGpa;
    private javax.swing.JTextField txtGpa1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables

    private void poplulateEmpHistory() {
        // WE NEED TO UPDATE HERE FOR EMP HISTORY
        try {
            DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
            model.setRowCount(0);
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            alumni.getEmploymentHistory().stream().map(employment -> {
                Object row[] = new Object[6];
                row[0] = employment.getEmployerName();
                row[1] = employment.getPostion();
                row[2] = dateFormat.format(employment.getJoiningDate());
                row[3] = dateFormat.format(employment.getResignationDate());
                row[4] = String.valueOf(employment.getSalary());
                return row;
            }).forEachOrdered(row -> {
                model.addRow(row);
            });
        } catch (Exception e) {

        }
    }
}
