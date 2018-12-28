/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.RepartidorUI;

/**
 *
 * @author Lina
 */
public class PnlRepartidorPedidos extends javax.swing.JPanel {

    /**
     * @return the btnBuscar
     */
    public javax.swing.JButton getBtnBuscar() {
        return btnBuscar;
    }

    /**
     * @param btnBuscar the btnBuscar to set
     */
    public void setBtnBuscar(javax.swing.JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    /**
     * @return the btnEntregado
     */
    public javax.swing.JButton getBtnEntregado() {
        return btnEntregado;
    }

    /**
     * @param btnEntregado the btnEntregado to set
     */
    public void setBtnEntregado(javax.swing.JButton btnEntregado) {
        this.btnEntregado = btnEntregado;
    }

    /**
     * @return the btnInformacion
     */
    public javax.swing.JButton getBtnInformacion() {
        return btnInformacion;
    }

    /**
     * @param btnInformacion the btnInformacion to set
     */
    public void setBtnInformacion(javax.swing.JButton btnInformacion) {
        this.btnInformacion = btnInformacion;
    }

    /**
     * @return the cbFiltrar
     */
    public javax.swing.JComboBox<String> getCbFiltrar() {
        return cbFiltrar;
    }

    /**
     * @param cbFiltrar the cbFiltrar to set
     */
    public void setCbFiltrar(javax.swing.JComboBox<String> cbFiltrar) {
        this.cbFiltrar = cbFiltrar;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the tblPedidos
     */
    public javax.swing.JTable getTblPedidos() {
        return tblPedidos;
    }

    /**
     * @param tblPedidos the tblPedidos to set
     */
    public void setTblPedidos(javax.swing.JTable tblPedidos) {
        this.tblPedidos = tblPedidos;
    }

    /**
     * @return the txtBuscar
     */
    public javax.swing.JTextField getTxtBuscar() {
        return txtBuscar;
    }

    /**
     * @param txtBuscar the txtBuscar to set
     */
    public void setTxtBuscar(javax.swing.JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    /** Creates new form PnlBodegueroProductos */
    public PnlRepartidorPedidos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInformacion = new javax.swing.JButton();
        btnEntregado = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        cbFiltrar = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInformacion.setBackground(new java.awt.Color(77, 98, 94));
        btnInformacion.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(255, 255, 255));
        btnInformacion.setText("Informacion");
        btnInformacion.setContentAreaFilled(false);
        btnInformacion.setFocusPainted(false);
        btnInformacion.setOpaque(true);
        add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 150, 30));

        btnEntregado.setBackground(new java.awt.Color(77, 98, 94));
        btnEntregado.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        btnEntregado.setForeground(new java.awt.Color(255, 255, 255));
        btnEntregado.setText("Entregado");
        btnEntregado.setContentAreaFilled(false);
        btnEntregado.setFocusPainted(false);
        btnEntregado.setOpaque(true);
        add(btnEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 30));

        txtBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 30));

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "Orden", "Fecha", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblPedidos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 560, 330));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_26px_3.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_26px_5.png"))); // NOI18N
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 40, 30));

        cbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 150, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEntregado;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JComboBox<String> cbFiltrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
