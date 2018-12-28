/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.CajeroUI.PnlCajeroCaja;
import vista.CajeroUI.PnlCajeroVentas;
import vista.CajeroUI.PnlMenuCajero;
import vista.PnlBienvenido;
import vista.VtnPrincipal;

/**
 *
 * @author Usuario
 */
public class CTRCajero {
    
    private VtnPrincipal vtnPrin;  
    private PnlMenuCajero pnlMenu; 
    private PnlBienvenido pnlBienvenido; 

    public CTRCajero(VtnPrincipal vtnPrin, PnlMenuCajero pnlMenu, PnlBienvenido pnlBienvenido) {
        this.vtnPrin = vtnPrin;
        this.pnlMenu = pnlMenu;
        this.pnlBienvenido = pnlBienvenido;
        
        CTRMaster.cambioPanel(vtnPrin.getPnlMenu(), pnlMenu);
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlBienvenido);
    }
    
    public void iniciar(){ 
        System.out.println("Iniciamos el CTR cajero");
        //Agregamos las anmaciones a los btns 
        pnlMenu.getBtnCaja().addMouseListener(new CTRBtns(pnlMenu.getBtnCaja())); 
        pnlMenu.getBtnVentas().addMouseListener(new CTRBtns(pnlMenu.getBtnVentas())); 
        
        //Asignamos una metodo al dar click a un btn  
        pnlMenu.getBtnCaja().addActionListener(e -> caja()); 
        pnlMenu.getBtnVentas().addActionListener(e -> ventas()); 
    }
    
    public void caja(){ 
        //Repintamos el panel principal  
        PnlCajeroCaja pnlCaja = new PnlCajeroCaja(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlCaja); 
        
        //Agregamos las animaciones a los btns  
        pnlCaja.getBtnEliminar().addMouseListener(new CTRBtns(pnlCaja.getBtnEliminar())); 
        pnlCaja.getBtnIngresar().addMouseListener(new CTRBtns(pnlCaja.getBtnIngresar())); 
        pnlCaja.getBtnModificar().addMouseListener(new CTRBtns(pnlCaja.getBtnModificar())); 
    }
    
    public void ventas(){ 
        //Repintamos el panel 
        PnlCajeroVentas pnlVentas = new PnlCajeroVentas(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlVentas);
        
        //Agregamos las animaciones a los btns  
        pnlVentas.getBtnImprimir().addMouseListener(new CTRBtns(pnlVentas.getBtnImprimir()));
        pnlVentas.getBtnVer().addMouseListener(new CTRBtns(pnlVentas.getBtnVer()));
    }
    
    
    
}
