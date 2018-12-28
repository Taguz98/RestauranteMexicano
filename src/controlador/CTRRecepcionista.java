/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.PnlBienvenido;
import vista.RecepcionistaUI.PnlMenuRecepcionista;
import vista.RecepcionistaUI.PnlRecepcionistaAsistencia;
import vista.RecepcionistaUI.PnlRecepcionistaMesas;
import vista.RecepcionistaUI.PnlRecepcionistaPedidos;
import vista.RecepcionistaUI.PnlRecepcionistaReservas;
import vista.VtnPrincipal;

/**
 *
 * @author Usuario
 */
public class CTRRecepcionista {
    private VtnPrincipal vtnPrin; 
    private PnlMenuRecepcionista pnlMenu; 
    private PnlBienvenido pnlBienvenido; 

    public CTRRecepcionista(VtnPrincipal vtnPrin, PnlMenuRecepcionista pnlMenu, PnlBienvenido pnlBienvenido) {
        this.vtnPrin = vtnPrin;
        this.pnlMenu = pnlMenu;
        this.pnlBienvenido = pnlBienvenido;
        
        //Repintamos los paneles 
        CTRMaster.cambioPanel(vtnPrin.getPnlMenu(), pnlMenu);
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlBienvenido);
    }
    
    public void iniciar(){ 
        System.out.println("Iniciamos el CTR recepcionista.");
        //Agregamos las animaciones a los btns  
        pnlMenu.getBtnAsistencia().addMouseListener(new CTRBtns(pnlMenu.getBtnAsistencia()));
        pnlMenu.getBtnMesas().addMouseListener(new CTRBtns(pnlMenu.getBtnMesas()));
        pnlMenu.getBtnPedidos().addMouseListener(new CTRBtns(pnlMenu.getBtnPedidos()));
        pnlMenu.getBtnReservas().addMouseListener(new CTRBtns(pnlMenu.getBtnReservas()));
        //Agregamos una accion a cada btn 
        pnlMenu.getBtnAsistencia().addActionListener(e -> asistencia()); 
        pnlMenu.getBtnMesas().addActionListener(e -> mesas());
        pnlMenu.getBtnPedidos().addActionListener(e -> pedidos()); 
        pnlMenu.getBtnReservas().addActionListener(e -> reservas()); 
    }
    
    public void asistencia(){ 
        //Repintamos el panel principal  
        PnlRecepcionistaAsistencia pnlAsistencia = new PnlRecepcionistaAsistencia(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlAsistencia); 
        //Agregamos las animaciones a cada btn 
        pnlAsistencia.getBtnInformacion().addMouseListener(new CTRBtns(pnlAsistencia.getBtnInformacion()));
        pnlAsistencia.getBtnIngresar().addMouseListener(new CTRBtns(pnlAsistencia.getBtnIngresar()));
    }
    
    public void mesas(){ 
        //Repintamos el panel principal  
        PnlRecepcionistaMesas pnlMesas = new PnlRecepcionistaMesas(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlMesas);
        //Agreamos las animaciones a cada btn 
        pnlMesas.getBtnInformacion().addMouseListener(new CTRBtns(pnlMesas.getBtnInformacion()));
        pnlMesas.getBtnOcupado().addMouseListener(new CTRBtns(pnlMesas.getBtnOcupado()));
    }
    
    public void pedidos(){ 
        //Repintamos el panel principal  
        PnlRecepcionistaPedidos pnlPedidos = new PnlRecepcionistaPedidos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlPedidos);
        //Agregamos las animaciones  
        pnlPedidos.getBtnEditar().addMouseListener(new CTRBtns(pnlPedidos.getBtnEditar()));
        pnlPedidos.getBtnInformacion().addMouseListener(new CTRBtns(pnlPedidos.getBtnInformacion()));
        pnlPedidos.getBtnIngresar().addMouseListener(new CTRBtns(pnlPedidos.getBtnIngresar()));
    }
    
    public void reservas(){ 
        //Repintamos el panel  
        PnlRecepcionistaReservas pnlReservas = new PnlRecepcionistaReservas(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlReservas); 
        //Agregamos las animaciones  
        pnlReservas.getBtnEditar().addMouseListener(new CTRBtns(pnlReservas.getBtnEditar()));
        pnlReservas.getBtnInformacion().addMouseListener(new CTRBtns(pnlReservas.getBtnInformacion()));
        pnlReservas.getBtnIngresar().addMouseListener(new CTRBtns(pnlReservas.getBtnIngresar()));
    }
}
