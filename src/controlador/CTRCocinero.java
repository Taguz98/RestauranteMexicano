/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.estilo.BtnsHover;
import modelo.estilo.TblEstilo;
import vista.CocineroUI.PnlCocineroInventario;
import vista.CocineroUI.PnlCocineroOrdenes;
import vista.CocineroUI.PnlCocineroPlatos;
import vista.CocineroUI.PnlMenuCocinero;
import vista.PnlBienvenido;
import vista.VtnPrincipal;

/**
 *
 * @author Usuario
 */
public class CTRCocinero {
    private final VtnPrincipal vtnPrin; 
    private final PnlMenuCocinero pnlMenu; 
    private final PnlBienvenido pnlBienvenido; 

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
        pnlMenu.getBtnInventario().addMouseListener(new BtnsHover(pnlMenu.getBtnInventario())); 
        pnlMenu.getBtnOrdenes().addMouseListener(new BtnsHover(pnlMenu.getBtnOrdenes())); 
        pnlMenu.getBtnPlatos().addMouseListener(new BtnsHover(pnlMenu.getBtnPlatos())); 
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
        pnlInventario.getBtnActualizar().addMouseListener(new BtnsHover(pnlInventario.getBtnActualizar())); 
        pnlInventario.getBtnEliminar().addMouseListener(new BtnsHover(pnlInventario.getBtnEliminar())); 
        pnlInventario.getBtnIngresar().addMouseListener(new BtnsHover(pnlInventario.getBtnIngresar())); 
        
        TblEstilo.tituloTbl(pnlInventario.getTblInventario()); 
    }
    
    public void ordenes(){ 
        //Repintamos el panel principal  
        PnlCocineroOrdenes pnlOrdenes = new PnlCocineroOrdenes(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlOrdenes);
        //Agregamos las animaciones  
        pnlOrdenes.getBtnEntregado().addMouseListener(new BtnsHover(pnlOrdenes.getBtnEntregado()));
        pnlOrdenes.getBtnIngresar().addMouseListener(new BtnsHover(pnlOrdenes.getBtnIngresar())); 
        pnlOrdenes.getBtnModificar().addMouseListener(new BtnsHover(pnlOrdenes.getBtnModificar())); 
        
        TblEstilo.tituloTbl(pnlOrdenes.getTblOrdenes()); 
    }
    
    public void platos(){ 
        //Repintamos el pnl principal  
        PnlCocineroPlatos pnlPlatos = new PnlCocineroPlatos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlPlatos); 
        //Agregamos las animaciones 
        pnlPlatos.getBtnInformacion().addMouseListener(new BtnsHover(pnlPlatos.getBtnInformacion()));
        pnlPlatos.getBtnIngresar().addMouseListener(new BtnsHover(pnlPlatos.getBtnIngresar())); 
        pnlPlatos.getBtnModificar().addMouseListener(new BtnsHover(pnlPlatos.getBtnModificar())); 
        
        TblEstilo.tituloTbl(pnlPlatos.getTblPlatos());
    }
}
