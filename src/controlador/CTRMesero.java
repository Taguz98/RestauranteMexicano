package controlador;

import modelo.estilo.BtnsHover;
import modelo.estilo.TblEstilo;
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
    
    private final VtnPrincipal vtnPrin; 
    private final PnlMenuMesero pnlMenu; 
    private final PnlBienvenido pnlBienvenido; 

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
        pnlMenu.getBtnMesas().addMouseListener(new BtnsHover(pnlMenu.getBtnMesas()));
        pnlMenu.getBtnOrdenes().addMouseListener(new BtnsHover(pnlMenu.getBtnOrdenes()));
        //Agregamos una accion al dar clik a un btn
        pnlMenu.getBtnMesas().addActionListener(e -> mesas()); 
        pnlMenu.getBtnOrdenes().addActionListener(e -> ordenes()); 
    }
    
    public void mesas(){ 
        //Repintamos el pnl principal  
        PnlMeseroMesas pnlMesas = new PnlMeseroMesas(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlMesas);
        //Agregamos las animaciones a los btns  
        pnlMesas.getBtnInformacion().addMouseListener(new BtnsHover(pnlMesas.getBtnInformacion()));
        pnlMesas.getBtnLibre().addMouseListener(new BtnsHover(pnlMesas.getBtnLibre()));
        
        TblEstilo.tituloTbl(pnlMesas.getTblMesas());
    }
    
    public void ordenes(){ 
        //Repintamos el pnl principal  
        PnlMeseroOrdenes pnlOrdenes = new PnlMeseroOrdenes(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlOrdenes);
        //Agregamos las animaciones 
        pnlOrdenes.getBtnActualizar().addMouseListener(new BtnsHover(pnlOrdenes.getBtnActualizar()));
        pnlOrdenes.getBtnEntregado().addMouseListener(new BtnsHover(pnlOrdenes.getBtnEntregado()));
        pnlOrdenes.getBtnIngresar().addMouseListener(new BtnsHover(pnlOrdenes.getBtnIngresar()));
        
        TblEstilo.tituloTbl(pnlOrdenes.getTblOrdenes());
    }
    
}
