/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class CTRMaster {
    
      //Metodo para cambiar de paneles en nuestra ventana principal
    public static void cambioPanel(JPanel pnlPadre, JPanel pnlHijo){
        pnlPadre.removeAll(); 
        pnlPadre.repaint();
        pnlPadre.revalidate();
        
        pnlPadre.add(pnlHijo); 
        pnlPadre.repaint(); 
        pnlPadre.revalidate();   
    }
    
    
}
