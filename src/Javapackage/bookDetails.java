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

import myClasses.Img;
import myClasses.JarLocation;
import myClasses.MyQueries;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Shaleen
 */
public class bookDetails extends javax.swing.JFrame {

    String path = JarLocation.getLocation(this);
    final static Logger logger = LoggerFactory.getLogger(bookDetails.class);

    /**
     * Creates new form bookDetails
     */
    public bookDetails() {
        initComponents();

    }

    public bookDetails(int bookcode) {
        initComponents();
        DefaultListModel listModel = new DefaultListModel();
        try {

            String query = "SELECT * FROM books where bookcode ='" + bookcode + "';";
            ResultSet rs = MyQueries.excQuery(query);
            rs.next();

            String bookname = rs.getString("bookname");
            String author = rs.getString("author");
            String rdate = rs.getString("releasedate");
            int pages = rs.getInt("pages");
            String genre = rs.getString("genre");
            String review = rs.getString("review");
            l1.setIcon(new ImageIcon(path + "images/" + bookcode + ".jpg"));
            myClasses.Connections.close(); // Close connection to prevent Database lock

            File dir = new File(path + "images/" + bookcode + ".jpg");
            if (!dir.canRead())
            {
                ResultSet rs1 = MyQueries.excQuery("select imgURL from books where bookcode=" + bookcode + ";");
                rs1.next();
                String url = rs1.getString("imgURL");
                URL url1 = new URL(url);
                l1.setIcon(Img.resizedplusImageIcon(url1, 200, 300));
                myClasses.Connections.close(); // Close connection to prevent Database lock
                
                //write the Img on the drive
                Image img = Img.resizedplusImage(url1, 200, 300);
                BufferedImage resizedImage = (BufferedImage) img;
                try
                {
                    new File(path + "\\images").mkdirs();
                    ImageIO.write(resizedImage, "jpg", new File(path + "images\\" + bookcode + ".jpg"));
                }
                catch (java.io.IOException f) 
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }


            l2.setText(bookcode + "");
            l3.setText(bookname);
            l4.setText(author);
            l5.setText(rdate);
            l6.setText("" + pages);
            l7.setText(genre);
            ta1.setText(review);


            query = "SELECT bookcode FROM books order by  bookcode;";
            ResultSet rs1 = MyQueries.excQuery(query);
            int j = 0;
            while (rs1.next()) 
            {
                int bookcode1 = rs1.getInt("bookcode");
                ImageIcon img = new ImageIcon(path + "images\\" + bookcode1 + ".jpg");
                

                dir = new File(path + "images/" + bookcode1 + ".jpg");
                if (!dir.canRead()) {
                    ResultSet rs2 = MyQueries.excQuery("select imgURL from books where bookcode=" + bookcode1 + ";");
                    rs2.next();
                    String url = rs2.getString("imgURL");
                    myClasses.Connections.close(); // Close connection to prevent Database lock
                    
                    URL url1 = new URL(url);
                    img = Img.resizedplusImageIcon(url1, 200, 300);

                    //write the Img on the drive
                    Image img1 = Img.resizedplusImage(url1, 200, 300);
                    BufferedImage resizedImage = (BufferedImage) img1;
                    try 
                    {
                        new File(path + "\\images").mkdirs();
                        ImageIO.write(resizedImage, "jpg", new File(path + "images\\" + bookcode1 + ".jpg"));
                    }
                    catch (java.io.IOException f)
                    {
                        JOptionPane.showMessageDialog(null, f.getMessage());
                    }
                }
                double aspectRatio = (double) img.getIconWidth() / (double) img.getIconHeight();
                try
                {
                listModel.add(j, (Object) Img.resizedplusImageIcon(img, 120, (int) (70 / aspectRatio)));
                }
                catch(Exception e)
                {
                    logger.error("Error Description:", e);
                }
                j++;
            }
            jList1.setModel(listModel);
            myClasses.Connections.close(); // Close connection to prevent Database lock

        } catch (Exception e) {
            logger.error("Error Description:", e);
        }

        jList1.setSelectedIndex(bookcode - 1001);
        jList1.ensureIndexIsVisible(jList1.getSelectedIndex());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setAlignmentY(0.0F);
        l1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 250, 400));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel2.setText("Release Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel1.setLabelFor(l2);
        jLabel1.setText("Code");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel3.setText("Author");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel4.setText("Pages");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel6.setText("Genre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        l2.setFont(new java.awt.Font("Century Gothic", 0, 14));
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 180, 15));

        l3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 320, 15));

        l4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 193, 20));

        l5.setFont(new java.awt.Font("Century Gothic", 0, 14));
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 193, 15));

        l6.setFont(new java.awt.Font("Century Gothic", 0, 14));
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 193, 15));

        l7.setFont(new java.awt.Font("Century Gothic", 0, 14));
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 193, 15));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel13.setText("Review");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        ta1.setColumns(20);
        ta1.setEditable(false);
        ta1.setFont(new java.awt.Font("Century Gothic", 0, 14));
        ta1.setLineWrap(true);
        ta1.setRows(5);
        ta1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 440, 192));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, -1, -1));

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jList1.setSelectionBackground(new java.awt.Color(51, 204, 255));
        jList1.setVisibleRowCount(1);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 790));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1016)/2, (screenSize.height-763)/2, 1016, 763);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        int value = jList1.getSelectedIndex();
        int i = 0, bookcode = 0;
        try {

            String query = "SELECT bookcode FROM books order by bookcode;";
            ResultSet rs = MyQueries.excQuery(query);
            while (rs.next())
            {

                if (i == value) // check to ensure column index(mysql) and imageindex(jList1 index) match.
                {
                    bookcode = rs.getInt("bookcode");
                    break;
                }
                i++;
            }
            myClasses.Connections.close(); // Close connection to prevent Database lock
        } catch (Exception e) 
        {
        }
        try {

            String query = "SELECT * FROM books where bookcode ='" + bookcode + "';";
            ResultSet rs = MyQueries.excQuery(query);
            rs.next();

            String bookname = rs.getString("bookname");
            String author = rs.getString("author");
            String rdate = rs.getString("releasedate");
            int pages = rs.getInt("pages");
            String genre = rs.getString("genre");
            String review = rs.getString("review");
            l1.setIcon(new ImageIcon(path + "images\\" + bookcode + ".jpg"));
            myClasses.Connections.close(); // Close connection to prevent Database lock

            File dir = new File(path + "images/" + bookcode + ".jpg");
            if (!dir.canRead()) {
                ResultSet rs1 = MyQueries.excQuery("select imgURL from books where bookcode=" + bookcode + ";");
                rs1.next();
                String url = rs1.getString("imgURL");
                URL url1 = new URL(url);
                l1.setIcon(Img.resizedplusImageIcon(url1, 200, 300));
                myClasses.Connections.close(); // Close connection to prevent Database lock
                
                //write the Img on the drive
                Image img = Img.resizedplusImage(url1, 200, 300);
                BufferedImage resizedImage = (BufferedImage) img;
                try {
                    new File(path + "\\images").mkdirs();
                    ImageIO.write(resizedImage, "jpg", new File(path + "images\\" + bookcode + ".jpg"));
                } catch (java.io.IOException f) {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            l2.setText(bookcode + "");
            l3.setText(bookname);
            l4.setText(author);
            l5.setText(rdate);
            l6.setText("" + pages);
            l7.setText(genre);
            ta1.setText(review);
        } catch (Exception e) {
            logger.error("Error Description:", e);
        }
    }//GEN-LAST:event_jList1ValueChanged

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
            java.util.logging.Logger.getLogger(bookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookDetails().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}
