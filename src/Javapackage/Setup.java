/*
 GPL(GNU Public Library) is a Library Management System.
 Copyright (C) 2012-2013  Shaleen Jain

 This file is part of GPL.

 GPL is a free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Javapackage;

import java.beans.PropertyChangeListener;
import myClasses.JarLocation;
import myClasses.MyQueries;
import java.io.File;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Shaleen
 */
public class Setup extends javax.swing.JFrame {

    Preferences prefs = Preferences.userNodeForPackage(this.getClass());
    private static final String SETUP_HAS_RUN = "setupHasRun";
    private static final String DBMS_TYPE = "DbmsType";
    private static final String SERVER_URL = "serverURL";
    private static final String DB_NAME = "DatabaseName";
    final static Logger logger = LoggerFactory.getLogger(Setup.class);

    /**
     * Creates new form Setup
     */
    public Setup() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jProgressBar1.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);

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
        jPanel0 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        l3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        l5 = new javax.swing.JLabel();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel0.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        l2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l2.setText("<html>\n<body>\nPlease wait<br>Initializing...\n</body>\n</html>");
        jPanel0.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel0.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 550));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l1.setText("Please Select the kind of database you require:");
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        buttonGroup1.add(rb2);
        rb2.setText("Local SQLite Database");
        rb2.setOpaque(false);
        jPanel1.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 160, -1));

        buttonGroup1.add(rb1);
        rb1.setText("Online MySQL Database");
        rb1.setOpaque(false);
        jPanel1.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l3.setText("<HTML>\n<body>\nPlease enter the MySQL Database Details:\n</body>\n</HTML>");
        l3.setToolTipText("\n");
        jPanel2.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jLabel6.setText("Server URL:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel7.setText("Port no:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel8.setText("Username:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel9.setText("Password:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        t1.setToolTipText("<html>\n<body bgcolor=\"white\">\n<p align=\"center\">Eg:localhost,www.sql.com</p>\n</body>\n</html>\n");
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 90, -1));

        t2.setToolTipText("<html>\n<body bgcolor=\"white\">\n<p align=\"center\">Eg:3306,80</p>\n</body>\n</html>");
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 90, -1));

        t3.setToolTipText("<html>\n<body bgcolor=\"white\">\n<p align=\"center\">Eg:root</p>\n</body>\n</html>");
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 90, -1));

        t4.setToolTipText("<html>\n<body bgcolor=\"white\">\n<p align=\"center\">Eg:123</p>\n</body>\n</html>");
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 90, -1));

        jLabel10.setText("Database name:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        t5.setToolTipText("<html>\n<body bgcolor=\"white\">\n<p align=\"center\">Eg:test</p>\n</body>\n</html>");
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 90, -1));

        jLabel12.setText("Note: Please make sure the database exists.");
        // Cannot create a database automatically as we need a database to create a connection
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, 20));

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 550));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        l4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l4.setText("Please Enter the SQLite Database Details:");
        jPanel3.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 270, 20));

        jLabel11.setText("Database Name:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));
        jPanel3.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 90, -1));

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("Finish");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        l5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l5.setText("Do you wish to populate your database with some records?");
        jPanel4.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 360, 20));

        buttonGroup1.add(rb3);
        rb3.setText("Yes");
        rb3.setOpaque(false);
        jPanel4.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        buttonGroup1.add(rb4);
        rb4.setText("No");
        rb4.setOpaque(false);
        jPanel4.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 50, -1));
        jPanel4.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 410, 20));

        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 550));

        setSize(new java.awt.Dimension(691, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        boolean oldValue = prefs.getBoolean(SETUP_HAS_RUN, false);
        if (oldValue)
        {
            StartPage a = new StartPage();
            a.setVisible(true);
            this.dispose();
            prefs.putBoolean(SETUP_HAS_RUN, false); // for testing setup

        }
        else 
        {
            l2.setText("<html>\n" + "<body>\n" + "Welcome!<br>This Wizard will help you setup this program.<br>Click next to continue..\n" + "</body>\n" + "</html>");
            jButton1.setVisible(true);
        }


    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel0.setVisible(false);
        jPanel1.setVisible(true);
        jButton2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (rb1.isSelected()) 
        {
            jPanel1.setVisible(false);
            jPanel2.setVisible(true);
            jButton3.setVisible(true);
            prefs.put(DBMS_TYPE, "mysql");
        } 
        else if (rb2.isSelected()) 
        {
            jPanel1.setVisible(false);
            jPanel3.setVisible(true);
            jButton4.setVisible(true);
            prefs.put(DBMS_TYPE, "sqlite");
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Please select one of the options");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (t1.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the server url");
        } 
        else if (t2.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the port no");
        } 
        else if (t3.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the username");
        } 
        else if (t4.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the password");
        } 
        else if (t4.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the database name");
        } 
        else 
        {
            String url = "jdbc:mysql://" + t1.getText() + ":" + t2.getText() +"/"+ t5.getText();
            String user = t3.getText();
            String password = t4.getText();
            prefs.put(SERVER_URL, url + "," + user + "," + password);
            jPanel2.setVisible(false);
            jPanel4.setVisible(true);
            jButton5.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (t6.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please enter the database name");
        } 
        else 
        {
            String dbname = t6.getText();
            prefs.put(DB_NAME, dbname);
            jPanel3.setVisible(false);
            jPanel4.setVisible(true);
            jButton5.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
     
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (rb3.isSelected() || rb4.isSelected()) 
        {
            try 
            {
                prefs.flush();
            } 
            catch (Exception e)
            {
                logger.error("Error Description:", e);
            }
            File dir1 = new File(JarLocation.getLocation(this) + "\\databases\\");
            if (!dir1.canRead()) 
            {
                dir1.mkdirs();
            }
            
            // Create the required tables
            String query[] = {"create table settings(fine integer,issuetime integer,maxbooks integer);"
                    ,"create table users (issuerId integer(5) ,fname varchar(15), lname varchar(15),username varchar(20) Primary key,password varchar(32),gender varchar(10),address varchar(40), phoneno long , type varchar(10));"
                    ,"create table books( bookcode integer Primary Key,bookname varchar(50),author varchar(40),Releasedate varchar(25),Pages integer,genre varchar(30),review varchar(1000),imgurl varchar(150));"
                    ,"create table accounts(IssuerId integer,username Varchar(10),BookCode integer Primary Key,Bookname Varchar(50),IssueDate date,ReturnDate date);"
                    ,"insert into settings values(1,7,3);"
                    ,"Insert into users values (100,\"admin\",\"admin\",\"admin\",\"c75af13c992650118785608ba2506a3\",\"Male\",\"null\",9764578654,\"admin\");"};
 
            for(int i=0;i<=5;i++)
            {
                 MyQueries.excUpdate(query[i]);
                 myClasses.Connections.close(); // Close connection to prevent Database lock
            }
            
            if (rb3.isSelected()) 
            {
                jProgressBar1.setVisible(true);
                rb3.setVisible(false);
                rb4.setVisible(false);
                
                File dir = new File(JarLocation.getLocation(this) + "\\images\\");
                if (!dir.canRead())
                {
                    dir.mkdirs();
                }
                              
                //Call the SwingWorker
                threads.DbPopulator task = new threads.DbPopulator(l5,jProgressBar1,this);   
                task.execute();      
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select one of the options");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
        char kc = evt.getKeyChar();        
        if (!(kc >= '0' && kc <= '9')) 
        {
            evt.consume();
        }
    }//GEN-LAST:event_t2KeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            jPanel3.setVisible(false);
            jPanel1.setVisible(true);
            jButton4.setVisible(false);
            jButton2.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            jPanel2.setVisible(false);
            jPanel1.setVisible(true);
            jButton3.setVisible(false);
            jButton2.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jPanel4.setVisible(false);
        jButton5.setVisible(false);
        String dbtype= prefs.get(DBMS_TYPE, "sqlite");
        switch (dbtype) 
        {
            case "mysql":
                jPanel2.setVisible(true);
                jButton3.setVisible(true);
                break;
            case "sqlite":
                jPanel3.setVisible(true);
                jButton4.setVisible(true);
                break;
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setup().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
