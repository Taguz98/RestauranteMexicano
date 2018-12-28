/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import javax.swing.JPanel;
import java.awt.Frame; 
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author Usuario
 */
public class VtnPrincipal extends javax.swing.JFrame implements WindowFocusListener {
    
    //Variables que uso para cacturar la posicion de la ventana y poder moverla 
    private int mouseX; 
    private int mouseY; 

    /** Creates new form VtnPrincipal */
    public VtnPrincipal() {
        initComponents();
        
        //Agregamos un escuchador cuando el frame pierdes y gana un focus 
        //Nos dara una animacion del borde en modo azul y modo gris
        addWindowFocusListener(this); 
    }
    
    public JPanel getPnlMenu(){
        return pnlMenu; 
    }
    
    public JPanel getPnlPrincipal(){
        return pnlPrincipal;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(802, 502));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(24, 131, 215), 3));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(86, 171, 96));
        pnlHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlHeader.setPreferredSize(new java.awt.Dimension(800, 30));
        pnlHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderMouseDragged(evt);
            }
        });
        pnlHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderMousePressed(evt);
            }
        });
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Subtract_26px.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Subtract_26px_1.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        pnlHeader.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 30, 20));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_26px_1.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_26px.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        pnlHeader.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jarvis PLUS");
        pnlHeader.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icono V.1.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlHeader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        panelFondo.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 800, 30));

        pnlMenu.setBackground(new java.awt.Color(245, 181, 55));
        pnlMenu.setPreferredSize(new java.awt.Dimension(200, 475));
        pnlMenu.setLayout(new java.awt.CardLayout());
        panelFondo.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 31, 200, 410));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new java.awt.CardLayout());
        panelFondo.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 31, 600, 470));

        panelSalir.setBackground(new java.awt.Color(245, 181, 55));
        panelSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(77, 98, 94));
        btnSalir.setFont(new java.awt.Font("Oswald", 0, 22)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setOpaque(true);
        panelSalir.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 40));

        panelFondo.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 441, 200, 60));

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 802, 502));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        mouseX = evt.getX(); 
        mouseY = evt.getY();
        
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        int x = evt.getXOnScreen(); 
        int y = evt.getYOnScreen(); 
        
        this.setLocation(x - mouseX, y - mouseY); 
    }//GEN-LAST:event_pnlHeaderMouseDragged

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        System.exit(0); 
    }//GEN-LAST:event_btnCerrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
    
    //Metodos sobreescritos de la interfaz WindowFocusListener
    
    @Override
    public void windowGainedFocus(WindowEvent e) {
        panelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(24, 131, 215), 3));
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        panelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(170, 170, 170), 3));
    }

}