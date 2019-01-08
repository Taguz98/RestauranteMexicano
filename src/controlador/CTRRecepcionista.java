package controlador;

import modelo.estilo.BtnsHover;
import modelo.estilo.TblEstilo;
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
    private final VtnPrincipal vtnPrin; 
    private final PnlMenuRecepcionista pnlMenu; 
    private final PnlBienvenido pnlBienvenido; 

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
        pnlMenu.getBtnAsistencia().addMouseListener(new BtnsHover(pnlMenu.getBtnAsistencia()));
        pnlMenu.getBtnMesas().addMouseListener(new BtnsHover(pnlMenu.getBtnMesas()));
        pnlMenu.getBtnPedidos().addMouseListener(new BtnsHover(pnlMenu.getBtnPedidos()));
        pnlMenu.getBtnReservas().addMouseListener(new BtnsHover(pnlMenu.getBtnReservas()));
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
        pnlAsistencia.getBtnInformacion().addMouseListener(new BtnsHover(pnlAsistencia.getBtnInformacion()));
        pnlAsistencia.getBtnIngresar().addMouseListener(new BtnsHover(pnlAsistencia.getBtnIngresar()));
        
        TblEstilo.tituloTbl(pnlAsistencia.getTblAsistencia());
    }
    
    public void mesas(){ 
        //Repintamos el panel principal  
        PnlRecepcionistaMesas pnlMesas = new PnlRecepcionistaMesas(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlMesas);
        //Agreamos las animaciones a cada btn 
        pnlMesas.getBtnInformacion().addMouseListener(new BtnsHover(pnlMesas.getBtnInformacion()));
        pnlMesas.getBtnOcupado().addMouseListener(new BtnsHover(pnlMesas.getBtnOcupado()));
        
        TblEstilo.tituloTbl(pnlMesas.getTblMesas());
    }
    
    public void pedidos(){ 
        //Repintamos el panel principal  
        PnlRecepcionistaPedidos pnlPedidos = new PnlRecepcionistaPedidos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlPedidos);
        //Agregamos las animaciones  
        pnlPedidos.getBtnEditar().addMouseListener(new BtnsHover(pnlPedidos.getBtnEditar()));
        pnlPedidos.getBtnInformacion().addMouseListener(new BtnsHover(pnlPedidos.getBtnInformacion()));
        pnlPedidos.getBtnIngresar().addMouseListener(new BtnsHover(pnlPedidos.getBtnIngresar()));
        
        TblEstilo.tituloTbl(pnlPedidos.getTblPedidos());
    }
    
    public void reservas(){ 
        //Repintamos el panel  
        PnlRecepcionistaReservas pnlReservas = new PnlRecepcionistaReservas(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlReservas); 
        //Agregamos las animaciones  
        pnlReservas.getBtnEditar().addMouseListener(new BtnsHover(pnlReservas.getBtnEditar()));
        pnlReservas.getBtnInformacion().addMouseListener(new BtnsHover(pnlReservas.getBtnInformacion()));
        pnlReservas.getBtnIngresar().addMouseListener(new BtnsHover(pnlReservas.getBtnIngresar()));
        
        TblEstilo.tituloTbl(pnlReservas.getTblReservas());
    }
}
