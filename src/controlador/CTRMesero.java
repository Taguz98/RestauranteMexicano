/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.MeseroUI.PnlMenuMesero;
import vista.MeseroUI.PnlMeseroMesas;
import vista.MeseroUI.PnlMeseroOrdenes;
import vista.PnlBienvenido;
import vista.VtnPrincipal;

/**
 *
 * @author Usuario
 */
public class CTRMesero {
    
    private VtnPrincipal vtnPrin; 
    private PnlMenuMesero pnlMenu; 
    private PnlBienvenido pnlBienvenido; 

    public CTRMesero(VtnPrincipal vtnPrin, PnlMenuMesero pnlMenu, PnlBienvenido pnlBienvenido) {
        this.vtnPrin = vtnPrin;
        this.pnlMenu = pnlMenu;
        this.pnlBienvenido = pnlBienvenido;
        
        CTRMaster.cambioPanel(vtnPrin.getPnlMenu(), pnlMenu);
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlBienvenido);
    }
    
    public void iniciar(){
        System.out.println("Iniciamos el CTR Mesero");
        //Agregamos las animaciones a los btns  
        pnlMenu.getBtnMesas().addMouseListener(new CTRBtns(pnlMenu.getBtnMesas()));
        pnlMenu.getBtnOrdenes().addMouseListener(new CTRBtns(pnlMenu.getBtnOrdenes()));
        //Agregamos una accion al dar clik a un btn
        pnlMenu.getBtnMesas().addActionListener(e -> mesas()); 
        pnlMenu.getBtnOrdenes().addActionListener(e -> ordenes()); 
    }
    
    public void mesas(){ 
        //Repintamos el pnl principal  
        PnlMeseroMesas pnlMesas = new PnlMeseroMesas(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlMesas);
        //Agregamos las animaciones a los btns  
        pnlMesas.getBtnInformacion().addMouseListener(new CTRBtns(pnlMesas.getBtnInformacion()));
        pnlMesas.getBtnLibre().addMouseListener(new CTRBtns(pnlMesas.getBtnLibre()));
    }
    
    public void ordenes(){ 
        //Repintamos el pnl principal  
        PnlMeseroOrdenes pnlOrdenes = new PnlMeseroOrdenes(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlOrdenes);
        //Agregamos las animaciones 
        pnlOrdenes.getBtnActualizar().addMouseListener(new CTRBtns(pnlOrdenes.getBtnActualizar()));
        pnlOrdenes.getBtnEntregado().addMouseListener(new CTRBtns(pnlOrdenes.getBtnEntregado()));
        pnlOrdenes.getBtnIngresar().addMouseListener(new CTRBtns(pnlOrdenes.getBtnIngresar()));
    }
    
}
