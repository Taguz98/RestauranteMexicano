/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.PnlBienvenido;
import vista.RepartidorUI.PnlMenuRepartidor;
import vista.RepartidorUI.PnlRepartidorPedidos;
import vista.VtnPrincipal;

/**
 *
 * @author Usuario
 */
public class CTRRepartidor {
    
    private VtnPrincipal vtnPrin; 
    private PnlMenuRepartidor pnlMenu; 
    private PnlBienvenido pnlBienvenido; 

    public CTRRepartidor(VtnPrincipal vtnPrin, PnlMenuRepartidor pnlMenu, PnlBienvenido pnlBienvenido) {
        this.vtnPrin = vtnPrin;
        this.pnlMenu = pnlMenu;
        this.pnlBienvenido = pnlBienvenido;
        
        CTRMaster.cambioPanel(vtnPrin.getPnlMenu(), pnlMenu);
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlBienvenido);
    }
    
    public void iniciar(){ 
        System.out.println("Iniciamos el CTR repartidor.");
        //Agregamos las aimaciones  
        pnlMenu.getBtnPedidos().addMouseListener(new CTRBtns(pnlMenu.getBtnPedidos()));
        //Asignamos una accion a cada btn  
        pnlMenu.getBtnPedidos().addActionListener(e -> pedidos());
    }
    
    public void pedidos(){ 
        //Repintamos el panel  
        PnlRepartidorPedidos pnlPedidos = new PnlRepartidorPedidos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlPedidos);
        //Agregamos las animaciones 
        pnlPedidos.getBtnEntregado().addMouseListener(new CTRBtns(pnlPedidos.getBtnEntregado()));
        pnlPedidos.getBtnInformacion().addMouseListener(new CTRBtns(pnlPedidos.getBtnInformacion()));
    }
    
}
