/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Arrays;
import vista.BodegueroUI.PnlMenuBodeguero;
import vista.CajeroUI.PnlMenuCajero;
import vista.CocineroUI.PnlMenuCocinero;
import vista.GerenteUI.PnlMenuGerente;
import vista.MeseroUI.PnlMenuMesero;
import vista.PnlBienvenido;
import vista.PnlInicio;
import vista.VtnPrincipal;
import vista.PnlLogin;
import vista.RecepcionistaUI.PnlMenuRecepcionista;
import vista.RepartidorUI.PnlMenuRepartidor;

/**
 *
 * @author Usuario
 */
public class CTRLogin extends Thread {

    private VtnPrincipal vtnPrin;
    private PnlLogin pnlLogin;

    //Crearemos un objeto de bienvenida para enviarlo cuando se logee 
    PnlBienvenido pnlBienvenida = new PnlBienvenido();

    public CTRLogin(VtnPrincipal vtnPrin, PnlLogin pnlLogin) {
        this.vtnPrin = vtnPrin;
        this.pnlLogin = pnlLogin;

        vtnPrin.setVisible(true);

        //Cambiamos al panel de inicio de sesion siempre al iniciar nuestro programa  
        CTRMaster.cambioPanel(vtnPrin.getPnlMenu(), pnlLogin);
        //Inciamos el panel inicio apra enviarlo 
        PnlInicio ini = new PnlInicio();

        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), ini);

        vtnPrin.getBtnSalir().setVisible(false);

        //Agrego las animaciones a los btns  
        vtnPrin.getBtnSalir().addMouseListener(new CTRBtns(vtnPrin.getBtnSalir()));
        pnlLogin.getBtnEntrar().addMouseListener(new CTRBtns(pnlLogin.getBtnEntrar()));
        
        //Ocusltamos los btns  de tipo de empleado  
        //ocultarBtns();
    }

    @Override
    public void run() {
        pnlLogin.getBtnEntrar().addActionListener(e -> entrar());
        vtnPrin.getBtnSalir().addActionListener(e -> salir());
        
        //Agregamos las acciones a los btns 
        pnlLogin.getBtnBodeguero().addActionListener(e -> bodeguero());
        pnlLogin.getBtnCajero().addActionListener(e -> cajero());
        pnlLogin.getBtnCocinero().addActionListener(e -> cocinero());
        pnlLogin.getBtnGerente().addActionListener(e -> gerente());
        pnlLogin.getBtnMesero().addActionListener(e -> mesero());
        pnlLogin.getBtnRecepcionista().addActionListener(e -> recepcionista());
        pnlLogin.getBtnRepartidor().addActionListener(e -> repartidor());
    }
    
    private void ocultarBtns(){ 
        pnlLogin.getBtnBodeguero().setVisible(false);
        pnlLogin.getBtnCajero().setVisible(false);
        pnlLogin.getBtnCocinero().setVisible(false);
        pnlLogin.getBtnGerente().setVisible(false);
        pnlLogin.getBtnMesero().setVisible(false);
        pnlLogin.getBtnRecepcionista().setVisible(false);
        pnlLogin.getBtnRepartidor().setVisible(false);
    }

    public void entrar() {

        System.out.println("Le dimos click a entrar");

        boolean entrar = true;

        String cedula = pnlLogin.getTxtCedula().getText();
        String pass = Arrays.toString(pnlLogin.getTxtPass().getPassword());

        //Borramos los espacios que esten sobrando  
        cedula = cedula.trim();
        pass = pass.trim();

        //Pasamos la cedula en minusculas solo por ahora porque ingresara texto y no numeros
        cedula = cedula.toLowerCase();

        if (cedula.length() == 0) {
            entrar = false;
        }

        if (pass.length() == 0) {
            entrar = false;
        }

        //Aqui iremos comprabando que se escribio en cedula para abrir el menu que corresponda 
        //Ahora nos vasamos en el tipo de empleado  
        //En cada uno se creara un objeto del tipo de empleado que le toca y se iniciara su controlador
        //Y luego inciaremos el ctrolador que corresponda
        if (entrar) {
            switch (cedula) {
                case "bodeguero":
                    bodeguero();
                    break;
                case "cajero":
                    cajero();

                    break;
                case "cocinero":
                    cocinero();
                    break;
                case "gerente":
                    gerente();
                    break;
                case "mesero":
                    mesero();
                    break;
                case "recepcionista":
                    recepcionista();
                    break;
                case "repartidor":
                    repartidor();
                    break;

                default:
                    System.out.println("No entramos a ninguno de los casos.");
                    break;
            }
            vtnPrin.getBtnSalir().setVisible(true);

            limpiarLogin();
        } else {
            System.out.println("No puede dejar los cambios vacios.");
        }

    }

    public void salir() {
        //Repintamos los panles con el panel de login y con el de inicio
        CTRMaster.cambioPanel(vtnPrin.getPnlMenu(), pnlLogin);

        //Inciamos el panel inicio apra enviarlo 
        PnlInicio ini = new PnlInicio();
        CTRMaster.cambioPanel(vtnPrin.getPnlPrincipal(), ini);

        System.out.println("Le dimos click a salir");
        vtnPrin.getBtnSalir().setVisible(false);
        
        limpiarLogin();
    }

    //Este metodo limpiara los txt cambiando sus txt a ""
    public void limpiarLogin() {
        pnlLogin.getTxtCedula().setText("");
        pnlLogin.getTxtPass().setText("");
    }

    //Las funciones que se ejecutaran si se es un de los tipos de empleado   
    public void bodeguero() {
        PnlMenuBodeguero pnlMenuBodeguero = new PnlMenuBodeguero();

        CTRBodeguero ctrBodeguero = new CTRBodeguero(vtnPrin, pnlMenuBodeguero, pnlBienvenida);
        ctrBodeguero.iniciar();
        
        vtnPrin.getBtnSalir().setVisible(true);
    }

    public void cajero() {
        PnlMenuCajero pnlMenuCajero = new PnlMenuCajero();

        CTRCajero ctrCajero = new CTRCajero(vtnPrin, pnlMenuCajero, pnlBienvenida);
        ctrCajero.iniciar();
        
        vtnPrin.getBtnSalir().setVisible(true);
    }

    public void cocinero() {
        PnlMenuCocinero pnlMenuCocinero = new PnlMenuCocinero();

        CTRCocinero ctrCocinero = new CTRCocinero(vtnPrin, pnlMenuCocinero, pnlBienvenida);
        ctrCocinero.iniciar();
        
        vtnPrin.getBtnSalir().setVisible(true);
    }

    public void gerente() {
        PnlMenuGerente pnlMenuGerente = new PnlMenuGerente();

        CTRGerente ctrGerente = new CTRGerente(vtnPrin, pnlMenuGerente, pnlBienvenida);
        ctrGerente.iniciar();
        
        vtnPrin.getBtnSalir().setVisible(true);
    }

    public void mesero() {
        PnlMenuMesero pnlMenuMesero = new PnlMenuMesero();

        CTRMesero ctrMesero = new CTRMesero(vtnPrin, pnlMenuMesero, pnlBienvenida);
        ctrMesero.iniciar();
        
        vtnPrin.getBtnSalir().setVisible(true);
    }

    public void recepcionista() {
        PnlMenuRecepcionista pnlMenuRecepcionista = new PnlMenuRecepcionista();

        CTRRecepcionista ctrRecepcionista = new CTRRecepcionista(vtnPrin, pnlMenuRecepcionista, pnlBienvenida);
        ctrRecepcionista.iniciar();
        
        vtnPrin.getBtnSalir().setVisible(true);
    }

    public void repartidor() {
        PnlMenuRepartidor pnlMenuRepartidor = new PnlMenuRepartidor();

        CTRRepartidor ctrRepartidor = new CTRRepartidor(vtnPrin, pnlMenuRepartidor, pnlBienvenida);
        ctrRepartidor.iniciar();
        
        vtnPrin.getBtnSalir().setVisible(true);
    }

}
