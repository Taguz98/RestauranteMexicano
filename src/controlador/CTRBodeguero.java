package controlador;

import modelo.estilo.BtnsHover;
import controlador.CTRMaster;
import modelo.estilo.TblEstilo;
import vista.BodegueroUI.PnlBodegueroFacturas;
import vista.BodegueroUI.PnlBodegueroProductos;
import vista.BodegueroUI.PnlMenuBodeguero;
import vista.PnlBienvenido;
import vista.VtnPrincipal;

/**
 *
 * @author Usuario
 */
public class CTRBodeguero {
    
    private final VtnPrincipal vtnPrin; 
    private final PnlMenuBodeguero pnlMenu;
    private final PnlBienvenido pnlBienvenido; 
    
    public CTRBodeguero(VtnPrincipal vtnPrin, PnlMenuBodeguero pnlMenu, PnlBienvenido pnlBienvenido){
        this.vtnPrin = vtnPrin; 
        this.pnlMenu = pnlMenu; 
        this.pnlBienvenido = pnlBienvenido; 
        
        CTRMaster.cambioPanel(vtnPrin.getPnlMenu(), pnlMenu); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlBienvenido); 
    }
    
    public void iniciar(){ 
        System.out.println("Iniciamos el CTR bodeguero.");
        
        //Agregaremos las animaciones a todos los btns de este panel  
        pnlMenu.getBtnFacturas().addMouseListener(new BtnsHover(pnlMenu.getBtnFacturas()));
        pnlMenu.getBtnProductos().addMouseListener(new BtnsHover(pnlMenu.getBtnProductos()));
        
        //Le asignamos un metodo al ejecutar una accion a un boton 
        pnlMenu.getBtnFacturas().addActionListener(e -> facturas());
        pnlMenu.getBtnProductos().addActionListener(e -> productos());
     }
    
    //Cramos el metodo que se ejecutar al hacer click en productos  
    public void productos(){ 
        //Creamos un objeto de bodegeruo productos  
        PnlBodegueroProductos pnlProductos = new PnlBodegueroProductos(); 
        //Repitamos el panel principal
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlProductos);
        
        //Agrego las animaciones a los btns de produtos 
        pnlProductos.getBtnEliminar().addMouseListener(new BtnsHover(pnlProductos.getBtnEliminar())); 
        pnlProductos.getBtnIngresar().addMouseListener(new BtnsHover(pnlProductos.getBtnIngresar())); 
        pnlProductos.getBtnModificar().addMouseListener(new BtnsHover(pnlProductos.getBtnModificar())); 
        
        //Agregamos el estilo a las tablas 
        TblEstilo.tituloTbl(pnlProductos.getTblProductos()); 
    }
    
    public void facturas(){
        //Creamos el objeto de bodeguero factura 
        PnlBodegueroFacturas pnlFacturas = new PnlBodegueroFacturas(); 
        //Repintamos el panel principal  
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlFacturas); 
        //Agregamos animaciones a los botones   
        pnlFacturas.getBtnInformacion().addMouseListener(new BtnsHover(pnlFacturas.getBtnInformacion()));
        pnlFacturas.getBtnIngresar().addMouseListener(new BtnsHover(pnlFacturas.getBtnIngresar())); 
        pnlFacturas.getBtnModificar().addMouseListener(new BtnsHover(pnlFacturas.getBtnModificar())); 
        
        //Agregamos el estilo a la tabla  
        TblEstilo.tituloTbl(pnlFacturas.getTblFacturas());
        
    }
    
    
    
}
