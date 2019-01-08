package controlador;

import java.awt.Color;
import modelo.estilo.BtnsHover;
import modelo.estilo.TblEstilo;
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
    
    private final VtnPrincipal vtnPrin; 
    private final PnlMenuGerente pnlMenu; 
    private final PnlBienvenido pnlBienvenido; 

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
        pnlMenu.getBtnCompras().addMouseListener(new BtnsHover(pnlMenu.getBtnCompras())); 
        pnlMenu.getBtnContratos().addMouseListener(new BtnsHover(pnlMenu.getBtnContratos()));
        pnlMenu.getBtnPagos().addMouseListener(new BtnsHover(pnlMenu.getBtnPagos())); 
        pnlMenu.getBtnPlatos().addMouseListener(new BtnsHover(pnlMenu.getBtnPlatos())); 
        pnlMenu.getBtnVentas().addMouseListener(new BtnsHover(pnlMenu.getBtnVentas())); 
        
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
        pnlCompras.getBtnInformacion().addMouseListener(new BtnsHover(pnlCompras.getBtnInformacion())); 
        pnlCompras.getBtnReporte().addMouseListener(new BtnsHover(pnlCompras.getBtnReporte())); 
        
        TblEstilo.tituloTbl(pnlCompras.getTblCompras());
        
        //Para pintarlo al dar click  aqui 
        pnlMenu.getBtnCompras().setBackground(new Color(86, 171, 96));
    }
    
    public void contratos(){ 
        //Repintamos el panel principal  
        PnlGerenteContratos pnlContratos = new PnlGerenteContratos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlContratos); 
        //Agregamos las animaciones
        pnlContratos.getBtnArchivar().addMouseListener(new BtnsHover(pnlContratos.getBtnArchivar()));
        pnlContratos.getBtnIngresar().addMouseListener(new BtnsHover(pnlContratos.getBtnIngresar())); 
        pnlContratos.getBtnModificar().addMouseListener(new BtnsHover(pnlContratos.getBtnModificar())); 
        
        TblEstilo.tituloTbl(pnlContratos.getTblContratos());
    }
    
    public void pagos(){ 
        //Repintamos el panel principal  
        PnlGerentePagos pnlPagos = new PnlGerentePagos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlPagos); 
        //Agregamos las animaciones  
        pnlPagos.getBtnEliminar().addMouseListener(new BtnsHover(pnlPagos.getBtnEliminar()));
        pnlPagos.getBtnInformacion().addMouseListener(new BtnsHover(pnlPagos.getBtnInformacion()));
        pnlPagos.getBtnModificar().addMouseListener(new BtnsHover(pnlPagos.getBtnModificar()));
        pnlPagos.getBtnPendientes().addMouseListener(new BtnsHover(pnlPagos.getBtnPendientes()));
        pnlPagos.getBtnRealizar().addMouseListener(new BtnsHover(pnlPagos.getBtnRealizar()));
        pnlPagos.getBtnReporte().addMouseListener(new BtnsHover(pnlPagos.getBtnReporte()));
        
        TblEstilo.tituloTbl(pnlPagos.getTblPagos());
    }
    
    public void platos(){ 
        //Repintamos el panel principal  
        PnlGerentePlatos pnlPlatos = new PnlGerentePlatos(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlPlatos);
        //Agregamos las animaciones a los btns 
        pnlPlatos.getBtnEliminar().addMouseListener(new BtnsHover(pnlPlatos.getBtnEliminar()));
        pnlPlatos.getBtnIngresar().addMouseListener(new BtnsHover(pnlPlatos.getBtnIngresar()));
        pnlPlatos.getBtnModificar().addMouseListener(new BtnsHover(pnlPlatos.getBtnModificar()));
        
        TblEstilo.tituloTbl(pnlPlatos.getTblPlatos()); 
    }
    
    public void ventas(){ 
        //Repintamos el panel principal  
        PnlGerenteVentas pnlVentas = new PnlGerenteVentas(); 
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), pnlVentas); 
        //Agregamos las animaciones  
        pnlVentas.getBtnInformacion().addMouseListener(new BtnsHover(pnlVentas.getBtnInformacion()));
        pnlVentas.getBtnReporte().addMouseListener(new BtnsHover(pnlVentas.getBtnReporte()));
        
        TblEstilo.tituloTbl(pnlVentas.getTblVentas());
    }
    
}
