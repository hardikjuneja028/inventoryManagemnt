package stockmgm;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import static stockmgm.vars.*;

public class AddEmployee extends javax.swing.JInternalFrame {
File myfile;
 String imagename;
    public AddEmployee() {
        initComponents();
        jButton3.setEnabled(false);
        jButton4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        ph = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("User Form");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Form", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("UserName");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Phone No");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("City");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("Address");

        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });

        ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phActionPerformed(evt);
            }
        });
        ph.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phKeyTyped(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Admin", "Employee" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email ID", "Phone", "Gender"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("User Type");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose City", "Jalandhar", "Amritsar", "Ludhiana", "Chandigarh" }));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("Date of Birth");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Password");

        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Upload");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(231, 231, 231))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton2))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5)
                                            .addComponent(jButton2)))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton6)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(validn())
        {
        boolean flag=false;
        if(myfile!=null)
        {
        if(myfile.length()<300000)
        {
        imagename=new java.util.Date().getTime() + myfile.getName();
        int i;

        FileInputStream rd = null;
        FileOutputStream outs = null;

        try {

        rd = new FileInputStream(myfile);
        outs = new FileOutputStream("upload\\"+imagename);//writing the new file in 'Images' folder, in the project
        byte[] b = new byte[2048]; //cache of 2kb
        while ((i = rd.read(b)) !=-1) {
        outs.write(b, 0, i); //copying from pictures to empimages byte by byte
        }
        }
        catch (Exception e) 
        {
        JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
        } 
        flag=true;
        }
        else
        {
        flag=false;
        }
        }
        else
        {
        imagename="default.jpg";
        flag=true;
        } 
        
        
        
        if(flag==true)
        {
            try
            {
                Connection myconn = DriverManager.getConnection(myurl, uname, pass);
                try
                {
                   String q="insert into employee values(?,?,?,?,?,?,?,?,?,?)";
                   PreparedStatement myst = myconn.prepareStatement(q);
                   myst.setString(1, nm.getText());
                   myst.setString(2, em.getText());
                   myst.setString(3, ph.getText());

                   if(jRadioButton1.isSelected())
                   {
                        myst.setString(4, "Male");
                   }
                   else if(jRadioButton2.isSelected())
                   {
                        myst.setString(4, jRadioButton2.getText());
                   }
                   myst.setString(5, jComboBox1.getSelectedItem().toString());
                   myst.setString(6, jTextArea1.getText());
                   myst.setString(7, jComboBox2.getSelectedItem().toString());

                   SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
                   String dob = myformat.format(jDateChooser1.getDate());
                   myst.setString(8, dob);
                   myst.setString(9, jPasswordField1.getText());
                   myst.setString(10, imagename);
                   int count = myst.executeUpdate();
                   if(count==1)
                   {
                       JOptionPane.showMessageDialog(rootPane, "Employee added successfully");
                       this.clearFix();
                   }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
                }
                finally
                {
                    myconn.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
            }
        }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try
        {
            Connection myconn = DriverManager.getConnection(myurl, uname, pass);
            try
            {
               String q="select * from employee where email=?";
               PreparedStatement myst = myconn.prepareStatement(q);
               myst.setString(1, em.getText());
               ResultSet res=myst.executeQuery();
               if(res.next())
               {
                   nm.setText(res.getString("name"));
                   em.setText(res.getString("email"));
                   ph.setText(res.getString("phone"));
                   jTextArea1.setText(res.getString("address"));
                   if(res.getString("gender").equalsIgnoreCase("male"))
                   {
                       jRadioButton1.setSelected(true);
                   }
                   else
                   {
                       jRadioButton2.setSelected(true);
                   }
                   
                   jComboBox2.setSelectedItem(res.getString("city"));
                   jComboBox1.setSelectedItem(res.getString("usertype"));
                   
                   jDateChooser1.setDate(res.getDate("dob"));
                   
                   jButton3.setEnabled(true);
                   jButton4.setVisible(true);
               }
               else
               {
                   JOptionPane.showMessageDialog(rootPane, "Invalid Username");
                   clearFix();
               }
             }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
            }
            finally
            {
                myconn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int uchoice = JOptionPane.showConfirmDialog(rootPane, "Are you sure to delete?", "Confirmation?", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(uchoice==JOptionPane.YES_OPTION)
        {
            try
            {
                Connection myconn = DriverManager.getConnection(myurl, uname, pass);
                try
                {
                   String q="delete from employee where email=?";
                   PreparedStatement myst = myconn.prepareStatement(q);
                   myst.setString(1, em.getText());
                   int res=myst.executeUpdate();
                  if(res==1)
                  {
                      JOptionPane.showMessageDialog(rootPane, "Record deleted");
                      clearFix(); 
                      jButton3.setEnabled(false);
                      jButton4.setVisible(false);
                  }
                   else
                   {
                       JOptionPane.showMessageDialog(rootPane, "Invalid Username");
                       clearFix();
                   }
                 }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
                }
                finally
                {
                    myconn.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        
        boolean flag=false;
        if(validn())
        {
        if(myfile!=null)
        {
        if(myfile.length()<300000)
        {
        imagename=new java.util.Date().getTime() + myfile.getName();
        int i;

        FileInputStream rd = null;
        FileOutputStream outs = null;

        try {

        rd = new FileInputStream(myfile);
        outs = new FileOutputStream("upload\\"+imagename);//writing the new file in 'Images' folder, in the project
        byte[] b = new byte[2048]; //cache of 2kb
        while ((i = rd.read(b)) !=-1) {
        outs.write(b, 0, i); //copying from pictures to empimages byte by byte
        }
        }
        catch (Exception e) 
        {
        JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
        } 
        flag=true;
        }
        else
        {
        flag=false;
        }
        }
        else
        {
        imagename="default.jpg";
        flag=true;
        } 
        } 
        
        if(flag=true)
        {
        try
        {
            Connection myconn = DriverManager.getConnection(myurl, uname, pass);
            try
            {
               String q="update employee set name=?,phone=?,gender=?,city=?,address=?,usertype=?,dob=?,profile=? where email=?";
               PreparedStatement myst = myconn.prepareStatement(q);
               myst.setString(1, nm.getText());
           
               myst.setString(2, ph.getText());
               
               if(jRadioButton1.isSelected())
               {
                    myst.setString(3, "Male");
               }
               else if(jRadioButton2.isSelected())
               {
                    myst.setString(3, jRadioButton2.getText());
               }
               myst.setString(4, jComboBox2.getSelectedItem().toString());
               myst.setString(5, jTextArea1.getText());
               myst.setString(6, jComboBox1.getSelectedItem().toString());
               SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
               String dob = myformat.format(jDateChooser1.getDate());
               myst.setString(7, dob);
               myst.setString(8, imagename);
               myst.setString(9, em.getText());
             
               int count = myst.executeUpdate();
               if(count==1)
               {
                   JOptionPane.showMessageDialog(rootPane, "Employee updated successfully");
                   //this.clearFix();
               }
               else
               {
                   JOptionPane.showMessageDialog(rootPane, "Employee not updated successfully");
                   //this.clearFix();
               }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
            }
            finally
            {
                myconn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }
        }
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try
        {
            Connection myconn = DriverManager.getConnection(myurl, uname, pass);
            try
            {
               String q="select * from employee where name like ?";
               PreparedStatement myst = myconn.prepareStatement(q);
               myst.setString(1, "%" + nm.getText() + "%");
               ResultSet res=myst.executeQuery(); 
               DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
               mymodel.setRowCount(0);
               if(res.next())
               {
                  do
                  {
                      String n = res.getString("name");
                      String em = res.getString("email");
                      String ph = res.getString("phone");
                      String gen = res.getString("gender");
                      
                      Object myrow[] = {n,em,ph,gen};
                      mymodel.addRow(myrow);
                     
                  }
                  while(res.next());
               }
               else
               {
                   JOptionPane.showMessageDialog(rootPane, "No records found");
                   clearFix();
               }
             }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
            }
            finally
            {
                myconn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        String un = jTable1.getValueAt(jTable1.getSelectedRow(),1).toString();
        try
        {
            Connection myconn = DriverManager.getConnection(myurl, uname, pass);
            try
            {
               String q="select * from employee where email=?";
               PreparedStatement myst = myconn.prepareStatement(q);
               myst.setString(1, un);
               ResultSet res=myst.executeQuery();
               if(res.next())
               {
                   nm.setText(res.getString("name"));
                   em.setText(res.getString("email"));
                   ph.setText(res.getString("phone"));
                   jTextArea1.setText(res.getString("address"));
                   if(res.getString("gender").equalsIgnoreCase("male"))
                   {
                       jRadioButton1.setSelected(true);
                   }
                   else
                   {
                       jRadioButton2.setSelected(true);
                   }
                   
                   jComboBox2.setSelectedItem(res.getString("city"));
                   jComboBox1.setSelectedItem(res.getString("usertype"));
                   jDateChooser1.setDate(res.getDate("dob"));
                   
                   jButton3.setEnabled(true);
                   jButton4.setVisible(true);
                   Image simg = ImageIO.read(new File("upload/"+res.getString("profile"))).getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT); 
        jLabel10.setIcon(new ImageIcon(simg));
               }
               else
               {
                   JOptionPane.showMessageDialog(rootPane, "Invalid Username");
                   clearFix();
               }
             }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
            }
            finally
            {
                myconn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void phKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phKeyTyped
        char c=evt.getKeyChar();
        
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE)))
        evt.consume();
    }//GEN-LAST:event_phKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser myfilechooser=new JFileChooser();
        myfilechooser.setFileFilter(new FileFilter(){
        @Override
        public boolean accept(File f) {
        if(f.isDirectory())
        {
        return true;
        }
        String extension=f.getName().substring(f.getName().lastIndexOf(".")+1);
        String allowed[]={"jpg","jpeg","gif","png"};
        for(String a:allowed)
        {
        if(extension.equalsIgnoreCase(a))
        {
        return true;
        }
        }
        return false;

        }

        @Override
        public String getDescription() {
        return "All Picture Files";
        }
        });



        if(myfilechooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
        {
        try {
        myfile=myfilechooser.getSelectedFile();
        Image simg = ImageIO.read(new File(myfile.getPath())).getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT); 
        jLabel10.setIcon(new ImageIcon(simg));
        } catch (IOException ex) {
        System.out.println("Error occured while showing image due to " + ex.getMessage());
        }

 }
 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void phActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed
    void clearFix()
    {
        nm.setText("");
        em.setText("");
        ph.setText("");
        buttonGroup1.clearSelection();
        jTextArea1.setText("");
        jComboBox2.setSelectedIndex(0);
        jComboBox1.setSelectedIndex(0);
        jDateChooser1.setDate(null);
         jLabel10.setIcon(null);
        
    }
    
    boolean validn()
    {
        if(nm.getText().length()<2)
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter proper name");
            return(false);
        }
        else if(em.getText().length()<8 || !em.getText().contains("@") || !em.getText().contains("."))
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter proper email");
            return(false);
        }
        else if(ph.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(rootPane, "Please enter proper phone");
            return(false);
        }
        else if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false)
        {
            JOptionPane.showMessageDialog(rootPane, "Please choose gender");
            return(false);
        }
        else if(jComboBox1.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(rootPane, "Please choose city");
            return(false);
        }
        else
        {
            return(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField em;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField ph;
    // End of variables declaration//GEN-END:variables
}
