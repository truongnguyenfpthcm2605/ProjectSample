/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.ChuyenDeDAO;
import DAO.KhoaHocDAO;
import Enity.ChuyenDe;
import Enity.KhoaHoc;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author truong
 */
public class QuanLyKhoaHoc extends javax.swing.JFrame {

    DefaultTableModel tableModel = new DefaultTableModel();
    ChuyenDeDAO daocd = new ChuyenDeDAO();
    KhoaHocDAO daokh = new KhoaHocDAO();
    KhoaHoc course = new KhoaHoc();
    MessageNotifycation mess = new MessageNotifycation();
    CheckData data = new CheckData();
    ChuyenDe cd = new ChuyenDe();
    int row = -1;

    /**
     * Creates new form QuanLyKhoaHOc
     */
    public QuanLyKhoaHoc() {
        initComponents();
        initFrame();

    }

    public void initColumnTable() {
        tableModel = (DefaultTableModel) tblList.getModel();
        tableModel.setColumnIdentifiers(new String[]{"Ma KH", "Thoi Luong", "Hoc Phi", "Khai Giang", "Tao Boi", "Ngay Tao"});
        tblList.setEnabled(true);
        this.fillComboboxChuyenDe();
    }

    public boolean checkForm() {
        if (!data.checkIsEmpty(txtKhaiGiang)) {
            data.changColorLabel(false, lblerrKhaiGiang, "Opening day is not empty");
            return false;
        } else if (!data.checkDate(txtKhaiGiang.getText())) {
            data.changColorLabel(false, lblerrKhaiGiang, "Date format (yyyy-mm-dd)");
            return false;
        } else {
            data.changColorLabel(true, lblerrKhaiGiang, null);
        }
        if (txtGhiChu.getText().isEmpty()) {
            data.changColorLabel(false, lblerrGhiChu, "Text note is not empty");
            return false;
        } else {
            data.changColorLabel(true, lblerrNgayTao, null);
        }

        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTenChuyenDe = new javax.swing.JLabel();
        pnlbackground = new javax.swing.JPanel();
        pnlCboList = new javax.swing.JPanel();
        cboList = new javax.swing.JComboBox<>();
        tabs = new javax.swing.JTabbedPane();
        pnlList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        pnlUpdate = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNguoiTao = new javax.swing.JTextField();
        txtChuyenDe = new javax.swing.JTextField();
        txtKhaiGiang = new javax.swing.JTextField();
        txtThoiLuong = new javax.swing.JTextField();
        txtHocPhi = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        pnlController = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnReverse = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblerrNgayTao = new javax.swing.JLabel();
        lblerrKhaiGiang = new javax.swing.JLabel();
        lblerrGhiChu = new javax.swing.JLabel();
        lblerrNguoiTao = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTenChuyenDe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTenChuyenDe.setForeground(new java.awt.Color(255, 0, 0));
        lblTenChuyenDe.setText("Chuyen De ");

        pnlbackground.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout pnlbackgroundLayout = new javax.swing.GroupLayout(pnlbackground);
        pnlbackground.setLayout(pnlbackgroundLayout);
        pnlbackgroundLayout.setHorizontalGroup(
            pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        pnlbackgroundLayout.setVerticalGroup(
            pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlCboList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCboListLayout = new javax.swing.GroupLayout(pnlCboList);
        pnlCboList.setLayout(pnlCboListLayout);
        pnlCboListLayout.setHorizontalGroup(
            pnlCboListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCboListLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cboList, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCboListLayout.setVerticalGroup(
            pnlCboListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCboListLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(cboList, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tblList.setBackground(new java.awt.Color(255, 0, 255));
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tabs.addTab("List", pnlList);

        jLabel2.setText("Chuyen De :");

        jLabel3.setText("Hoc Phi :");

        jLabel4.setText("Nguoi Tao : ");

        jLabel5.setText("Khai Giang : ");

        jLabel6.setText("Thoi Luong (Gio) : ");

        jLabel7.setText("Ngay Tao : ");

        txtNguoiTao.setEnabled(false);

        txtChuyenDe.setEnabled(false);

        txtThoiLuong.setEnabled(false);

        txtHocPhi.setEnabled(false);

        txtNgayTao.setEnabled(false);

        jLabel8.setText("Ghi Chu  : ");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-save-icon.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlController.add(btnAdd);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-validated-icon.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        pnlController.add(btnEdit);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Trash-can-icon.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlController.add(btnDelete);

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-file-icon.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        pnlController.add(btnNew);

        btnFirst.setText("<<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel7.add(btnFirst);

        btnReverse.setText("<");
        btnReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReverseActionPerformed(evt);
            }
        });
        jPanel7.add(btnReverse);

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel7.add(btnNext);

        btnLast.setText(">>");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel7.add(btnLast);

        lblerrNgayTao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblerrNgayTao.setText(" ");

        lblerrKhaiGiang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblerrKhaiGiang.setText(" ");

        lblerrGhiChu.setText(" ");

        lblerrNguoiTao.setText(" ");

        javax.swing.GroupLayout pnlUpdateLayout = new javax.swing.GroupLayout(pnlUpdate);
        pnlUpdate.setLayout(pnlUpdateLayout);
        pnlUpdateLayout.setHorizontalGroup(
            pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateLayout.createSequentialGroup()
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKhaiGiang, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(pnlUpdateLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblerrKhaiGiang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addComponent(pnlController, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                    .addGroup(pnlUpdateLayout.createSequentialGroup()
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlUpdateLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(247, 247, 247))
                            .addComponent(txtNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblerrNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblerrNgayTao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblerrGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlUpdateLayout.setVerticalGroup(
            pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKhaiGiang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(lblerrKhaiGiang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblerrNgayTao)
                    .addComponent(lblerrNguoiTao))
                .addGap(1, 1, 1)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblerrGhiChu)
                .addGap(0, 0, 0)
                .addGroup(pnlUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlController, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        tabs.addTab("Update", pnlUpdate);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print-icon.png"))); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCboList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTenChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tabs)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pnlbackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTenChuyenDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCboList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(pnlbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        initColumnTable();
    }//GEN-LAST:event_formWindowOpened

    private void cboListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboListActionPerformed
        this.fillTable();
    }//GEN-LAST:event_cboListActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (checkForm()) {
            this.insert();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (checkForm()) {
            this.update();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

        this.clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReverseActionPerformed
        this.pre();
    }//GEN-LAST:event_btnReverseActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        try {
            row = tblList.getSelectedRow();
            if (row != -1) {
                tblList.setRowSelectionInterval(row, row);
            }
            if (evt.getClickCount() == 2) {
                this.edit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblListMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mess.print(tblList, "List Courses", "Fpoly.com");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyKhoaHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReverse;
    private javax.swing.JComboBox<String> cboList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTenChuyenDe;
    private javax.swing.JLabel lblerrGhiChu;
    private javax.swing.JLabel lblerrKhaiGiang;
    private javax.swing.JLabel lblerrNgayTao;
    private javax.swing.JLabel lblerrNguoiTao;
    private javax.swing.JPanel pnlCboList;
    private javax.swing.JPanel pnlController;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlUpdate;
    private javax.swing.JPanel pnlbackground;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtChuyenDe;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtKhaiGiang;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtNguoiTao;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables
    public void initFrame() {
        CreateFormat.formatJrame(this, "Quan Ly Khoa Hoc");
       

    }

    public void fillComboboxChuyenDe() {
        DefaultComboBoxModel com = (DefaultComboBoxModel) cboList.getModel();
        com.removeAllElements();
        List<ChuyenDe> list = daocd.getAllDate();
        for (ChuyenDe chuyenDe : list) {
            com.addElement(chuyenDe);
        }
       this.fillTable();
    }

    public void fillTable() {
        tableModel = (DefaultTableModel) tblList.getModel();
        tableModel.setRowCount(0);
        try {
            cd = (ChuyenDe) cboList.getSelectedItem();
            if (cd != null) {
                List<KhoaHoc> list = daokh.selectByChuyenDe(cd.getMaCD());
                for (KhoaHoc e : list) {
                    tableModel.addRow(new Object[]{e.getMaKhoaHoc(), e.getThoiLuong(), e.getHocPhi(), e.getNgayKG(), e.getMaNV(), e.getNgayTao()});

                }
            }
        } catch (Exception e) {

        }
    }

    public void chonChuyenDe() {

        cd = (ChuyenDe) cboList.getSelectedItem();
        if (cd != null) {
            txtThoiLuong.setText(String.valueOf(cd.getThoiLuong()));
            txtHocPhi.setText(String.valueOf(cd.getHocPhi()));
            txtGhiChu.setText(cd.getTenCD());
            txtChuyenDe.setText(cd.getTenCD());
        }
        this.fillTable();
        this.row = -1;
        this.updatestates();
        tabs.setSelectedIndex(0);
    }
//

    public void insert() {
        course = getForm();
        if (daokh.selectByID(String.valueOf(course.getMaKhoaHoc())) != null) {
            mess.messageNotify(this, "You can't the same Id", "Error");
        } else {
            try {
                if (mess.confirmMessage(this, "Do you want to insert this course ?", "Question") == JOptionPane.YES_OPTION) {
                    daokh.insert(course);
                    fillTable();
                    clearForm();
                    tabs.setSelectedIndex(0);
                    mess.messageNotify(this, "Insert successfull", "Success");
                }

            } catch (Exception e) {
                mess.messageNotify(this, "Insert  fail", "Error");

            }
        }
    }

    public void update() {
        course = getForm();
        try {
            if (mess.confirmMessage(this, "Do you want to update this course ?", "Question") == JOptionPane.YES_OPTION) {
                daokh.update(course);
                fillTable();
                clearForm();
                tabs.setSelectedIndex(0);
            }
            mess.messageNotify(this, "Update successfull", "Success");
        } catch (Exception e) {
            mess.messageNotify(this, "Update fail", "Error");
        }
    }

    public void delete() {

        try {
            if (mess.confirmMessage(this, "Do you want to delete this course?", "Warring") == JOptionPane.YES_OPTION) {
                cd = (ChuyenDe) cboList.getSelectedItem();
                  KhoaHoc courses = daokh.selectByCourse((int) tblList.getValueAt(row, 0));
                daokh.deletes(courses.getMaKhoaHoc());
                this.fillTable();
                clearForm();
                tabs.setSelectedIndex(0);
                mess.messageNotify(this, "Delete successful", "Success");
            }
        } catch (Exception e) {
            mess.messageNotify(this, "Delete Fail, MANH is esixts in Learner, ", "Error");
           
        }

    }

    public void clearForm() {
        txtKhaiGiang.setText("");
        txtKhaiGiang.setBackground(Color.white);
        txtNgayTao.setText("");
        txtNgayTao.setBackground(Color.white);
        txtGhiChu.setText("");
        txtGhiChu.setBackground(Color.white);
        lblerrKhaiGiang.setText(" ");
        lblerrNgayTao.setText(" ");
        lblerrGhiChu.setText(" ");
        clearNV();

    }

    public void edit() {
        cd = (ChuyenDe) cboList.getSelectedItem();
        course = daokh.selectByID(cd.getMaCD());
        setForm(course);
        tabs.setSelectedIndex(1);
        updatestates();
    }

    public void first() {
        this.row = 0;
        this.edit();
    }

    public void pre() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    public void next() {
        if (this.row > tblList.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    public void last() {
        this.row = tblList.getRowCount() - 1;
        this.edit();
    }
    int makh;

    public void setForm(KhoaHoc course) {
        cd = (ChuyenDe) cboList.getSelectedItem();
        txtChuyenDe.setText(cd.getTenCD());
        txtHocPhi.setText(String.valueOf(cd.getHocPhi()));
        txtNguoiTao.setText(course.getMaNV());
        txtGhiChu.setText(course.getGhichu());

        try {
            txtKhaiGiang.setText(String.valueOf(course.getNgayKG()));
            txtNgayTao.setText(String.valueOf(course.getNgayTao()));
        } catch (Exception e) {
            txtKhaiGiang.setText("");
            txtNgayTao.setText("");
        }
    }

    public KhoaHoc getForm() {
        cd = (ChuyenDe) cboList.getSelectedItem();

        KhoaHoc courses = daokh.selectByCourse((int) tblList.getValueAt(row, 0));
        System.out.println(courses.getMaKhoaHoc());
        if (courses != null) {
            course = new KhoaHoc();
            course.setMaKhoaHoc(courses.getMaKhoaHoc());
            course.setMaCD(cd.getMaCD());
            course.setHocPhi(Float.parseFloat(txtHocPhi.getText()));
            course.setThoiLuong(Integer.parseInt(txtThoiLuong.getText()));
            course.setNgayKG(XDate.toDate(txtKhaiGiang.getText(), "yyyy-mm-dd"));
            course.setGhichu(txtGhiChu.getText());
            course.setMaNV(Authentication.user.getMaNV());
            course.setNgayTao(new Date());
        }

        return course;

    }

    public void updatestates() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblList.getRowCount() - 1);
        // States form
        if (Authentication.user.getVaiTro() == 1) {
            btnAdd.setEnabled(true);
            btnEdit.setEnabled(true);
            btnDelete.setEnabled(true);
        } else {
            btnDelete.setEnabled(false);
        }
        // States
        btnFirst.setEnabled(edit && !first);
        btnReverse.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    public void clearNV() {
        course = new KhoaHoc();
        setForm(course);
        row = -1;
        this.updatestates();
    }
}
