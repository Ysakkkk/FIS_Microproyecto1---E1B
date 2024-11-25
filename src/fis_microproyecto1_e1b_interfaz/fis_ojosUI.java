/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fis_microproyecto1_e1b_interfaz;
import javax.swing.JOptionPane;
import fis_microproyecto1_e1b.FIS_Microproyecto1E1B;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Camilo. ChewCEC
 */
public class fis_ojosUI extends javax.swing.JFrame {
    private FIS_Microproyecto1E1B resultados = new FIS_Microproyecto1E1B();
    /**
     * Creates new form fis_ojosUI
     */
    public fis_ojosUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instruccionesField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        refraccion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultadosTextArea = new javax.swing.JTextArea();
        agudezaVisual = new javax.swing.JLabel();
        fatigaOcular = new javax.swing.JLabel();
        dolorOcular = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonCalcular = new javax.swing.JButton();
        respuestaRefraccion = new javax.swing.JTextField();
        respuestaAgudezaVisual = new javax.swing.JTextField();
        eyeImage = new javax.swing.JLabel();
        titleUI = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        respuestaFatigaOcular = new javax.swing.JTextField();
        respuestaDolorOcular = new javax.swing.JTextField();

        instruccionesField.setText("Dolor Ocular: Selecciona el nivel de molestia o dolor en tus ojos o áreas cercanas.\nNulo (0-2), Leve (2-5), Moderado (5-7), Intenso (7-10). \nFatiga Ocular: Indica cuánto cansancio sientes en tus ojos después de un esfuerzo visual.  \nNula (0-2), Leve (1-4), Moderada (3-6), Alta (5-8), Intensa (7-10). \nRefracción: Ingresa el valor que mide cómo los rayos de luz se enfocan en tu ojo (en dioptrías). \nBaja (-0.25 a -3.00), Media (-2.50 a -5.00), Alta (-4.50 a -7.00), Muy alta (-6.00 a -10.00). \nAgudeza Visual: Escribe el valor que indica qué tan bien distingues detalles con tus ojos.  \nBuena (8-10), Regular (5-8), Pobre (1-5), Muy pobre (0.2-1)");
        instruccionesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruccionesFieldActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        refraccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        refraccion.setText("Refracción");

        ResultadosTextArea.setEditable(false);
        ResultadosTextArea.setColumns(20);
        ResultadosTextArea.setRows(5);
        jScrollPane1.setViewportView(ResultadosTextArea);

        agudezaVisual.setBackground(new java.awt.Color(204, 204, 204));
        agudezaVisual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agudezaVisual.setText("Agudeza Visual");

        fatigaOcular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fatigaOcular.setText("Fatiga Ocular");

        dolorOcular.setBackground(new java.awt.Color(204, 204, 204));
        dolorOcular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dolorOcular.setText("Dolor Ocular");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        buttonCalcular.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        respuestaRefraccion.setBackground(new java.awt.Color(204, 204, 204));
        respuestaRefraccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        respuestaRefraccion.setText("valores de -10.00, -0.25");
        respuestaRefraccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                respuestaRefraccionKeyTyped(evt);
            }
        });

        respuestaAgudezaVisual.setBackground(new java.awt.Color(204, 204, 204));
        respuestaAgudezaVisual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        respuestaAgudezaVisual.setText("valores de 0.2 - 10");
        respuestaAgudezaVisual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                respuestaAgudezaVisualKeyTyped(evt);
            }
        });

        eyeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fis_microproyecto1_e1b_interfaz/eye.png"))); // NOI18N

        titleUI.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titleUI.setText("Diagnóstico ocular");

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("<html>   <b><h3>Instrucciones de uso:</h3></b><br><br>   Ingrese los valores para evaluar el estado visual:<br>   - Dolor Ocular (0.0 - 10.0): Nivel de molestia o dolor en los ojos<br>   -  Fatiga Ocular (0.0 - 10.0): Nivel de cansancio visual tras un esfuerzo prolongado<br>   - Refracción (-10.00 a -0.25 D): Valor que mide cómo la luz se enfoca en el ojo<br>   - Agudeza Visual (0.2-10): Capacidad para distinguir detalles con claridad<br><br> </html> ");

        respuestaFatigaOcular.setBackground(new java.awt.Color(204, 204, 204));
        respuestaFatigaOcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        respuestaFatigaOcular.setText("valores de 0.0 - 10.0");
        respuestaFatigaOcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                respuestaFatigaOcularKeyTyped(evt);
            }
        });

        respuestaDolorOcular.setBackground(new java.awt.Color(204, 204, 204));
        respuestaDolorOcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        respuestaDolorOcular.setText("valores de 0.0 - 10.0");
        respuestaDolorOcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                respuestaDolorOcularKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(buttonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eyeImage)
                                .addGap(18, 18, 18)
                                .addComponent(titleUI))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fatigaOcular)
                                    .addComponent(agudezaVisual)
                                    .addComponent(refraccion)
                                    .addComponent(dolorOcular))
                                .addGap(112, 112, 112)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(respuestaRefraccion)
                                    .addComponent(respuestaAgudezaVisual)
                                    .addComponent(respuestaFatigaOcular)
                                    .addComponent(respuestaDolorOcular))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(titleUI, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(eyeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dolorOcular)
                    .addComponent(respuestaDolorOcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respuestaFatigaOcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatigaOcular))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refraccion)
                    .addComponent(respuestaRefraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agudezaVisual)
                    .addComponent(respuestaAgudezaVisual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
        // TODO add your handling code here:
        try{
            double agudezaVisual = Double.parseDouble(respuestaAgudezaVisual.getText().replace(",", ".")); 
            double refraccion = Double.parseDouble(respuestaRefraccion.getText().replace(",", "."));
            double dolorOcular = Double.parseDouble(respuestaDolorOcular.getText().replace(",", "."));
            double fatigaOcular = Double.parseDouble(respuestaFatigaOcular.getText().replace(",", "."));
                        
            if (refraccion < -10.00 || refraccion > -0.25) {
                JOptionPane.showMessageDialog(rootPane, "La Refracción debe estar entre -10.00 y -0.25 D");
            return;
            }
            
            if (agudezaVisual < 0.2 || agudezaVisual > 10.0) {
                JOptionPane.showMessageDialog(rootPane, "La Agudeza Visual debe estar entre 0.2 y 10");
            return;
            }
            
            if (dolorOcular < 0 || dolorOcular > 10.0) {
                JOptionPane.showMessageDialog(rootPane, "La Agudeza Visual debe estar entre 0.2 y 10");
            return;
            }
            
            if (fatigaOcular < 0 || fatigaOcular > 10.0) {
                JOptionPane.showMessageDialog(rootPane, "La Agudeza Visual debe estar entre 0.2 y 10");
            return;
            }
            
            ResultadosTextArea.setText(resultados.evaluarCeguera(agudezaVisual, refraccion, fatigaOcular, dolorOcular));
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Por favor complete todos los campos con valores numéricos válidos");
        }
        
    }//GEN-LAST:event_buttonCalcularActionPerformed

    private void instruccionesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instruccionesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instruccionesFieldActionPerformed

    private void respuestaDolorOcularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuestaDolorOcularKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();  
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Ingrese solo números");
        }
    }//GEN-LAST:event_respuestaDolorOcularKeyTyped

    private void respuestaFatigaOcularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuestaFatigaOcularKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();  
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Ingrese solo números");
        }
    }//GEN-LAST:event_respuestaFatigaOcularKeyTyped

    private void respuestaRefraccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuestaRefraccionKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();  
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Ingrese solo números");
        }
    }//GEN-LAST:event_respuestaRefraccionKeyTyped

    private void respuestaAgudezaVisualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuestaAgudezaVisualKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();  
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Valor inválido. Ingrese solo números");
        }
    }//GEN-LAST:event_respuestaAgudezaVisualKeyTyped

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
            java.util.logging.Logger.getLogger(fis_ojosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fis_ojosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fis_ojosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fis_ojosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fis_ojosUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ResultadosTextArea;
    private javax.swing.JLabel agudezaVisual;
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JLabel dolorOcular;
    private javax.swing.JLabel eyeImage;
    private javax.swing.JLabel fatigaOcular;
    private javax.swing.JTextField instruccionesField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel refraccion;
    private javax.swing.JTextField respuestaAgudezaVisual;
    private javax.swing.JTextField respuestaDolorOcular;
    private javax.swing.JTextField respuestaFatigaOcular;
    private javax.swing.JTextField respuestaRefraccion;
    private javax.swing.JLabel titleUI;
    // End of variables declaration//GEN-END:variables
}
