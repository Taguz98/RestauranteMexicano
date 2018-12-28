/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.CocineroUI.PnlCocineroInventario;
import vista.CocineroUI.PnlCocineroOrdenes;
import vista.CocineroUI.PnlCocineroPlatos;
import vista.CocineroUI.PnlMenuCocinero;
import vista.GerenteUI.PnlGerentePagos;
import vista.PnlBienvenido;
import vista.VtnPrincipal;

/**
 *
 * @author Usuario
 */
public class CTRCocinero {
    private VtnPrincipal vtnPrin; 
    private PnlMenuCocinero pnlMenu; 
    private PnlBienvenido pnlBienvenido; 

    public CTRCocinero(VtnPrincipal vtnPrin, PnlMenuCocinero pnlMenu, PnlBienvenido pnlBienvenido) {
        this.vtnPrin = vtnPrin;
        this.pnlMenu = pnlMenu;
        this.pnlBienvenido = pnlBienvenido;
        
        CTRMaster.cambioPanel(vtnPrin.getPnlMenu(), pnlMenu);
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlBienvenido); 
    }
    
    public void iniciar(){ 
        System.out.println("Inciamos el CTR cocinero");
        //Agregamos animaciones  
        pnlMenu.getBtnInventario().addMouseListener(new CTRBtns(pnlMenu.getBtnInventario())); 
        pnlMenu.getBtnOrdenes().addMouseListener(new CTRBtns(pnlMenu.getBtnOrdenes())); 
        pnlMenu.getBtnPlatos().addMouseListener(new CTRBtns(pnlMenu.getBtnPlatos())); 
        //Le asignamos un funcion al dar click a un boton 
        
        pnlMenu.getBtnInventario().addActionListener(e -> inventario()); 
        pnlMenu.getBtnOrdenes().addActionListener(e -> ordenes()); 
        pnlMenu.getBtnPlatos().addActionListener(e -> platos()); 
    }
    
    public void inventario(){ 
        //Repintamos el panel principal  
        PnlCocineroInventario pnlInventario = new PnlCocineroInventario(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlInventario); 
        //Le agregamos las animaciones a los btns 
        pnlInventario.getBtnActualizar().addMouseListener(new CTRBtns(pnlInventario.getBtnActualizar())); 
        pnlInventario.getBtnEliminar().addMouseListener(new CTRBtns(pnlInventario.getBtnEliminar())); 
        pnlInventario.getBtnIngresar().addMouseListener(new CTRBtns(pnlInventario.getBtnIngresar())); 
    }
    
    public void ordenes(){ 
        //Repintamos el panel principal  
        PnlCocineroOrdenes pnlOrdenes = new PnlCocineroOrdenes(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlOrdenes);
        //Agregamos las animaciones  
        pnlOrdenes.getBtnEntregado().addMouseListener(new CTRBtns(pnlOrdenes.getBtnEntregado()));
        pnlOrdenes.getBtnIngresar().addMouseListener(new CTRBtns(pnlOrdenes.getBtnIngresar())); 
        pnlOrdenes.getBtnModificar().addMouseListener(new CTRBtns(pnlOrdenes.getBtnModificar())); 
    }
    
    public void platos(){ 
        //Repintamos el pnl principal  
        PnlCocineroPlatos pnlPlatos = new PnlCocineroPlatos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlPlatos); 
        //Agregamos las animaciones 
        pnlPlatos.getBtnInformacion().addMouseListener(new CTRBtns(pnlPlatos.getBtnInformacion()));
        pnlPlatos.getBtnIngresar().addMouseListener(new CTRBtns(pnlPlatos.getBtnIngresar())); 
        pnlPlatos.getBtnModificar().addMouseListener(new CTRBtns(pnlPlatos.getBtnModificar())); 
    }
}
