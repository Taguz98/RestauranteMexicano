/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.RecepcionistaUI;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Andres Novillo
 */
public class PnlMenuRecepcionista extends javax.swing.JPanel {

    /**
     * Creates new form Pnl_MenuGerente
     */
    public PnlMenuRecepcionista() {
        initComponents();
    }

    public JButton getBtnAsistencia() {
        return btnAsistencia;
    }

    public JButton getBtnMesas() {
        return btnMesas;
    }

    public JButton getBtnPedidos() {
        return btnPedidos;
    }

    public JButton getBtnReservas() {
        return btnReservas;
    }

    public JLabel getLblNombreRecepcionista() {
        return lblNombreRecepcionista;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReservas = new javax.swing.JButton();
        btnAsistencia = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnMesas = new javax.swing.JButton();
        lblNombreRecepcionista = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 181, 55));
        setMinimumSize(new java.awt.Dimension(200, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReservas.setBackground(new java.awt.Color(77, 98, 94));
        btnReservas.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnReservas.setForeground(new java.awt.Color(255, 255, 255));
        btnReservas.setText("RESERVAS");
        btnReservas.setContentAreaFilled(false);
        btnReservas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnReservas.setOpaque(true);
        add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        btnAsistencia.setBackground(new java.awt.Color(77, 98, 94));
        btnAsistencia.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        btnAsistencia.setText("ASISTENCIA");
        btnAsistencia.setContentAreaFilled(false);
        btnAsistencia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnAsistencia.setOpaque(true);
        add(btnAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        btnPedidos.setBackground(new java.awt.Color(77, 98, 94));
        btnPedidos.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnPedidos.setForeground(new java.awt.Color(255, 255, 255));
        btnPedidos.setText("PEDIDOS");
        btnPedidos.setContentAreaFilled(false);
        btnPedidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnPedidos.setOpaque(true);
        add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 50));

        btnMesas.setBackground(new java.awt.Color(77, 98, 94));
        btnMesas.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnMesas.setForeground(new java.awt.Color(255, 255, 255));
        btnMesas.setText("MESAS");
        btnMesas.setContentAreaFilled(false);
        btnMesas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnMesas.setOpaque(true);
        add(btnMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 50));

        lblNombreRecepcionista.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNombreRecepcionista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreRecepcionista.setText("Nombre Recepcionista");
        add(lblNombreRecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Recepcionista");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Bienvenido");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnMesas;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnReservas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNombreRecepcionista;
    // End of variables declaration//GEN-END:variables
}
