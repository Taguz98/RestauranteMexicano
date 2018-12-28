/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.MeseroUI;

/**
 *
 * @author Lina
 */
public class PnlMeseroOrdenes extends javax.swing.JPanel {

    /**
     * @return the btnActualizar
     */
    public javax.swing.JButton getBtnActualizar() {
        return btnActualizar;
    }

    /**
     * @param btnActualizar the btnActualizar to set
     */
    public void setBtnActualizar(javax.swing.JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

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
     * @return the btnIngresar
     */
    public javax.swing.JButton getBtnIngresar() {
        return btnIngresar;
    }

    /**
     * @param btnIngresar the btnIngresar to set
     */
    public void setBtnIngresar(javax.swing.JButton btnIngresar) {
        this.btnIngresar = btnIngresar;
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
     * @return the tblOrdenes
     */
    public javax.swing.JTable getTblOrdenes() {
        return tblOrdenes;
    }

    /**
     * @param tblOrdenes the tblOrdenes to set
     */
    public void setTblOrdenes(javax.swing.JTable tblOrdenes) {
        this.tblOrdenes = tblOrdenes;
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
    public PnlMeseroOrdenes() {
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

        btnEntregado = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdenes = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        cbFiltrar = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntregado.setBackground(new java.awt.Color(77, 98, 94));
        btnEntregado.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        btnEntregado.setForeground(new java.awt.Color(255, 255, 255));
        btnEntregado.setText("Entregado");
        btnEntregado.setContentAreaFilled(false);
        btnEntregado.setFocusPainted(false);
        btnEntregado.setOpaque(true);
        add(btnEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 150, 30));

        btnIngresar.setBackground(new java.awt.Color(77, 98, 94));
        btnIngresar.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setFocusPainted(false);
        btnIngresar.setOpaque(true);
        add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 30));

        btnActualizar.setBackground(new java.awt.Color(77, 98, 94));
        btnActualizar.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setFocusPainted(false);
        btnActualizar.setOpaque(true);
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 160, 30));

        txtBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 30));

        tblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N. Orden", "N. Mesa", "Hora"
            }
        ));
        jScrollPane1.setViewportView(tblOrdenes);

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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEntregado;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> cbFiltrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrdenes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
