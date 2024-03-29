/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author LLira
 */
public class EjercicioPrueba extends javax.swing.JFrame {
    private double zoom = 1.0;

    /**
     * Creates new form EjercicioPrueba
     */
    public EjercicioPrueba() {
        initComponents();
        centrarPantalla();
    }
    
    //Center form screen. Start
    public final void centrarPantalla() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = this.getSize();

        double posX = (pantalla.getWidth() - ventana.getWidth()) / 2.0;
        double posY = (pantalla.getHeight() - ventana.getHeight()) / 2.0;

        this.setLocation((int) posX, (int) posY);
    }
    //Center form Screen. End

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lblImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAjustar = new javax.swing.JButton();
        btnZoomIn = new javax.swing.JButton();
        btnZoomOut = new javax.swing.JButton();
        btnOriginal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        lblImage.setBackground(new java.awt.Color(255, 255, 255));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Brothers.png"))); // NOI18N
        lblImage.setOpaque(true);
        jScrollPane1.setViewportView(lblImage);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAjustar.setText("Ajustar");
        btnAjustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAjustar);

        btnZoomIn.setText("Zoom In");
        btnZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomInActionPerformed(evt);
            }
        });
        jPanel1.add(btnZoomIn);

        btnZoomOut.setText("Zoom Out");
        btnZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnZoomOut);

        btnOriginal.setText("Original");
        btnOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalActionPerformed(evt);
            }
        });
        jPanel1.add(btnOriginal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomOutActionPerformed
        // TODO add your handling code here:
        zoom-= 1;
        ImageIcon icon;
        Image img;
        int tamH;
        int tamV;
        tamH= (int)(lblImage.getHeight()*zoom);
        tamV= (int)(lblImage.getWidth()*zoom);
        icon= new ImageIcon(getClass().getResource("/images/Brothers.png"));
        img= icon.getImage();
        img= img.getScaledInstance(tamV, tamH, Image.SCALE_SMOOTH);
        icon= new ImageIcon(img);
        lblImage.setIcon(icon);
        
    }//GEN-LAST:event_btnZoomOutActionPerformed

    private void btnAjustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustarActionPerformed
        // TODO add your handling code here:
        ImageIcon icon;
        Image img;
        int tamH;
        int tamV;
        tamH= lblImage.getHeight();
        tamV= lblImage.getWidth();
        icon= new ImageIcon(getClass().getResource("/images/Brothers.png"));
        img= icon.getImage();
        img= img.getScaledInstance(tamV, tamH, Image.SCALE_SMOOTH);
        icon= new ImageIcon(img);
        lblImage.setIcon(icon);
    }//GEN-LAST:event_btnAjustarActionPerformed

    private void btnZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomInActionPerformed
        // TODO add your handling code here:
        zoom+= 0.1;
        ImageIcon icon;
        Image img;
        int tamH;
        int tamV;
        tamH= (int)(lblImage.getHeight()*zoom);
        tamV= (int)(lblImage.getWidth()*zoom);
        icon= new ImageIcon(getClass().getResource("/images/Brothers.png"));
        img= icon.getImage();
        img= img.getScaledInstance(tamV, tamH, Image.SCALE_SMOOTH);
        icon= new ImageIcon(img);
        lblImage.setIcon(icon);
    }//GEN-LAST:event_btnZoomInActionPerformed

    private void btnOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalActionPerformed
        // TODO add your handling code here:
        lblImage.setIcon(new ImageIcon(getClass().getResource("/images/Brothers.png")));
    }//GEN-LAST:event_btnOriginalActionPerformed

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
            java.util.logging.Logger.getLogger(EjercicioPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjustar;
    private javax.swing.JButton btnOriginal;
    private javax.swing.JButton btnZoomIn;
    private javax.swing.JButton btnZoomOut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
}
