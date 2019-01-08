package controlador;

import modelo.estilo.BtnsHover;
import modelo.estilo.TblEstilo;
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
    
    private final VtnPrincipal vtnPrin;  
    private final PnlMenuCajero pnlMenu; 
    private final PnlBienvenido pnlBienvenido; 

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
        pnlMenu.getBtnCaja().addMouseListener(new BtnsHover(pnlMenu.getBtnCaja())); 
        pnlMenu.getBtnVentas().addMouseListener(new BtnsHover(pnlMenu.getBtnVentas())); 
        
        //Asignamos una metodo al dar click a un btn  
        pnlMenu.getBtnCaja().addActionListener(e -> caja()); 
        pnlMenu.getBtnVentas().addActionListener(e -> ventas()); 
    }
    
    public void caja(){ 
        //Repintamos el panel principal  
        PnlCajeroCaja pnlCaja = new PnlCajeroCaja(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlCaja); 
        
        //Agregamos las animaciones a los btns  
        pnlCaja.getBtnEliminar().addMouseListener(new BtnsHover(pnlCaja.getBtnEliminar())); 
        pnlCaja.getBtnIngresar().addMouseListener(new BtnsHover(pnlCaja.getBtnIngresar())); 
        pnlCaja.getBtnModificar().addMouseListener(new BtnsHover(pnlCaja.getBtnModificar())); 
        
        //Agregamos el estilo a las tablas  
        TblEstilo.tituloTbl(pnlCaja.getTblCaja());
    }
    
    public void ventas(){ 
        //Repintamos el panel 
        PnlCajeroVentas pnlVentas = new PnlCajeroVentas(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlVentas);
        
        //Agregamos las animaciones a los btns  
        pnlVentas.getBtnImprimir().addMouseListener(new BtnsHover(pnlVentas.getBtnImprimir()));
        pnlVentas.getBtnVer().addMouseListener(new BtnsHover(pnlVentas.getBtnVer()));
        
        //Agregamos el estilo a las tablas  
        TblEstilo.tituloTbl(pnlVentas.getTblVentas());
    }
    
    
    
}
