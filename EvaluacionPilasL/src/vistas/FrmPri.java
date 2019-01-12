/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.Pila;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import clases.Notaciones;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author LLira
 */
public class FrmPri extends javax.swing.JFrame {
    Icon user;
    /**
     * Creates new form FrmPri
     */
    public FrmPri() {
        initComponents();
        centrarVentana(this);
        user = new ImageIcon("src\\Resource\\Luis_Hernan.jpg");
    }

    //Center form Screen. Start ♠♦♦♠♠♦♦♣☻♥☺☻☺☻♥•◘○♣
    public static void centrarVentana(JFrame ventana) {
        Dimension frame = ventana.getSize();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

        double posx = (pantalla.getWidth() - ventana.getWidth()) / 2;
        double posy = (pantalla.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation((int) posx, (int) posy);
    }
    //Center form Screen. End   ♠♦♦♠♠♦♦♣☻♥☺☻☺☻♥•◘○♣

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInfija = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPostfija = new javax.swing.JTextField();
        btnEvaluar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAlgebraica = new javax.swing.JTextField();
        btnValidar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnValidarCodigo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnLeerCodigo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Usando Pilas");
        jPanel1.add(jLabel6);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Expresión Infija");

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        jLabel2.setText("Expresión Postfija");

        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado");

        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Expresión algebraica");

        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        jLabel5.setText("Código");

        btnValidarCodigo.setText("Validar");
        btnValidarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarCodigoActionPerformed(evt);
            }
        });

        txtCodigo.setColumns(20);
        txtCodigo.setRows(5);
        jScrollPane1.setViewportView(txtCodigo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnValidarCodigo)
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(16, 16, 16))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPostfija)
                        .addComponent(txtInfija)
                        .addComponent(txtResultado)
                        .addComponent(txtAlgebraica))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEvaluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btnValidar))
                    .addGap(52, 52, 52)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnValidarCodigo)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(102, 102, 102))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtInfija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConvertir))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtPostfija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEvaluar))
                    .addGap(13, 13, 13)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlgebraica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnValidar)))
                    .addContainerGap(206, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnLeerCodigo.setText("Leer código");
        btnLeerCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerCodigoActionPerformed(evt);
            }
        });
        jPanel3.add(btnLeerCodigo);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiar);

        btnCreditos.setText("Créditos");
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreditos);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeerCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerCodigoActionPerformed
        // TODO add your handling code here:
        BufferedReader entrada;
        File archivo;
        JFileChooser jfch = new JFileChooser();
        int op = 0;
        int num = 0;
        String linea = "";
        op = jfch.showOpenDialog(this);

        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = jfch.getSelectedFile();
            try {
                entrada = new BufferedReader(new FileReader(archivo));
                linea = entrada.readLine();
                while (linea != null) {
                    num++;
                    txtCodigo.append("" + num + ": " + linea + "\n");
                    linea = entrada.readLine();
                }
                entrada.close();
            } catch (IOException e) {
                System.err.println("Error");
            }
        }
    }//GEN-LAST:event_btnLeerCodigoActionPerformed

    private void btnValidarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarCodigoActionPerformed
        // TODO add your handling code here:
        Pila stock = new Pila(20);
        char letra;
        String resultado = "Código correcto";
        for (int i = 0; i < txtCodigo.getText().length(); i++) {
            letra = txtCodigo.getText().charAt(i);
            if (letra == '(') {
                stock.push(letra);
            } else if (letra == ')') {
                if (!stock.isEmpty()) {
                    stock.pop();
                } else {
                    resultado = "Error: falta un '(' ";
                    while (!stock.isEmpty()) {
                        stock.pop();
                    }
                }
            }
        }
        if (!stock.isEmpty()) {
            resultado = "Error: Se espera un ')' ";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_btnValidarCodigoActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        // TODO add your handling code here:
        String infija;
        String postfija;
        infija = txtInfija.getText() + "";
        postfija = Notaciones.convertirInToPost(infija);
        txtPostfija.setText(postfija + "");
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        // TODO add your handling code here:
        try {
            String postfija = txtPostfija.getText();
            double resultado;
            resultado = Notaciones.evaluarExpresion(postfija);
            txtResultado.setText("" + resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Verifica la expresión");
        }
    }//GEN-LAST:event_btnEvaluarActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // TODO add your handling code here:
        Pila stock = new Pila(20);
        Pila stock1 = new Pila(20);
        Pila stock2 = new Pila(20);

        char letra;
        String resultado = "Codigo correcto";
        //int s = txtAlgebra.getRows();
        for (int i = 0; i < txtAlgebraica.getText().length(); i++) {
            letra = txtAlgebraica.getText().charAt(i);
            if (letra == '(') {
                stock.push(letra);
            } else if (letra == ')') {
                if (!stock.isEmpty()) {
                    stock.pop();
                } else {
                    resultado = "Error, falta un '('";
                    while (!stock.isEmpty()) {
                        stock.pop();
                    }
                }
            }
        }
        if (!stock.isEmpty()) {
            resultado = "Error, falta un ')'";
        }

        for (int i = 0; i < txtAlgebraica.getText().length(); i++) {
            letra = txtAlgebraica.getText().charAt(i);
            if (letra == '{') {
                stock1.push(letra);
            } else if (letra == '}') {
                if (!stock1.isEmpty()) {
                    stock1.pop();
                } else {
                    resultado = "Error, falta un '{'";
                    while (!stock1.isEmpty()) {
                        stock.pop();
                    }
                }
            }
        }
        if (!stock1.isEmpty()) {
            resultado = "Error, falta un '}'";
        }

        for (int i = 0; i < txtAlgebraica.getText().length(); i++) {
            letra = txtAlgebraica.getText().charAt(i);
            if (letra == '[') {
                stock2.push(letra);
            } else if (letra == ']') {
                if (!stock2.isEmpty()) {
                    stock2.pop();
                } else {
                    resultado = "Error, falta un '['";
                    while (!stock2.isEmpty()) {
                        stock.pop();
                    }
                }
            }
        }
        if (!stock2.isEmpty()) {
            resultado = "Error, falta un ']'";
        }
        JOptionPane.showMessageDialog(this, resultado);
    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtAlgebraica.setText("");
        txtCodigo.setText("");
        txtInfija.setText("");
        txtPostfija.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null, "¿Deseas salir?");
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,  "Alumno: Luis Fernando Lira García" + "\nNo. Control: 1216100769" + "\nGrupo: GSI1342" + "\nAsignatura: Estructura de Datos", "Créditos", JOptionPane.WARNING_MESSAGE,user);
    }//GEN-LAST:event_btnCreditosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton btnLeerCodigo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnValidar;
    private javax.swing.JButton btnValidarCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlgebraica;
    private javax.swing.JTextArea txtCodigo;
    private javax.swing.JTextField txtInfija;
    private javax.swing.JTextField txtPostfija;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
