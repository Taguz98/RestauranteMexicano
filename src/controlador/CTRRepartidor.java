package controlador;

import modelo.estilo.BtnsHover;
import modelo.estilo.TblEstilo;
import vista.PnlBienvenido;
import vista.RepartidorUI.PnlMenuRepartidor;
import vista.RepartidorUI.PnlRepartidorPedidos;
import vista.VtnPrincipal;

/**
 *
 * @author Usuario
 */
public class CTRRepartidor {
    
    private final VtnPrincipal vtnPrin; 
    private final PnlMenuRepartidor pnlMenu; 
    private final PnlBienvenido pnlBienvenido; 

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
        pnlMenu.getBtnPedidos().addMouseListener(new BtnsHover(pnlMenu.getBtnPedidos()));
        //Asignamos una accion a cada btn  
        pnlMenu.getBtnPedidos().addActionListener(e -> pedidos());
    }
    
    public void pedidos(){ 
        //Repintamos el panel  
        PnlRepartidorPedidos pnlPedidos = new PnlRepartidorPedidos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlPedidos);
        //Agregamos las animaciones 
        pnlPedidos.getBtnEntregado().addMouseListener(new BtnsHover(pnlPedidos.getBtnEntregado()));
        pnlPedidos.getBtnInformacion().addMouseListener(new BtnsHover(pnlPedidos.getBtnInformacion()));
        
        TblEstilo.tituloTbl(pnlPedidos.getTblPedidos());
    }
    
}
