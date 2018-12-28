/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.CocineroUI;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andres Novillo
 */
public class PnlMenuCocinero extends javax.swing.JPanel {

    /**
     * Creates new form Pnl_MenuGerente
     */
    public PnlMenuCocinero() {
        initComponents();
    }

    public JButton getBtnInventario() {
        return btnInventario;
    }

    public JButton getBtnOrdenes() {
        return btnOrdenes;
    }

    public JButton getBtnPlatos() {
        return btnPlatos;
    }

    public JLabel getLblNombreCocinero() {
        return lblNombreCocinero;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlatos = new javax.swing.JButton();
        btnOrdenes = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        lblNombreCocinero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 181, 55));
        setMinimumSize(new java.awt.Dimension(200, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlatos.setBackground(new java.awt.Color(77, 98, 94));
        btnPlatos.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnPlatos.setForeground(new java.awt.Color(255, 255, 255));
        btnPlatos.setText("PLATOS");
        btnPlatos.setContentAreaFilled(false);
        btnPlatos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnPlatos.setOpaque(true);
        btnPlatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatosActionPerformed(evt);
            }
        });
        add(btnPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        btnOrdenes.setBackground(new java.awt.Color(77, 98, 94));
        btnOrdenes.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenes.setText("ORDENES");
        btnOrdenes.setContentAreaFilled(false);
        btnOrdenes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnOrdenes.setOpaque(true);
        add(btnOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        btnInventario.setBackground(new java.awt.Color(77, 98, 94));
        btnInventario.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("INVENTARIO");
        btnInventario.setContentAreaFilled(false);
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnInventario.setOpaque(true);
        add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 50));

        lblNombreCocinero.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNombreCocinero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreCocinero.setText("Nombre Cocinero");
        add(lblNombreCocinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cocinero");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Bienvenido");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnOrdenes;
    private javax.swing.JButton btnPlatos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNombreCocinero;
    // End of variables declaration//GEN-END:variables
}
