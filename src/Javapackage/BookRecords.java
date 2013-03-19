/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BookRecords.java
 *
 * Created on Jul 19, 2012, 8:58:11 AM
 */

package Javapackage;

import Classes.image;
import Classes.myQueries;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Shaleen
 */
public class BookRecords extends javax.swing.JFrame {
String username;


    /** Creates new form BookRecords */
    public BookRecords() {
        initComponents();
        
        
    }
    public BookRecords(String username1) {
        initComponents();
        username=username1;
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cb1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gurgaon Public Library");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Book Code");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel3.setText("Book Author");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Book Cover URL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 140, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 250, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 100, -1));

        cb1.setFont(new java.awt.Font("Century Gothic", 0, 14));
        cb1.setText("Auto Assign");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel6.setText("Release Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 250, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel7.setText("Pages");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        t9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t9KeyTyped(evt);
            }
        });
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 250, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel8.setText("Genre");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 250, -1));

        ta1.setColumns(20);
        ta1.setLineWrap(true);
        ta1.setRows(5);
        ta1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 260, 120));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel9.setText("Book Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 250, -1));

        t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t8KeyTyped(evt);
            }
        });
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 140, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14));
        jLabel10.setText("Book Code");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jButton2.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jButton2.setText("Delete Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Review");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 250, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 610));

        jMenu3.setText("Home");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1000)/2, (screenSize.height-670)/2, 1000, 670);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int code=0;
        int n=0;
        int m=0;
        int pages=0;
        try
        {
            code = Integer.parseInt(t8.getText());
        }
        catch(NumberFormatException e) 
        {
                n=1;    
        }
       String name=t7.getText();
       String author=t3.getText();
       String rdate=t4.getText();
       String genre=t6.getText();
       String url=t9.getText();
       try
       {
           pages=Integer.parseInt(t9.getText());
       }
       catch(NumberFormatException e)
       {
           m=1;
       }
       String review=ta1.getText();
       String query;
       if(n==1&&cb1.isSelected()==false)
       {
           JOptionPane.showMessageDialog (this, "Please Enter the Book Code");
       }
       else if(name.isEmpty())
       {
           JOptionPane.showMessageDialog (this, "Please Enter the Book Name");
       }
       else if(author.isEmpty())
       {
           JOptionPane.showMessageDialog (this, "Please Enter the author");
       }
       else if(genre.isEmpty())
       {
           JOptionPane.showMessageDialog (this, "Please Enter the genre");
       }
       else if(rdate.isEmpty())
       {
           JOptionPane.showMessageDialog (this, "Please Enter the Release Date");
       }
       else if(m==1)
       {
           JOptionPane.showMessageDialog (this, "Please Enter the no of pages");
       }
       else if(review.isEmpty())
       {
           JOptionPane.showMessageDialog (this, "Please Enter the review");
       }
       else if(url.isEmpty())
       {
           JOptionPane.showMessageDialog (this, "Please Enter the url");
       }
       else
       {URL url1=null;
           try {
            url1= new URL (url);
        } catch (java.net.MalformedURLException e) {
        }
         Image img= image.resizedplusImage(url1, 200, 300);
          BufferedImage resizedImage = (BufferedImage)img;
          try
          {ImageIO.write(resizedImage, "jpg", new File("src//"+code+".jpg")); }
          catch(java.io.IOException e)
          {
              
          }
          
        try{
              Statement stmt = myQueries.getStmt();
              if(cb1.isSelected())
              {
                  query="select  max(bookcode) from books;";
                  ResultSet rs=stmt.executeQuery(query);
                  rs.next();
                  code=rs.getInt("max(bookcode)")+1;
                  t1.setText(""+code);
              }
              query="INSERT INTO books VALUES('"+code+"','"+name+"','"+author+"','"+rdate+"','"+pages+"','"+genre+"','"+review+"');";
              stmt.executeUpdate(query);
              JOptionPane.showMessageDialog (this, "Book Record Succesfully inserted");
       }
      catch(Exception e)
        {
         JOptionPane.showMessageDialog (this, e.getMessage());
        }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
       char kc = evt.getKeyChar();
        if(!(kc>='0'&& kc<='9'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_t1KeyTyped

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
if(cb1.isSelected()==true)
    {
        t1.setEditable(false);  
        JOptionPane.showMessageDialog (this, "Warning! This may result in duplicate entry of the same book");
    }
else
{
    t1.setEditable(true); 
}

    }//GEN-LAST:event_cb1ActionPerformed

    private void t9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t9KeyTyped
        char kc = evt.getKeyChar();
        if(!(kc>='0'&& kc<='9'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_t9KeyTyped

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
       MainPage a = new MainPage(username);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MousePressed

    private void t8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t8KeyTyped
        char kc = evt.getKeyChar();
        if(!(kc>='0'&& kc<='9'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_t8KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int bookcode=0;
      int n=0;
      String query=null;
        try
       {
           bookcode= Integer.parseInt(t1.getText());
       }
       catch(Exception e)
       {
           n=1;
       }
        if(n==1)
        {
            JOptionPane.showMessageDialog (this, "Please enter the book code!");
            
        }
        else
        {
            try
        {
        Statement stmt = myQueries.getStmt();
        query="Delete from books where bookcode='"+bookcode+"';";
        stmt.executeUpdate(query);  
        JOptionPane.showMessageDialog(this, "Book Record succesfully Deleted");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog (this, e.getMessage());
        }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_t5KeyTyped

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox cb1;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JMenu jMenu3;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextField t1;
    javax.swing.JTextField t3;
    javax.swing.JTextField t4;
    javax.swing.JTextField t5;
    javax.swing.JTextField t6;
    javax.swing.JTextField t7;
    javax.swing.JTextField t8;
    javax.swing.JTextField t9;
    javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables

}
