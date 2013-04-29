/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Javapackage;

import Classes.jarLocation;
import java.awt.image.RenderedImage;
import java.io.File;
import java.util.prefs.Preferences;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Shaleen
 */
public class Setup extends javax.swing.JFrame {
static String ourNodeName = "/GPL";
Preferences prefs = Preferences.userNodeForPackage(this.getClass());
private static final String SETUP_HAS_RUN = "setupHasRun";
    /**
     * Creates new form Setup
     */
    public Setup() {
        initComponents();
        jProgressBar1.setVisible(false);
        
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
        jProgressBar1 = new javax.swing.JProgressBar();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 403, 21));

        l1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        l1.setText("<html>\n<body>\nPlease Wait<br> Initializing....\n</body>\n</html>");
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_color_background_picture_32-1920x1200.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 650, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(664, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       boolean oldValue = prefs.getBoolean(SETUP_HAS_RUN, false);
        if(oldValue)
        {
            StartPage a = new StartPage();
            a.setVisible(true);
            this.dispose();
            prefs.putBoolean(SETUP_HAS_RUN, false);
        }
        else
        {
            l1.setText("Copying images...");
            File dir = new File(jarLocation.getLocation(Setup.this) + "images/");
            if (!dir.canRead())
            {
                dir.mkdir();
            }
            for (int bc = 1001; bc <= 1051; bc++)
            { 
                //calulate the percentage of loop progress
                float progress=(((float)bc-1000)/51)*100;
                jProgressBar1.setVisible(true);
                int value=Math.round(progress);
                jProgressBar1.setValue(value);
                
                File imageDir = new File(jarLocation.getLocation(Setup.this) + "images/" + bc + ".jpg");
                try 
                {
                    RenderedImage img = ImageIO.read(new File("src\\" + bc + ".jpg"));
                    ImageIO.write(img, "jpg", imageDir);
                } catch (java.io.IOException e) 
                {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
            //prefs.putBoolean(SETUP_HAS_RUN, true);
        }
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
}
