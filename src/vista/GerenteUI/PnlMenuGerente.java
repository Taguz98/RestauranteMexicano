/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.GerenteUI;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andres Novillo
 */
public class PnlMenuGerente extends javax.swing.JPanel {

    /**
     * Creates new form Pnl_MenuGerente
     */
    public PnlMenuGerente() {
        initComponents();
    }

    public JButton getBtnCompras() {
        return btnCompras;
    }

    public JButton getBtnContratos() {
        return btnContratos;
    }

    public JButton getBtnPagos() {
        return btnPagos;
    }

    public JButton getBtnPlatos() {
        return btnPlatos;
    }

    public JButton getBtnVentas() {
        return btnVentas;
    }

    public JLabel getLblNombreGerente() {
        return lblNombreGerente;
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPagos = new javax.swing.JButton();
        btnPlatos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnContratos = new javax.swing.JButton();
        lblNombreGerente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 181, 55));
        setMinimumSize(new java.awt.Dimension(200, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPagos.setBackground(new java.awt.Color(77, 98, 94));
        btnPagos.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnPagos.setForeground(new java.awt.Color(255, 255, 255));
        btnPagos.setText("PAGOS");
        btnPagos.setContentAreaFilled(false);
        btnPagos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnPagos.setOpaque(true);
        add(btnPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 50));

        btnPlatos.setBackground(new java.awt.Color(77, 98, 94));
        btnPlatos.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnPlatos.setForeground(new java.awt.Color(255, 255, 255));
        btnPlatos.setText("PLATOS");
        btnPlatos.setContentAreaFilled(false);
        btnPlatos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnPlatos.setOpaque(true);
        add(btnPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        btnVentas.setBackground(new java.awt.Color(77, 98, 94));
        btnVentas.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("VENTAS");
        btnVentas.setContentAreaFilled(false);
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnVentas.setOpaque(true);
        add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        btnCompras.setBackground(new java.awt.Color(77, 98, 94));
        btnCompras.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnCompras.setForeground(new java.awt.Color(255, 255, 255));
        btnCompras.setText("COMPRAS");
        btnCompras.setContentAreaFilled(false);
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCompras.setOpaque(true);
        add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 50));

        btnContratos.setBackground(new java.awt.Color(77, 98, 94));
        btnContratos.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnContratos.setForeground(new java.awt.Color(255, 255, 255));
        btnContratos.setText("CONTRATOS");
        btnContratos.setContentAreaFilled(false);
        btnContratos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnContratos.setOpaque(true);
        add(btnContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 50));

        lblNombreGerente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNombreGerente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreGerente.setText("Nombre Gerente");
        add(lblNombreGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gerente");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Bienvenido");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnContratos;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnPlatos;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNombreGerente;
    // End of variables declaration//GEN-END:variables
}
