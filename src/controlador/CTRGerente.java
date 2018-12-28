/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.GerenteUI.PnlGerenteCompras;
import vista.GerenteUI.PnlGerenteContratos;
import vista.GerenteUI.PnlGerentePagos;
import vista.GerenteUI.PnlGerentePlatos;
import vista.GerenteUI.PnlGerenteVentas;
import vista.GerenteUI.PnlMenuGerente;
import vista.PnlBienvenido;
import vista.VtnPrincipal;

/**
 *
 * @author Usuario
 */
public class CTRGerente {
    
    private VtnPrincipal vtnPrin; 
    private PnlMenuGerente pnlMenu; 
    private PnlBienvenido pnlBienvenido; 

    public CTRGerente(VtnPrincipal vtnPrin, PnlMenuGerente pnlMenu, PnlBienvenido pnlBienvenido) {
        this.vtnPrin = vtnPrin;
        this.pnlMenu = pnlMenu;
        this.pnlBienvenido = pnlBienvenido;
        
        CTRMaster.cambioPanel(vtnPrin.getPnlMenu(), pnlMenu);
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlBienvenido);
    }
    
    public void iniciar(){ 
        System.out.println("Iniciamos el CTR gerente.");
        //Agregamos las animaciones  
        pnlMenu.getBtnCompras().addMouseListener(new CTRBtns(pnlMenu.getBtnCompras())); 
        pnlMenu.getBtnContratos().addMouseListener(new CTRBtns(pnlMenu.getBtnContratos()));
        pnlMenu.getBtnPagos().addMouseListener(new CTRBtns(pnlMenu.getBtnPagos())); 
        pnlMenu.getBtnPlatos().addMouseListener(new CTRBtns(pnlMenu.getBtnPlatos())); 
        pnlMenu.getBtnVentas().addMouseListener(new CTRBtns(pnlMenu.getBtnVentas())); 
        
        //Le asignamos una accion al dar click a un boton          
        pnlMenu.getBtnCompras().addActionListener(e -> compras());
        pnlMenu.getBtnContratos().addActionListener(e -> contratos());
        pnlMenu.getBtnPagos().addActionListener(e -> pagos());
        pnlMenu.getBtnPlatos().addActionListener(e -> platos());
        pnlMenu.getBtnVentas().addActionListener(e -> ventas());
    }
    
    public void compras(){ 
        //Repintamos el panel principal 
        PnlGerenteCompras pnlCompras = new PnlGerenteCompras(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlCompras);
        //Agregamos animaciones  
        pnlCompras.getBtnInformacion().addMouseListener(new CTRBtns(pnlCompras.getBtnInformacion())); 
        pnlCompras.getBtnReporte().addMouseListener(new CTRBtns(pnlCompras.getBtnReporte())); 
    }
    
    public void contratos(){ 
        //Repintamos el panel principal  
        PnlGerenteContratos pnlContratos = new PnlGerenteContratos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlContratos); 
        //Agregamos las animaciones
        pnlContratos.getBtnArchivar().addMouseListener(new CTRBtns(pnlContratos.getBtnArchivar()));
        pnlContratos.getBtnIngresar().addMouseListener(new CTRBtns(pnlContratos.getBtnIngresar())); 
        pnlContratos.getBtnModificar().addMouseListener(new CTRBtns(pnlContratos.getBtnModificar())); 
    }
    
    public void pagos(){ 
        //Repintamos el panel principal  
        PnlGerentePagos pnlPagos = new PnlGerentePagos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlPagos); 
        //Agregamos las animaciones  
        pnlPagos.getBtnEliminar().addMouseListener(new CTRBtns(pnlPagos.getBtnEliminar()));
        pnlPagos.getBtnInformacion().addMouseListener(new CTRBtns(pnlPagos.getBtnInformacion()));
        pnlPagos.getBtnModificar().addMouseListener(new CTRBtns(pnlPagos.getBtnModificar()));
        pnlPagos.getBtnPendientes().addMouseListener(new CTRBtns(pnlPagos.getBtnPendientes()));
        pnlPagos.getBtnRealizar().addMouseListener(new CTRBtns(pnlPagos.getBtnRealizar()));
        pnlPagos.getBtnReporte().addMouseListener(new CTRBtns(pnlPagos.getBtnReporte()));
    }
    
    public void platos(){ 
        //Repintamos el panel principal  
        PnlGerentePlatos pnlPlatos = new PnlGerentePlatos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlPlatos);
        //Agregamos las animaciones a los btns 
        pnlPlatos.getBtnEliminar().addMouseListener(new CTRBtns(pnlPlatos.getBtnEliminar()));
        pnlPlatos.getBtnIngresar().addMouseListener(new CTRBtns(pnlPlatos.getBtnIngresar()));
        pnlPlatos.getBtnModificar().addMouseListener(new CTRBtns(pnlPlatos.getBtnModificar()));
    }
    
    public void ventas(){ 
        //Repintamos el panel principal  
        PnlGerenteVentas pnlVentas = new PnlGerenteVentas(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlVentas); 
        //Agregamos las animaciones  
        pnlVentas.getBtnInformacion().addMouseListener(new CTRBtns(pnlVentas.getBtnInformacion()));
        pnlVentas.getBtnReporte().addMouseListener(new CTRBtns(pnlVentas.getBtnReporte()));
    }
    
}
