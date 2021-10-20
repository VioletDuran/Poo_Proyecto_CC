/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.*;
import java.io.*;

/**
 *
 * @author Sergio
 */
public class ConsultaCiudadana {
    
    public static void main(String [] args) throws IOException{
        ManejoDeColecciones manejo = new ManejoDeColecciones();
        manejo.generarConsultasBinarias();
        manejo.generarConsultasMultiples();
        MenuPrincipal llamadoMenu = new MenuPrincipal(manejo);
        llamadoMenu.setVisible(true);
    }
}
