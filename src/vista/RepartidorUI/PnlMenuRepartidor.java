/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.RepartidorUI;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andres Novillo
 */
public class PnlMenuRepartidor extends javax.swing.JPanel {

    /**
     * Creates new form Pnl_MenuGerente
     */
    public PnlMenuRepartidor() {
        initComponents();
    }

    public JButton getBtnPedidos() {
        return btnPedidos;
    }

    public JLabel getLblNombreRepartidor() {
        return lblNombreRepartidor;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPedidos = new javax.swing.JButton();
        lblNombreRepartidor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 181, 55));
        setMinimumSize(new java.awt.Dimension(200, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPedidos.setBackground(new java.awt.Color(77, 98, 94));
        btnPedidos.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnPedidos.setForeground(new java.awt.Color(255, 255, 255));
        btnPedidos.setText("PEDIDOS");
        btnPedidos.setContentAreaFilled(false);
        btnPedidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnPedidos.setOpaque(true);
        add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        lblNombreRepartidor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNombreRepartidor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreRepartidor.setText("Nombre Repartidor");
        add(lblNombreRepartidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Repartidor");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Bienvenido");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPedidos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNombreRepartidor;
    // End of variables declaration//GEN-END:variables
}
