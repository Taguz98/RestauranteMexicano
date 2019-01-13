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

        btnOrdenes.setBackground(new java.awt.Color(77, 98, 94));
        btnOrdenes.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnOrdenes.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenes.setText("ORDENES");
        btnOrdenes.setContentAreaFilled(false);
        btnOrdenes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnOrdenes.setOpaque(true);

        btnInventario.setBackground(new java.awt.Color(77, 98, 94));
        btnInventario.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("INVENTARIO");
        btnInventario.setContentAreaFilled(false);
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnInventario.setOpaque(true);

        lblNombreCocinero.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNombreCocinero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreCocinero.setText("Nombre Cocinero");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cocinero");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Bienvenido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblNombreCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblNombreCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
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
