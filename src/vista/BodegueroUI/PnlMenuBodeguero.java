/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.BodegueroUI;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andres Novillo
 */
public class PnlMenuBodeguero extends javax.swing.JPanel {

    /**
     * Creates new form Pnl_MenuGerente
     */
    public PnlMenuBodeguero() {
        initComponents();
    }    

    public JButton getBtnFacturas() {
        return btnFacturas;
    }

    public JButton getBtnProductos() {
        return btnProductos;
    }

    public JLabel getLblNombreBodeguero() {
        return lblNombreBodeguero;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProductos = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        lblNombreBodeguero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 181, 55));
        setMinimumSize(new java.awt.Dimension(200, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProductos.setBackground(new java.awt.Color(77, 98, 94));
        btnProductos.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("PRODUCTOS");
        btnProductos.setContentAreaFilled(false);
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnProductos.setOpaque(true);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        btnFacturas.setBackground(new java.awt.Color(77, 98, 94));
        btnFacturas.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturas.setText("FACTURAS");
        btnFacturas.setContentAreaFilled(false);
        btnFacturas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnFacturas.setOpaque(true);
        add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        lblNombreBodeguero.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNombreBodeguero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreBodeguero.setText("Nombre Bodeguero");
        add(lblNombreBodeguero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bodeguero");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Bienvenido");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNombreBodeguero;
    // End of variables declaration//GEN-END:variables
}
