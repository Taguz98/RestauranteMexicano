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
public class PnlMeseroMesas extends javax.swing.JPanel {

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
     * @return the btnLibre
     */
    public javax.swing.JButton getBtnLibre() {
        return btnLibre;
    }

    /**
     * @param btnLibre the btnLibre to set
     */
    public void setBtnLibre(javax.swing.JButton btnLibre) {
        this.btnLibre = btnLibre;
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
     * @return the tblMesas
     */
    public javax.swing.JTable getTblMesas() {
        return tblMesas;
    }

    /**
     * @param tblMesas the tblMesas to set
     */
    public void setTblMesas(javax.swing.JTable tblMesas) {
        this.tblMesas = tblMesas;
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
    public PnlMeseroMesas() {
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
        btnLibre = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMesas = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        cbFiltrar = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(86, 171, 96));

        btnInformacion.setBackground(new java.awt.Color(77, 98, 94));
        btnInformacion.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(255, 255, 255));
        btnInformacion.setText("Informacion");
        btnInformacion.setContentAreaFilled(false);
        btnInformacion.setFocusPainted(false);
        btnInformacion.setOpaque(true);

        btnLibre.setBackground(new java.awt.Color(77, 98, 94));
        btnLibre.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        btnLibre.setForeground(new java.awt.Color(255, 255, 255));
        btnLibre.setText("Libre");
        btnLibre.setContentAreaFilled(false);
        btnLibre.setFocusPainted(false);
        btnLibre.setOpaque(true);

        txtBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tblMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N. Mesas", "N. Sillas", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblMesas);

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
                        .addComponent(btnLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnLibre;
    private javax.swing.JComboBox<String> cbFiltrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMesas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
