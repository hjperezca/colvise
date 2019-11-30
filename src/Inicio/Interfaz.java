/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import javax.swing.JComboBox;

/**
 *
 * @author Heiner Perez
 */
public class Interfaz extends javax.swing.JFrame {
    
   

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabellogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttoningresar = new javax.swing.JButton();
        combousuario = new javax.swing.JComboBox<>();
        jlebelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonsalir.setBackground(new java.awt.Color(0, 102, 255));
        buttonsalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonsalir.setForeground(new java.awt.Color(255, 255, 255));
        buttonsalir.setText("SALIR");
        buttonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsalirActionPerformed(evt);
            }
        });
        getContentPane().add(buttonsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COLVISE S.A.S");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vigilante.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabellogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User1.png"))); // NOI18N
        getContentPane().add(jLabellogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIPO DE USUARIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        buttoningresar.setBackground(new java.awt.Color(102, 0, 255));
        buttoningresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttoningresar.setForeground(new java.awt.Color(255, 255, 255));
        buttoningresar.setText("INGRESAR");
        buttoningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoningresarActionPerformed(evt);
            }
        });
        getContentPane().add(buttoningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        combousuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combousuario.setForeground(new java.awt.Color(255, 255, 255));
        combousuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Secretaria", "Vigilante", "Supervisor" }));
        combousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combousuarioActionPerformed(evt);
            }
        });
        getContentPane().add(combousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 160, 40));

        jlebelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jlebelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 492, 493));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsalirActionPerformed
       System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_buttonsalirActionPerformed

    private void buttoningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoningresarActionPerformed
      String opcion = combousuario.getSelectedItem().toString();
      if(opcion.equals("Administrador")){
       Administrador administrador = new Administrador();
       administrador.show();
       this.dispose();}else if(opcion.equals("Secretaria")){
       Secretaria secretaria = new Secretaria();
       secretaria.show();
       this.dispose();}else if(opcion.equals("Vigilante")){
       Vigilantes vigilantes = new Vigilantes();
       vigilantes.show();
       this.dispose();}else if(opcion.equals("Supervisor")){
       Supervisor supervisor = new Supervisor();
       supervisor.show();
       this.dispose();}
    }//GEN-LAST:event_buttoningresarActionPerformed

    private void combousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combousuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combousuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoningresar;
    private javax.swing.JButton buttonsalir;
    private javax.swing.JComboBox<String> combousuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabellogo;
    private javax.swing.JLabel jlebelfondo;
    // End of variables declaration//GEN-END:variables

    void setViseble(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
