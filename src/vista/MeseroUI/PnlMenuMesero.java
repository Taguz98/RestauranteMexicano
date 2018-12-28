/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.MeseroUI;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andres Novillo
 */
public class PnlMenuMesero extends javax.swing.JPanel {

    /**
     * Creates new form Pnl_MenuGerente
     */
    public PnlMenuMesero() {
        initComponents();
    }

    public JButton getBtnOrdenes() {
        return btnOrdenes;
    }

    public JButton getBtnMesas() {
        return btnMesas;
    }

    public JLabel getLblNombreMesero() {
        return lblNombreMesero;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrdenes = new javax.swing.JButton();
        btnMesas = new javax.swing.JButton();
        lblNombreMesero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 181, 55));
        setMinimumSize(new java.awt.Dimension(200, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrdenes.setBackground(new java.awt.Color(77, 98, 94));
        btnOrdenes.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenes.setText("ORDENES");
        btnOrdenes.setContentAreaFilled(false);
        btnOrdenes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnOrdenes.setOpaque(true);
        add(btnOrdenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        btnMesas.setBackground(new java.awt.Color(77, 98, 94));
        btnMesas.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnMesas.setForeground(new java.awt.Color(255, 255, 255));
        btnMesas.setText("MESAS");
        btnMesas.setContentAreaFilled(false);
        btnMesas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnMesas.setOpaque(true);
        add(btnMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        lblNombreMesero.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNombreMesero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreMesero.setText("Nombre Mesero");
        add(lblNombreMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mesero");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Bienvenido");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMesas;
    private javax.swing.JButton btnOrdenes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNombreMesero;
    // End of variables declaration//GEN-END:variables
}
