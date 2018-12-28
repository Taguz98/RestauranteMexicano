/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.CajeroUI;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andres Novillo
 */
public class PnlMenuCajero extends javax.swing.JPanel {

    /**
     * Creates new form Pnl_MenuGerente
     */
    public PnlMenuCajero() {
        initComponents();
    }

    public JButton getBtnCaja() {
        return btnCaja;
    }

    public JButton getBtnVentas() {
        return btnVentas;
    }

    public JLabel getLblNombreCajero() {
        return lblNombreCajero;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCaja = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        lblNombreCajero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 181, 55));
        setMinimumSize(new java.awt.Dimension(200, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCaja.setBackground(new java.awt.Color(77, 98, 94));
        btnCaja.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnCaja.setForeground(new java.awt.Color(255, 255, 255));
        btnCaja.setText("CAJA");
        btnCaja.setContentAreaFilled(false);
        btnCaja.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCaja.setOpaque(true);
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });
        add(btnCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        btnVentas.setBackground(new java.awt.Color(77, 98, 94));
        btnVentas.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("VENTAS");
        btnVentas.setContentAreaFilled(false);
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnVentas.setOpaque(true);
        add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        lblNombreCajero.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNombreCajero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreCajero.setText("Nombre Cajero");
        add(lblNombreCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cajero");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Bienvenido");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaja;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNombreCajero;
    // End of variables declaration//GEN-END:variables
}
