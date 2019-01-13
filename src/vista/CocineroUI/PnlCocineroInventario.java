/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.CocineroUI;

/**
 *
 * @author Lina
 */
public class PnlCocineroInventario extends javax.swing.JPanel {

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
     * @return the btnEliminar
     */
    public javax.swing.JButton getBtnEliminar() {
        return btnEliminar;
    }

    /**
     * @param btnEliminar the btnEliminar to set
     */
    public void setBtnEliminar(javax.swing.JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
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
     * @return the tblInventario
     */
    public javax.swing.JTable getTblInventario() {
        return tblInventario;
    }

    /**
     * @param tblInventario the tblInventario to set
     */
    public void setTblInventario(javax.swing.JTable tblInventario) {
        this.tblInventario = tblInventario;
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
    public PnlCocineroInventario() {
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

        btnEliminar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        cbFiltrar = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(86, 171, 96));

        btnEliminar.setBackground(new java.awt.Color(77, 98, 94));
        btnEliminar.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setOpaque(true);

        btnIngresar.setBackground(new java.awt.Color(77, 98, 94));
        btnIngresar.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setFocusPainted(false);
        btnIngresar.setOpaque(true);

        btnActualizar.setBackground(new java.awt.Color(77, 98, 94));
        btnActualizar.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setFocusPainted(false);
        btnActualizar.setOpaque(true);

        txtBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N. Ingrediente", "Nombre", "Estado", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblInventario);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_26px_3.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_26px_5.png"))); // NOI18N

        cbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> cbFiltrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
