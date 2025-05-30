/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author abcd
 */
public class Categorys extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    Integer Command;

    int ADD = 0;
    int UPDATE = 1;

    /**
     * Creates new form Categorys
     */
    public Categorys() {
        super("Categorys");
        initComponents();
        conn = dbconnect.connectdb();
        txtcname.setEnabled(false);
        FrameInit();

    }

    private void FrameInit() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim);             ///This will let frame initialise in full screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel1 = new coffee.ImagePanel();
        txtentcategoryid = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        txtcid = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JButton();
        txtcname = new javax.swing.JTextField();
        txtentcategoryname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagePanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                imagePanel1ComponentResized(evt);
            }
        });

        txtentcategoryid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtentcategoryid.setForeground(new java.awt.Color(255, 0, 0));

        btnsave.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/save.png"))); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/delete.png"))); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnadd.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/add.png"))); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/Update.png"))); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        txtcid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcidFocusLost(evt);
            }
        });
        txtcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcidActionPerformed(evt);
            }
        });
        txtcid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcidKeyTyped(evt);
            }
        });

        btnsearch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/search.png"))); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setText("Category Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Category ID");

        btnhome.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/home.png"))); // NOI18N
        btnhome.setText("HOME");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("CATEGORY");

        btnrefresh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/settings.png"))); // NOI18N
        btnrefresh.setText("REFRESH");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        txtcname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnameActionPerformed(evt);
            }
        });
        txtcname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcnameKeyTyped(evt);
            }
        });

        txtentcategoryname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtentcategoryname.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanel1Layout.createSequentialGroup()
                .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagePanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)))
                .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(imagePanel1Layout.createSequentialGroup()
                        .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtentcategoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtentcategoryid, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(imagePanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(imagePanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(imagePanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(imagePanel1Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanel1Layout.createSequentialGroup()
                .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagePanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(imagePanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99)
                .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(imagePanel1Layout.createSequentialGroup()
                        .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(txtentcategoryid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18))
                    .addGroup(imagePanel1Layout.createSequentialGroup()
                        .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)))
                .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtentcategoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        setVisible(false);
        HomePage ob = new HomePage();
        ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (txtcid.getText().trim().isEmpty() && txtcname.getText().trim().isEmpty()) {
            txtentcategoryid.setText("Enter Category ID  ");
            txtentcategoryname.setText("Enter Category Name");

        } else if (txtcid.getText().trim().isEmpty()) {
            txtentcategoryid.setText("Enter  Category ID");
        } else if (txtcname.getText().trim().isEmpty()) {
            txtentcategoryname.setText("Enter Category Name");
        } else {
            try {
                if (Command == UPDATE) {

                    String sql = "update category set CategoryID=?,"
                            + "CategoryName=? where CategoryID=?";
                    pst = conn.prepareStatement(sql);

                    pst.setString(1, txtcid.getText());
                    pst.setString(2, txtcname.getText());
                    pst.setString(3, txtcid.getText());

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "updated sucessfuly");
                    txtcid.setText("");
                    
                    btnadd.setVisible(true);
                    btndelete.setVisible(true);
                    btnsearch.setVisible(true);
                    btnsave.setVisible(true);
                    btnupdate.setVisible(true);
                    txtcname.setText("");
                } else if (Command == ADD) {
                    String sql = "Insert into category (CategoryID,CategoryName) values (?,?)";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, txtcid.getText());
                    pst.setString(2, txtcname.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "inserted successfully");

                    setAutogenCategoryId();
                    txtcid.setEnabled(true);
                    btndelete.setVisible(true);
                    btnsearch.setVisible(true);
                    btnsave.setVisible(true);
                    btnupdate.setVisible(true);
                    txtcid.setText("");
                    txtcname.setText("");
                }
                //txtcname.setEnabled(false);
                btnupdate.setVisible(true);
                txtcid.setEnabled(true);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_btnsaveActionPerformed
    }
    private void txtcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcidActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        try {

//            txtcname.setText("");
//            txtcid.setText("");
            txtcid.setEnabled(true);
            txtcname.setEnabled(true);
            Command = UPDATE;

            btnupdate.setVisible(true);
            btnadd.setVisible(false);
            btndelete.setVisible(false);
//             String sql2 = "SELECT * FROM category WHERE CategoryID=?";
//            pst = conn.prepareStatement(sql2);
//            pst.setString(1, txtcid.getText());
//            rs = pst.executeQuery();
//            if (rs.next()) {
//                 txtcid.setText(rs.getString("CategoryID"));
//                txtcname.setText(rs.getString(2));
//
//
//                
//            } else {
//                JOptionPane.showMessageDialog(null, "incorrect CategoryID");
//            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

    }//GEN-LAST:event_btnupdateActionPerformed
    }
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Are u sure u want to delete?", "delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            String sql = "delete from category where CategoryID=? and CategoryName=?";
            try {
                //   String sql = "delete from category where CategoryID=? and CategoryName=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtcid.getText());

                pst.setString(2, txtcname.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "deleted sucessfuly");

                setAutogenCategoryId();

                btnsearch.setVisible(true);
                btnsave.setVisible(true);
                btnupdate.setVisible(true);
                btnadd.setVisible(true);
                txtcid.setText("");
                txtcname.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {
            txtcid.setText("");
            txtcname.setText("");
            txtcid.setEnabled(false);
            txtcname.setEnabled(true);
            btndelete.setVisible(false);
            btnupdate.setVisible(false);
            btnsave.setVisible(true);
            btnsearch.setVisible(true);
            Command = ADD;

            String getIDQry = "Select CategoryID FROM autogen;";
            pst = conn.prepareStatement(getIDQry);
            rs = pst.executeQuery();

            if (rs.next()) {
                txtcid.setText((Integer.parseInt(rs.getString("CategoryID"))+1)+"");
            } else {
                JOptionPane.showMessageDialog(null, "Unknown Error!!");
            }
    }//GEN-LAST:event_btnaddActionPerformed
catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:

        try {
            String count2 = null;
            String sql2 = "select count(*) from category where CategoryID=?";
            pst = conn.prepareStatement(sql2);
            pst.setString(1, txtcid.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                count2 = rs.getString(1);
            }
            int count3 = Integer.parseInt(count2);
            if (count3 == 0) {
                String sql = "select CategoryID,CategoryName from category where CategoryID=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtcid.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    txtcid.setText(rs.getString(1));
                    txtcname.setText(rs.getString(2));

                } else {
                    JOptionPane.showMessageDialog(null, "incorrect CategoryID");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtcidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcidFocusLost
        try {
            
            if (txtcid.getText().trim().isEmpty())
            {
                txtentcategoryid.setText("Enter CategoryID");
                return;
            }
            String Qry = "Select * from category where CategoryID=" + txtcid.getText().trim() + ";";

            pst = conn.prepareStatement(Qry);

            rs = pst.executeQuery();

            if (rs.next()) {
                txtcname.setText(rs.getString("CategoryName"));
            }
            txtcid.setEnabled(false);
            // else {
           //  JOptionPane.showMessageDialog(null, "Incorrect category ID");
        //   }

        } catch (SQLException ex) {
            Logger.getLogger(Categorys.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtcidFocusLost

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        txtcid.setText("");
        txtcname.setText("");
        txtcid.setEnabled(true);
        txtcname.setEnabled(true);
        btnadd.setVisible(true);
        btndelete.setVisible(true);
        btnsave.setVisible(true);
        btnsearch.setVisible(true);
        btnupdate.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void imagePanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_imagePanel1ComponentResized
        URL resource = getClass().getResource("/iconandpictures/pexelscategories.jpg");

        try {
          //  System.out.println(Paths.get(resource.toURI()).toFile().getAbsolutePath());
            imagePanel1.setImage(new ImageIcon(resource).getImage(),
                    this.getWidth(), this.getHeight());
        } catch (Exception ex) {
            Logger.getLogger(Categorys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imagePanel1ComponentResized

    private void txtcnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcnameKeyTyped
        txtentcategoryname.setText("");
    }//GEN-LAST:event_txtcnameKeyTyped

    private void txtcidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcidKeyTyped
       txtentcategoryid.setText("");
    }//GEN-LAST:event_txtcidKeyTyped

    private void txtcnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnameActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Categorys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Categorys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Categorys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Categorys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Categorys().setVisible(true);
//            }
//        });
//    }

    private void setAutogenCategoryId() {
        try {
            String Query = "SELECT CategoryId from category ";
            Integer autogenCategoryId=new Integer(100);
            pst = conn.prepareStatement(Query);
            rs = pst.executeQuery();
            while(rs.next())
            {
                autogenCategoryId=rs.getInt("CategoryId");
            }
            String UpdateQuery = "UPDATE autogen SET CategoryId="+autogenCategoryId.toString()+";";
            pst = conn.prepareStatement(UpdateQuery);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Categorys.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private coffee.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtcname;
    private javax.swing.JLabel txtentcategoryid;
    private javax.swing.JLabel txtentcategoryname;
    // End of variables declaration//GEN-END:variables
}
