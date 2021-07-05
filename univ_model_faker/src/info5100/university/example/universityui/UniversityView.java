/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.universityui;

import info5100.university.example.businessmodel.Faculty;
import info5100.university.example.businessmodel.Popularity;
import info5100.university.example.businessmodel.University;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

/**
 * @author Moumita
 */
public class UniversityView extends javax.swing.JPanel {

    List<University> universities;
    JTable tableUniversity;

    /**
     * Creates new form University
     */
    public UniversityView(List<University> universities) {
        initComponents();
        this.universities = universities;

        loadTableView();
    }

    private void loadTableView() {
        DefaultTableModel model = new DefaultTableModel();
        tableUniversity = new JTable(model);
        tableUniversity.setDefaultEditor(Object.class, null);
        tableUniversity.setRowSelectionAllowed(true);
        tableUniversity.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        model.addColumn("University ID");
        model.addColumn("University Name");
        model.addColumn("Department ID");
        model.addColumn("Department");
        model.addColumn("Course ID");
        model.addColumn("Course");
        model.addColumn("Popularity");

        DefaultTableModel finalModel1 = model;
        universities.forEach(u -> {
            String universityName = u.getName();
            String universityId = u.getId();

            u.getDepartments()
                    .forEach(d->{
                        String department = d.getName();
                        String departmentId = d.getId();

                        d.getListOfCourses().forEach(course -> {
                            String courseId = course.getCourseId();
                            String courseName = course.getCourseName();
                            String popularity = course.getCoursePopularity();
                            finalModel1.addRow(new Object[]{
                                    universityId,
                                    universityName,
                                    departmentId,
                                    department,
                                    courseId,
                                    courseName,
                                    popularity});
                        });
                    });
            System.out.println(u);
        });

        jScrollPane1.setViewportView(tableUniversity);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        labelUniName = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 139));
        jLabel7.setText("UNIVERSITY VIEW");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info5100/university/example/images/university.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 748, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        controlPanel.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelUniName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUniName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setForeground(new java.awt.Color(0, 0, 139));
        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(tableUniversity != null){
            int row = tableUniversity.getSelectedRow();
            System.out.println(row);

            if(row < 0 ){
                JOptionPane.showMessageDialog(this, "Please select a row to view!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int selectedUniId = Integer
                    .parseInt(String.valueOf(
                            tableUniversity.getModel()
                                    .getValueAt(row, 0)));

            University selectedUni = universities.stream()
                    .filter((uni) -> Integer.parseInt(uni.getId()) == selectedUniId).findFirst().get();

            showUniversityDetails(selectedUni);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void showUniversityDetails(University selectedUni) {
        /*
        model.addColumn("University ID");
        model.addColumn("University Name");
        model.addColumn("Department ID");
        model.addColumn("Department");
        model.addColumn("Course ID");
        model.addColumn("Course");
        model.addColumn("Popularity");
        * */

        int row = tableUniversity.getSelectedRow();
        String selectedUniId = String.valueOf(
                tableUniversity.getModel()
                        .getValueAt(row, 0));
        String selectedUniName = String.valueOf(
                tableUniversity.getModel()
                        .getValueAt(row, 1));
        labelUniName.setText(selectedUniName);

        University university = universities.stream()
                .filter(u -> u.getId().equals(selectedUniId))
                .findFirst().get();

        String selectedDepartmentId = String.valueOf(
                tableUniversity.getModel()
                        .getValueAt(row, 2));

        String selectedCourseId = String.valueOf(
                tableUniversity.getModel()
                        .getValueAt(row, 4));



        //controlPanel = new JPanel();
        controlPanel.setLayout(new CardLayout());

        final int[] x = {0};
        final int[] y = {0};
        university.getDepartments().forEach(department -> {

            if(department.getId().equals(selectedDepartmentId)){
                department.getListOfCourses().forEach(c->{
                    if(c.getCourseId().equals(selectedCourseId)){
                        String courseName = c.getCourseName();
                        String coursePopularity = c.getCoursePopularity();

                        Faculty faculty = department.getFaculties().stream()
                                .filter(f->f.getFacultyRating(selectedCourseId) != null)
                                .findFirst()
                                .get();
                        String facultyName = faculty.getName();
                        String facultyPopularity = faculty.getFacultyRating(selectedCourseId).name();

                        DepartmentView dv = new DepartmentView(department.getName(),
                                courseName, coursePopularity, facultyName, facultyPopularity);

                        dv.setSize(300, 100);
                        dv.setAlignmentX(x[0]);
                        dv.setAlignmentY(y[0]);
                        controlPanel.add(dv);

                        x[0] +=300;
                        y[0] +=100;
                    }
                });
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelUniName;
    // End of variables declaration//GEN-END:variables
}
